package com.example.yuecheng.day5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //fading
    public void fade(View view) {
        //fading
        //ImageView imgV1 = (ImageView) findViewById(R.id.imgV1);
        //ImageView imgV2 = (ImageView) findViewById(R.id.imgV2);
        //imgV1.alpha(0f).setDuration(5000);
        //imgV2.animate().alpha(1f).setDuration(5000);

        //translation
        //ImageView imgV1 = (ImageView) findViewById(R.id.imgV1);
        //imgV1.animate().translationYBy(2000f).translationXBy(2000f).setDuration(5000);//left -2000f

        //rotation
        //ImageView imgV1 = (ImageView) findViewById(R.id.imgV1);
        //imgV1.animate().rotation(180f).setDuration(5000);

        //shrinking & growing
        ImageView imgV1 = (ImageView) findViewById(R.id.imgV1);
        imgV1.animate().scaleX(0.5f).scaleY(0.5f).setDuration(5000); //put 1.5f instead of 0.5f


    }
    //cross fading
   // public void fade1(View view) {
        //ImageView imgV1 = (ImageView) findViewById(R.id.imgV1);
       // ImageView imgV2 = (ImageView) findViewById(R.id.imgV2);
       // imgV1.animate().alpha(0f).setDuration(5000);
       // imgV2.animate().alpha(1f).setDuration(5000);
    //}





}
