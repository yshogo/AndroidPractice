package com.example.yamadashougo.ormap_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.j256.ormlite.dao.Dao;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ORMDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        findAll();
    }

    public List<Setting> findAll() {
        ORMDatabaseHelper helper = new ORMDatabaseHelper(this);
        try {
            Dao<Setting, Integer> dao = helper.getDao(Setting.class);
            return dao.queryForAll();
        } catch (Exception e) {
            System.out.println("エラーが発生しました");
            return null;
        } finally {
            helper.close();
        }
    }

}
