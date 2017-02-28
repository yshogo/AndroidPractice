package com.example.yamadashougo.popup_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        //カスタマー情報を表示する場所
        private Button customerInfomation;

        //一括活性化の勉強用ボタンのID１を保存しておく場所
        private Button positiveButton2;
        private Button positiveButton3;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //activity_mainのidがcustomerInfomationのボタンをセットして非活性化
            customerInfomation = (Button)findViewById(R.id.customerInfomation);
            customerInfomation.setEnabled(false);

        /*
         *activity_mainのidが
         * twoとthreeのボタンをセットして非活性化
         */
            positiveButton2 = (Button)findViewById(R.id.two);
            positiveButton3 = (Button)findViewById(R.id.three);
            positiveButton2.setEnabled(false);
            positiveButton3.setEnabled(false);
        }

        //activity_mainのIDがcustomerInfomationのボタンが活性化
        public void newUser(View v){
            customerInfomation.setEnabled(true);
        }

        //activity_mainのIDがpositiveButton2とpositiveButton3のボタンが活性化
        public void positiveButton(View v){
            positiveButton2.setEnabled(true);
            positiveButton3.setEnabled(true);

        }

        //positiveButtonが呼ばれて活性化されたボタンをクリックするとアクティビティジャンプ
        public void positiveButton2(View v){
            Intent intent = new Intent(MainActivity.this, PopupStudy.class);
            startActivity(intent);
        }
    }