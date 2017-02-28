package com.example.yamadashougo.expands_for_structure;

/**
 * データを管理するモデル
 *
 * @author shogo.yamada
 */
public class TestModel {

    private String name;
    private int birth;

    public TestModel(String name,int birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public int getBirth() {
        return birth;
    }
}