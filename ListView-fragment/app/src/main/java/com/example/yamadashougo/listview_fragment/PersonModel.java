package com.example.yamadashougo.listview_fragment;

/**
 * Created by yamadashougo on 2016/07/16.
 */
public class PersonModel {

    private String name;
    private int birth;

    public PersonModel(String name, int birth){
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return this.name;
    }

    public int getBirth() {
        return this.birth;
    }
}
