package com.example.yamadashougo.listview_fragment;

import android.support.v4.app.ListFragment;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamadashougo on 2016/07/16.
 */
public class ListViewFragment1 extends ListFragment {

    private List<PersonModel> list = new ArrayList<>();

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        list.add(new PersonModel("しょうご" , 22));
        list.add(new PersonModel("さくら" , 22));

        list.add(new PersonModel("山田" , 22));
        list.add(new PersonModel("松本" , 22));
        ListViewAdapter adapter = new ListViewAdapter(getActivity(), R.id.list_view, list);
        setListAdapter(adapter);
    }

}
