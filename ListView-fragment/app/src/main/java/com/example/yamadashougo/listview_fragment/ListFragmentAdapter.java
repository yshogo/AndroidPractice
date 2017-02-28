package com.example.yamadashougo.listview_fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by yamadashougo on 2016/07/16.
 */
public class ListFragmentAdapter extends FragmentStatePagerAdapter {

    public ListFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int i){

        switch (i){
            case 0:
                return new ListViewFragment1();
            case 1:
                return new ListFragment2();
            default:
                return new ListFragment3();
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
