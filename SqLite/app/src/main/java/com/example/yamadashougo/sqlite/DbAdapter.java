package com.example.yamadashougo.sqlite;

import android.content.Context;

/**
 * Created by yamadashougo on 2016/07/24.
 */
public class DbAdapter {

    static final String DATABASE_NAME = "mynote.db";
    static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "notes";
    public  final String COL_ID = "_id";
    public static final String COL_NOTE = "note";
    public static final String COL_LASTUPDATE = "lastupdate";

    protected final Context context;
    protected DatabaseHelper dbHelper;
    protected SQLiteDAtabase db;

    public DbAdapter(Context context){
        this.context = context;
        dbHelper = new DatabaseHelper(this.context);
    }


    /**
     * SQLite Open Helper
     */
    private static DatabeseHelper extends SWLiteOpenHelper{

        public DatabaseHelper(Context context){
            super(context, DATABESE_NAME, null, DATABASE_VERSION);
        }

        @Override
                public void onCreate
    }


}
