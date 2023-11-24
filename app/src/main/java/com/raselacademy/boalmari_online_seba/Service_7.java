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

public class Service_7 extends AppCompatActivity {
//    AdView mAdView;

    public  String num="";
    ImageView back;
    LottieAnimationView Police1,Police2,Police3,Police4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service7);

        Police1=findViewById(R.id.police1);
        Police2=findViewById(R.id.police2);
        Police3=findViewById(R.id.police3);
        Police4=findViewById(R.id.police4);
        back=findViewById(R.id.back7);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Service_7.super.onBackPressed();

            }
        });


        //=======================================================Ads start=================================//
//        mAdView=findViewById(R.id.adView);
//
//        mAdView.setVisibility(View.GONE);






        //==============================Police=================================================/
        Police1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01713-374179";
                callPhoneNumber();
            }
        });
        Police2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01713-374180";
                callPhoneNumber();
            }
        });
        Police3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01713-374181";
                callPhoneNumber();
            }
        });
        Police4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01713-374182";
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
                    ActivityCompat.requestPermissions(Service_7.this, new String[]{Manifest.permission.CALL_PHONE}, 101);
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