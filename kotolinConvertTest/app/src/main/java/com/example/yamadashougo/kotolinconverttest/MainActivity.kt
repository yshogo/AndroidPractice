package com.example.yamadashougo.kotolinconverttest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataModelList = ArrayList<DataModel>()
        dataModelList.add(DataModel("たろーさん", "push!!!!"))
        dataModelList.add(DataModel("ことりんさん", "押してください"))


        val adapter = CustomAdapter(this, R.layout.text_list_view, dataModelList)
        val listView = findViewById(R.id.listView) as ListView

        listView.adapter = adapter

    }
}
