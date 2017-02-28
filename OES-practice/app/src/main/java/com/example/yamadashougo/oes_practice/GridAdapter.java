package com.example.yamadashougo.oes_practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import java.util.List;

/**
 * Created by yamadashougo on 2016/07/30.
 */
public class GridAdapter extends ArrayAdapter<Setting> {

    private List<Setting> list;
    private Context con;
    private int viewId;
    private LayoutInflater inflate;

    public GridAdapter(Context context, int viewId, List<Setting> list){
        super(context,viewId,list);

        this.list = list;
        this.con = context;
        this.viewId = viewId;

        inflate = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        Setting item = (Setting) getItem(position);

        if(convertView == null){
            convertView = inflate.inflate(R.layout.view_grid, null);
        }

        Button button = (Button)convertView.findViewById(R.id.button);
        button.setText(item.getName());
        return convertView;
    }
}
