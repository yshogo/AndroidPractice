package com.example.yamadashougo.practice2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by yamadashougo on 2016/07/03.
 */
public class ListViewAdapter extends ArrayAdapter<String>{

    private List<String> list;
    private LayoutInflater inflater;

    public ListViewAdapter(Context context,int viewId, List<String> list){
        super(context, viewId, list);
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            convertView = inflater.inflate(R.layout.list_view, null);
        }

        TextView place = (TextView)convertView.findViewById(R.id.place);
        place.setText(list.get(position));

        return convertView;
    }
}
