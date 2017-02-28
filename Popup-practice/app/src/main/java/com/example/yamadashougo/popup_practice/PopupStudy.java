package com.example.yamadashougo.popup_practice;

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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamadashougo on 2016/07/02.
 */
public class PopupStudy extends AppCompatActivity {

    private List<String> list;

    private ListViewAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_study);
    }

    //ポップアップビューのボタンが押された時
    public void showPopup(View v){
        Toast.makeText(this, "ok", Toast.LENGTH_LONG).show();

        //PopupWindowsのインスタンスを生成し、popupWindowのレイアウトを指定
        PopupWindow popupWin = new PopupWindow(PopupStudy.this);
        LinearLayout popupLayout = (LinearLayout)getLayoutInflater().inflate(R.layout.popup_study_view, null);

        //アダプターに渡すテキストをリストオブジェクトにセット
        list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //リストビューIDを取得
        ListView thisListID = (ListView)popupLayout.findViewById(R.id.popupListView);
        adapter = new ListViewAdapter(this, R.layout.list_view, list);

        //アダプターのセット
        thisListID.setAdapter(adapter);

        //PopupWindowにレイアウトをセット
        popupWin.setContentView(popupLayout);

        // タップ時に他のViewでキャッチされないための設定
        popupWin.setOutsideTouchable(true);
        popupWin.setFocusable(true);

        // 表示サイズの設定 今回は幅300dp
        float width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 300, getResources().getDisplayMetrics());
        popupWin.setWindowLayoutMode((int) width, WindowManager.LayoutParams.WRAP_CONTENT);
        popupWin.setWidth((int) width);
        popupWin.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
//        popupWin.setHeight(800);

        // 画面中央に表示
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

    public void getName(View v){
        Toast.makeText(this, "ok", Toast.LENGTH_LONG).show();
    }
}
