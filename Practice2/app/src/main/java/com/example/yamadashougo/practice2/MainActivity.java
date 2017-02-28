package com.example.yamadashougo.practice2;

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
    }

    /**
     * 「ここをクリックする」ボタンを押すと呼ばれる
     * 「ここが押せるようになります」ボタンが押せるようになる
     * @param v ビュー
     */
    public void newUser(View v){
        customerInfomation.setEnabled(true);
    }

    /**
     * 「活性化」ボタンを押すと呼ばれる
     * 二つの「画面遷移」が押せるようになる
     * @param v ビュー
     */
    public void positiveButton(View v){
        positiveButton2.setEnabled(true);
        positiveButton3.setEnabled(true);

    }

    /**
     * 「画面推移」ボタンが押されると呼ばれる
     * PopupStudyActivityに画面推移する
     * @param v ビュー
     */
    public void positiveButton2(View v){
        Intent intent = new Intent(MainActivity.this, PopupStudyActivity.class);
        startActivity(intent);
    }
}
