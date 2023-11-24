package com.raselacademy.boalmari_online_seba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.interstitial.InterstitialAd;

public class Service_10 extends AppCompatActivity {

    AdView mAdView;
    InterstitialAd mInterstitialAd;
    LottieAnimationView Polli1,Polli2,Polli3,Polli4,Polli5,Polli6,Polli7,Polli8,Polli9,Polli10,Polli11,Polli12;
    ImageView back;
    public  String num="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service10);


        Polli1=findViewById(R.id.polli1);
        Polli2=findViewById(R.id.polli2);
        Polli3=findViewById(R.id.polli3);
        Polli4=findViewById(R.id.polli4);
        Polli5=findViewById(R.id.polli5);
        Polli6=findViewById(R.id.polli6);
        Polli7=findViewById(R.id.polli7);
        Polli8=findViewById(R.id.polli8);
        Polli9=findViewById(R.id.polli9);
        Polli10=findViewById(R.id.polli10);
        Polli11=findViewById(R.id.polli11);
        Polli12=findViewById(R.id.polli12);

        back=findViewById(R.id.back10);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Service_10.super.onBackPressed();

            }
        });







        //==================================Polli===============================================//
        Polli1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01769-401404";
                callPhoneNumber();
            }
        });
        Polli2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01769-402100";
                callPhoneNumber();
            }
        });
        Polli3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01769-401407";
                callPhoneNumber();
            }
        });
        Polli4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01769-401408";
                callPhoneNumber();
            }
        });
        Polli5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01769-401405";
                callPhoneNumber();
            }
        });
        Polli6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01769-401411";
                callPhoneNumber();
            }
        });
        Polli7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01769-401412";
                callPhoneNumber();
            }
        });
        Polli8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01769-407029";
                callPhoneNumber();
            }
        });
        Polli9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01769-401406";
                callPhoneNumber();
            }
        });
        Polli10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01769-401409";
                callPhoneNumber();
            }
        });
        Polli11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01769-401410";
                callPhoneNumber();
            }
        });
        Polli12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01769-402655";
                callPhoneNumber();
            }
        });

        //================================end==================================================//


    }


    //......................call method.....................//

    @SuppressLint("MissingSuperCall")
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)
    {
        if(requestCode == 101)
        {
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                callPhoneNumber();
            }
        }
    }

    public void callPhoneNumber()
    {
        try
        {
            if(Build.VERSION.SDK_INT > 22)
            {
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Service_10.this, new String[]{Manifest.permission.CALL_PHONE}, 101);
                    return;
                }

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + num));
                startActivity(callIntent);

            }
            else {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + num));
                startActivity(callIntent);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    //==================================================================================//


}