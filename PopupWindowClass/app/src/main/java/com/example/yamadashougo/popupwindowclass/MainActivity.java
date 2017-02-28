package com.example.yamadashougo.popupwindowclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button popupWindowId = (Button)findViewById(R.id.show_popup_window);
        popupWindowId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //現在のレイアウトを取得
                View isLayout = MainActivity.this.getWindow().getDecorView();

                LinearLayout popupLayout = (LinearLayout)getLayoutInflater().inflate(R.layout.popup_view_layout, null);
                PopupTable popup = new PopupTable(popupLayout, MainActivity.this, isLayout);

                popup.showPoupop(view);
            }
        });
    }
}
