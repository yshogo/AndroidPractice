package com.example.yamadashougo.oes_practice;


import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by yamadashougo on 2016/07/30.
 */
public class SettingDao {

    public List<Setting> getAll (ConnectionSource cs ) throws java.sql.SQLException
    {
        Dao<Setting,Integer> dao = DaoManager.createDao(cs, Setting.class);
        return dao.queryForAll();
    }

    public void createSetting( ConnectionSource cs, String name ) throws SQLException {

        Dao<Setting,Integer> dao = DaoManager.createDao(cs, Setting.class);

        Setting setting = new Setting();
        setting.setName(name);
        dao.create(setting);
    }
}
