package com.example.yamadashougo.viewpager;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by yamadashougo on 2016/07/15.
 */
public class MyFlagmentStatePageAdapter extends FragmentStatePagerAdapter {

    public MyFlagmentStatePageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int i){

        switch (i){
            case 0:
                return new Flagment0();
            case 1:
                return new Flagment1();
            default:
                return new Flagment2();
        }
    }

    @Override
    public int getCount(){
        return 3;
    }

    @Override public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}
