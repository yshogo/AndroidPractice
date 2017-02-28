package com.example.yamadashougo.oes_practice;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by yamadashougo on 2016/07/30.
 */
@DatabaseTable(tableName = "setting" )
public class Setting {

    @DatabaseField(generatedId=true)    // For Autoincrement
    private Integer id;

    @DatabaseField
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
