package com.example.yamadashougo.listview_fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.androidquery.AQuery;

import java.text.ParseException;
import java.util.List;

/**
 * Created by yamadashougo on 2016/07/16.
 */
public class ListViewAdapter extends ArrayAdapter<PersonModel>{

    private List<PersonModel> list;
    private LayoutInflater inflater;

    public ListViewAdapter(Context context, int viewId, List<PersonModel> list){
        super(context,viewId,list);

        this.list = list;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public View getViwe(int position, View convertView, ViewGroup parent){

        PersonModel model = (PersonModel)getItem(position);
        AQuery aq = new AQuery(convertView);

        if(convertView == null){
            convertView = inflater.inflate(R.layout.list_view_layout, null);
        }

        aq.id(R.id.name_text).text(list.get(position).getName());
        aq.id(R.id.birth_text).text(list.get(position).getBirth());

        return convertView;
    }
}
