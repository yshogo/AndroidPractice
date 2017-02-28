package com.example.yamadashougo.sqlite_practice;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by yamadashougo on 2016/07/24.
 */
public class PersonOpenHelper extends SQLiteOpenHelper {
    final static private int DB_VERSION = 1;

    public PersonOpenHelper(Context context) {
        super(context, null, null, DB_VERSION);
    }

    //newされた時に実行されるメソッド
    @Override
    public void onCreate(SQLiteDatabase db) {
        // table create
        db.execSQL(
                "create table person_table("+
                        "   name text not null,"+
                        "   age text"+
                        ");"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // データベースの変更が生じた場合は、ここに処理を記述する。
    }

    /**
     * insert文を実行するメソッド
     * @param db
     */
    private void insertData(SQLiteDatabase db){
        // table row insert
        db.execSQL("insert into person_table(name,age) values ('本田 圭佑', 24);");
        db.execSQL("insert into person_table(name,age) values ('遠藤 保仁', 30);");
        db.execSQL("insert into person_table(name,age) values ('松井 大輔', 29);");
    }

}
