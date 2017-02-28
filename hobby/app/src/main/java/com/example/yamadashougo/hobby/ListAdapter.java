package com.example.yamadashougo.hobby;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by yamadashougo on 2016/07/16.
 */
public class ListAdapter extends ArrayAdapter<String> {

    private List<String> list;
    private LayoutInflater inflater;

    public ListAdapter(Context context, int viewId, List<String> list){
        super(context,viewId,list);

        this.list = list;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    public View getView(int position, View convertView, ViewGroup parent){

    }


}
