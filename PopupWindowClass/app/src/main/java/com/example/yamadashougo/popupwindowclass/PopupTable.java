package com.example.yamadashougo.popupwindowclass;

import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by yamadashougo on 2016/07/10.
 */
public class PopupTable {

    private LinearLayout popupLayout;
    private PopupWindow popupWin;
    private View parent;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;


    public PopupTable(LinearLayout popupLayout,final MainActivity activity,View parent){
        this.popupWin = new PopupWindow(activity);
        this.popupLayout = popupLayout;
        this.parent = parent;
    }

    public void showPoupop(View v){

        //PopupWindowにレイアウトをセット
        popupWin.setContentView(popupLayout);

        // タップ時に他のViewでキャッチされないための設定
        popupWin.setOutsideTouchable(true);
        popupWin.setFocusable(true);

        // 表示サイズの設定
        popupWin.setWidth(WindowManager.LayoutParams.MATCH_PARENT);
        popupWin.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);

        // 画面中央に表示
        popupWin.showAtLocation(v.findViewById(R.id.show_popup_window), Gravity.CENTER, 0, 0);

        findButtonId();
        setText();
        clickEvent();

        Button dismissButton = (Button)popupLayout.findViewById(R.id.dismiss);
        dismissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
    }

    private void dismiss(){
        popupWin.dismiss();
    }

    private void findButtonId(){

        btn1 = (Button)popupLayout.findViewById(R.id.Button01);
        btn2 = (Button)popupLayout.findViewById(R.id.Button02);
        btn3 = (Button)popupLayout.findViewById(R.id.Button03);
        btn4 = (Button)popupLayout.findViewById(R.id.Button04);
        btn5 = (Button)popupLayout.findViewById(R.id.Button05);
        btn6 = (Button)popupLayout.findViewById(R.id.Button06);

    }

    private void setText(){

        btn1.setText("トーストセット1");
        btn2.setText("トーストセット2");
        btn3.setText("トーストセット3");
        btn4.setText("トーストセット4");
        btn5.setText("トーストセット5");
        btn6.setText("トーストセット6");

    }

    private void clickEvent(){

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView selectedSetMenu = (TextView)parent.findViewById(R.id.toast_set_name);
                selectedSetMenu.setText(btn1.getText());

                dismiss();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"トーストセット２が押されました",Toast.LENGTH_LONG).show();
                dismiss();
            }
        });
    }
}
