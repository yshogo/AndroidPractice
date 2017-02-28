package com.example.yamadashougo.listview_fragment;


import android.os.Bundle;
import android.support.v4.app.ListFragment;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamadashougo on 2016/07/16.
 */
public class ListFragment2  extends ListFragment {

    private List<PersonModel> list = new ArrayList<>();

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        list = setList();

        ListViewAdapter adapter = new ListViewAdapter(getActivity(), R.id.list_view, list);
        setListAdapter(adapter);
    }

    private List<PersonModel> setList(){

        list.add(new PersonModel("A" , 22));
        list.add(new PersonModel("B" , 22));

        list.add(new PersonModel("C" , 22));
        list.add(new PersonModel("D" , 22));

        return list;
    }
}
