package com.example.yamadashougo.oes_practice;

/**
 * Created by yamadashougo on 2016/07/30.
 */
public class GridModel {

    private long id;
    private String name;

    public GridModel(int id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
