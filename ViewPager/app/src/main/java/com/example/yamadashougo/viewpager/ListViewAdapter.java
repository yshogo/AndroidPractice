package com.example.yamadashougo.viewpager;

/**
 * Created by yamadashougo on 2016/07/14.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shogo.yamada on 2016/07/14.
 */
public class ListViewAdapter extends ArrayAdapter<String>{

    private List<String> list;
    private LayoutInflater inflater;

    public ListViewAdapter(Context context , int viewId, List<String> list){

        super(context,viewId,list);
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    public View getView(int position, View convertView, ViewGroup parent){

        if(convertView == null){
            convertView = inflater.inflate(R.layout.view_list_1_layout, null);
        }

        TextView name = (TextView)convertView.findViewById(R.id.text1);
        name.setText(list.get(position));
        return convertView;
    }
}
