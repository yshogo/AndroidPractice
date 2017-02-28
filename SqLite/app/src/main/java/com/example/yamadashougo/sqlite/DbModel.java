package com.example.yamadashougo.sqlite;

/**
 * Created by yamadashougo on 2016/07/24.
 */
public class DbModel {

    private int id;
    private String note;
    private String lastUpdate;

    public DbModel(int id, String note, String lastUpdate){
        this.id = id;
        this.note = note;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }
}
