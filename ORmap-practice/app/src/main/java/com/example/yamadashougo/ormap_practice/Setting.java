package com.example.yamadashougo.ormap_practice;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by yamadashougo on 2016/07/14.
 */
@DatabaseTable(tableName = "setting" )
public class Setting
{
    @DatabaseField(generatedId=true)    // For Autoincrement
    private Integer id;

    @DatabaseField
    private String key;

    @DatabaseField
    private Integer value;
}