package com.example.yamadashougo.ormap_practice;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

/**
 * Created by yamadashougo on 2016/07/14.
 */
public class ORMDatabaseHelper extends OrmLiteSqliteOpenHelper
{
    private static final String DBFILE = "app.db";

    private static int VERSION = 1;

    public ORMDatabaseHelper( Context context )
    {
        super( context, DBFILE, null, VERSION );
    }


    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource cs)
    {
        // Add Table Creation
        try
        {
            TableUtils.createTable(cs, Setting.class);
        }
        catch ( SQLException oops)
        {
            oops.printStackTrace();
        }
        // Add First data insert
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource cs, int oldVersion,
                          int newVersion)
    {
        // Add upgrade operation

    }

}
