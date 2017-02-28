package com.example.yamadashougo.listview_fragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamadashougo on 2016/07/16.
 */
public class ListFragment3 extends ListFragment {

    private List<PersonModel> list = new ArrayList<>();

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        list = setList();

        ListViewAdapter adapter = new ListViewAdapter(getActivity(), R.id.list_view, list);
        setListAdapter(adapter);
    }

    private List<PersonModel> setList(){

        list.add(new PersonModel("E" , 22));
        list.add(new PersonModel("F" , 22));

        list.add(new PersonModel("G" , 22));
        list.add(new PersonModel("H" , 22));

        return list;
    }
}
