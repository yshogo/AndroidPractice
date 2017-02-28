package com.example.yamadashougo.kotolinconverttest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView

/**
 * カスタムアダプター
 * Created by yamadashougo on 2016/11/17.
 */
class CustomAdapter(context: Context, private val viewId: Int, list: List<DataModel>) : ArrayAdapter<DataModel>(context, viewId, list) {

    private val inflater: LayoutInflater

    init {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView

        val model = getItem(position)

        if (convertView == null) {
            convertView = inflater.inflate(viewId, null)
        }

        val name = convertView!!.findViewById(R.id.name_text_view) as TextView
        val button = convertView.findViewById(R.id.button) as Button

        name.text = model.name
        button.text = model.button

        return convertView
    }
}
