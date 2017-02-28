package com.example.yamadashougo.enum_practice;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button push = (Button)findViewById(R.id.button);

        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDialog();
            }
        });
    }

    private void startDialog(){

//        final String[] items = {"item_0", "item_1", "item_2"};
        List<String> itemList = createArray();

        final String[] items = new String[itemList.size()];
        for(int i = 0; i < itemList.size(); i++){
            items[i] = itemList.get(i);
        }


        int defaultItem = 0; // デフォルトでチェックされているアイテム
        final List<Integer> checkedItems = new ArrayList<>();


        checkedItems.add(defaultItem);

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Selector")
                .setSingleChoiceItems(items, defaultItem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        checkedItems.clear();
                        checkedItems.add(which);
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (!checkedItems.isEmpty()) {
                            Log.d("checkedItem:", "" + checkedItems.get(0));
                        }
                    }
                })
                .setNegativeButton("Cancel", null)
                .show();
    }

    /**
     * enumのデータを配列にする
     */
    private List<String> createArray(){

        List<String> list = new ArrayList<>();
        for(TestEnum test : TestEnum.values()){
            list.add(test.getName());
        }

        return list;

    }

}
