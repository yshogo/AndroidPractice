package com.example.yamadashougo.oes_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import com.j256.ormlite.android.AndroidConnectionSource;
import com.j256.ormlite.support.ConnectionSource;


import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private String textName;
    private GridView gridView;
    private List<Setting> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.name);
        Button submit = (Button)findViewById(R.id.submit);
        gridView = (GridView)findViewById(R.id.gridView1);
        gridView.setNumColumns(5);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName = name.getText().toString();

                ORMDatabaseHelper helper = new ORMDatabaseHelper(MainActivity.this);
                ConnectionSource connectionSource = new AndroidConnectionSource(helper);

                try {
                    SettingDao dao = new SettingDao();
                    dao.createSetting(connectionSource, textName);

                    list = dao.getAll(connectionSource);

                    GridAdapter adapter = new GridAdapter(MainActivity.this,R.layout.view_grid,list);
                    gridView.setAdapter(adapter);

                    gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            String message = list.get(position) + "が選択されました。";
                            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                        }
                    });

                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "失敗しました", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
