package com.example.yamadashougo.practice2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamadashougo on 2016/07/02.
 */
public class PopupStudyActivity extends AppCompatActivity {

    //ポップアップウインドウに表示するリストを格納しておく
    private List<String> list;

    //ListViewのアダプター
    private ListViewAdapter adapter;

    //ポップアップウインドウ
    private PopupWindow popupWin;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_study);

        //ヘッダーにタイトル設定する
        TextView showMain = (TextView)findViewById(R.id.popupText);
        showMain.setText("表示");
    }

    /**
     * 「ポップアップウインドウ」ボタンを押すと呼ばれる
     * ポップアップウインドウにレイアウトを設定して表示
     * @param v ビュー
     */
    public void showPopup(View v){

        //ListViewAdapterに渡すリストを生成
        list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //ポップアップウインドウのレイアウトを作成
        popupWin = new PopupWindow(PopupStudyActivity.this);
        LinearLayout popupLayout = (LinearLayout)getLayoutInflater().inflate(R.layout.popup_study_view, null);

        //リストビューIDを取得
        ListView thisListID = (ListView)popupLayout.findViewById(R.id.popupListView);
        adapter = new ListViewAdapter(this, R.layout.list_view, list);

        //リストビューをアダプターにセット
        thisListID.setAdapter(adapter);

        //ポップアップウインドウにレイアウトをセット
        popupWin.setContentView(popupLayout);

        // ポップアップウインドウを表示している時に他のViewを押せないようにする
        popupWin.setOutsideTouchable(true);
        popupWin.setFocusable(true);

        // ポップアップウインドウの表示サイズの設定
        popupWin.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWin.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);

        // ポップアップウインドウを画面中央に表示
        popupWin.showAtLocation(v.findViewById(R.id.showPopup), Gravity.CENTER, 0, 0);
    }

    //ポップップビューのに押した時に表示されるボタンを押した時
    public void nextView(View v){
        Toast.makeText(this, "ok", Toast.LENGTH_LONG).show();

        list.clear();
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");

        adapter.notifyDataSetChanged();
    }

    //ポップアップビューの中にあるリストをクリックすると呼ばれる
    public void getName(View v){

        //リストビューのテキストを取得する
        TextView name = (TextView)v.findViewById(R.id.place);

        //ポップアップビューでされたボタンのテキストを表示するレイアウトをセット
        TextView showMain = (TextView)findViewById(R.id.popupText);
        showMain.setText(name.getText());

        //popupViewを閉じる。
        popupWin.dismiss();
    }

    public void jump(View v){
        Intent intent = new Intent(PopupStudyActivity.this, ConnectActivity.class);
        startActivity(intent);
    }
}
