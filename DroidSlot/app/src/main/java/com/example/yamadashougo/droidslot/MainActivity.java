package com.example.yamadashougo.droidslot;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView droidImage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        droidImage1 = (ImageView)findViewById(R.id.image_view1);
        droidImage1.setImageResource(R.drawable.droid_back);

        randomChengeImage();
    }

    private void randomChengeImage(){
        Random randomNumber = new Random();

        int droidSide = randomNumber.nextInt(2);//０以上２未満の乱数を生成
        if(droidSide == 0){
            droidImage1.setImageResource(R.drawable.droid_back);
        }else{
            droidImage1.setImageResource(R.drawable.droid_front);
        }
    }

}
