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

public class Service_6 extends AppCompatActivity {

    AdView mAdView;
    InterstitialAd mInterstitialAd;
    public String num="";
    ImageView back;
    LottieAnimationView Help1,Help2,Help3,Help4,Help5,
            Help6,Help7,Help8,Help9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service6);


        Help1=findViewById(R.id.Help1);
        Help2=findViewById(R.id.Help2);
        Help3=findViewById(R.id.Help3);
        Help4=findViewById(R.id.Help4);
        Help5=findViewById(R.id.Help5);
        Help6=findViewById(R.id.Help6);
        Help7=findViewById(R.id.Help7);
        Help8=findViewById(R.id.Help8);
        Help9=findViewById(R.id.Help9);

        back=findViewById(R.id.back6);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Service_6.super.onBackPressed();

            }
        });






        //=============================Helpline================================================//
        Help1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="999";
                callPhoneNumber();
            }
        });
        Help2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="16575";
                callPhoneNumber();
            }
        });
        Help3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="109";
                callPhoneNumber();
            }
        });
        Help4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="1098";
                callPhoneNumber();
            }
        });
        Help5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="333";
                callPhoneNumber();
            }
        });
        Help6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="106";
                callPhoneNumber();
            }
        });
        Help7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="16430";
                callPhoneNumber();
            }
        });
        Help8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="1090";
                callPhoneNumber();
            }
        });
        Help9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="16122";
                callPhoneNumber();
            }
        });

        //=============================end=====================================================//


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
                    ActivityCompat.requestPermissions(Service_6.this, new String[]{Manifest.permission.CALL_PHONE}, 101);
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