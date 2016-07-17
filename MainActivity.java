package com.tuananhcaraballo.myowncameraapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    ImageButton takePhoto;
    Camera the_camera;

    //1- Check if the device has a camera, normally this is treated with the persmission
    //2- Create main layout
    //3-  Learn how to select the type of camera
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.photo);
        takePhoto = (ImageButton) findViewById(R.id.takePhoto);
        the_camera = new Camera();
        takePhoto.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(the_camera.checkCameraHardware());
            }
        });
    }
}
