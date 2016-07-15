package com.tuananhcaraballo.myowncameraapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

  ImageView image;
    ImageButton takePhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.photo);
        takePhoto = (ImageButton) findViewById(R.id.takePhoto);

        takePhoto.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){

            }
        });
    }
}
