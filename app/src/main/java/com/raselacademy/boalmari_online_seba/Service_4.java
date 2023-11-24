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

public class Service_4 extends AppCompatActivity {
    public String num="";

    ImageView back;
    LottieAnimationView Ambulence1,Ambulence2,Ambulence3,Ambulence4,Ambulence5
            ,Ambulence6,Ambulence7,Ambulence8,Ambulence9,Ambulence10;

    AdView mAdView;
    InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service4);


        Ambulence1=findViewById(R.id.Ambulence1);
        Ambulence2=findViewById(R.id.Ambulence2);
        Ambulence3=findViewById(R.id.Ambulence3);
        Ambulence4=findViewById(R.id.Ambulence4);
        Ambulence5=findViewById(R.id.Ambulence5);
        Ambulence6=findViewById(R.id.Ambulence6);
        Ambulence7=findViewById(R.id.Ambulence7);
        Ambulence8=findViewById(R.id.Ambulence8);
        Ambulence9=findViewById(R.id.Ambulence9);
        Ambulence10=findViewById(R.id.Ambulence10);

        back=findViewById(R.id.back4);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Service_4.super.onBackPressed();

            }
        });








        //==============================Ambulence===============================================//
        Ambulence1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01734-260454";
                callPhoneNumber();
            }
        });
        Ambulence2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01717-834444";
                callPhoneNumber();
            }
        });
        Ambulence3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01712-256965";
                callPhoneNumber();
            }
        });
        Ambulence4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01724-597927";
                callPhoneNumber();
            }
        });
        Ambulence5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01712-217475";
                callPhoneNumber();
            }
        });
        Ambulence6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01680-367678";
                callPhoneNumber();
            }
        });
        Ambulence7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01714-693849";
                callPhoneNumber();
            }
        });
        Ambulence8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01714-660909";
                callPhoneNumber();
            }
        });
        Ambulence9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01711-805375";
                callPhoneNumber();
            }
        });
        Ambulence10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01715-931806";
                callPhoneNumber();
            }
        });



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
                    ActivityCompat.requestPermissions(Service_4.this, new String[]{Manifest.permission.CALL_PHONE}, 101);
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