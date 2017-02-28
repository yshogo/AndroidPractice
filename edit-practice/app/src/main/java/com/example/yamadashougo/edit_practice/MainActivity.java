package com.example.yamadashougo.edit_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.androidquery.AQuery;

public class MainActivity extends AppCompatActivity implements TextWatcher{


    private Button sendMesseage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendMesseage = (Button)findViewById(R.id.send_message);
        sendMesseage.setEnabled(false);

        EditText edit = (EditText)findViewById(R.id.editText);
        edit.addTextChangedListener(this);

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count,int after) {
        //操作前のEtidTextの状態を取得する
        Toast.makeText(this,"beforeTextChangedが呼ばれました", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        //操作中のEtidTextの状態を取得する
        sendMesseage.setEnabled(true);
        Toast.makeText(this,"onTextChangedが呼ばれました", Toast.LENGTH_LONG).show();

    }

    @Override
    public void afterTextChanged(Editable s) {
        //操作後のEtidTextの状態を取得する
        Toast.makeText(this,"afterTextChangedが呼ばれました", Toast.LENGTH_LONG).show();

    }

}
