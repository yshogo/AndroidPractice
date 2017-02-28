package com.example.yamadashougo.sqlite_practice;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.androidquery.AQuery;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //初期設定
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);

        PersonOpenHelper helper = new PersonOpenHelper(this);
        SQLiteDatabase db = helper.getReadableDatabase();

        //クエリーを発行
        Cursor c = db.query("person_table", new String[] { "name", "age" },
                null, null, null, null, null);

        //ループの判定フラグ
        boolean isEof = c.moveToFirst();

        //次の行にデータがある限り回る
        while (isEof) {
            TextView tv = new TextView(this);
            tv.setText(String.format("%s : %d才", c.getString(0), c.getInt(1)));
            isEof = c.moveToNext();
            layout.addView(tv);
        }
        c.close();

        db.close();
    }
}
