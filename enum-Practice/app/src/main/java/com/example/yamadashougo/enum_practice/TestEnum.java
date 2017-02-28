package com.example.yamadashougo.enum_practice;

/**
 * Created by yamadashougo on 2016/08/15.
 */
public enum TestEnum {

    PERSON1("しょうご",23)
    ,PERSON("さくら",23)
    ;

    private String name;
    private int old;

    TestEnum(String name, int old){
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }
}
