package com.example.yamadashougo.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

/**
 * Created by yamadashougo on 2016/07/02.
 */
public class PopupStudy extends AppCompatActivity {

    private PopupWindow popupWin;
    private LinearLayout popupLayout;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_study);
    }

    public void showPopup(View v){
        Toast.makeText(this, "ok", Toast.LENGTH_LONG).show();

        //PopupWindowsのインスタンスを生成し、popupWindowのレイアウトを指定
        popupWin = new PopupWindow(PopupStudy.this);
        popupLayout = (LinearLayout)getLayoutInflater().inflate(R.layout.popup_study_view, null);

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

        // 画面中央に表示
        popupWin.showAtLocation(v.findViewById(R.id.showPopup), Gravity.CENTER, 0, 0);
    }

    public void nextView(View v){
        Toast.makeText(this, "ok", Toast.LENGTH_LONG).show();
    }
}
