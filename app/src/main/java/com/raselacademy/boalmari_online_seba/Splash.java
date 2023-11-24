package com.raselacademy.boalmari_online_seba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Splash extends AppCompatActivity {
public int progress;
ImageView logo;
Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_splash);

        logo=findViewById(R.id.logo);

       animation= AnimationUtils.loadAnimation(Splash.this,R.anim.fade_in);
       logo.startAnimation(animation);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {


                dowork();
                startapp();


            }
        });
        thread.start();
    }
    public  void dowork(){

        for (progress=30;progress<=100;progress=progress+30){


            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public  void startapp(){

        Intent myIntent=new Intent(Splash.this,MainActivity.class);
        startActivity(myIntent);


    }

}