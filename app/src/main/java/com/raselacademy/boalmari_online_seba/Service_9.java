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

public class Service_9 extends AppCompatActivity {

    AdView mAdView;
    InterstitialAd mInterstitialAd;
    LottieAnimationView   journalist1,journalist2,journalist3,journalist4,journalist5,journalist6,journalist7,journalist8,journalist9,journalist10,journalist11,journalist12
            ,journalist13,journalist14,journalist15,journalist16,journalist17,journalist18,journalist19,journalist20,journalist21,journalist22,journalist23,
            journalist24,journalist25,journalist26,journalist27,journalist28,journalist29,journalist30;
    ImageView back;
    public String num="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service9);

        journalist1=findViewById(R.id.journalist1);
        journalist2=findViewById(R.id.journalist2);
        journalist3=findViewById(R.id.journalist3);
        journalist4=findViewById(R.id.journalist4);
        journalist5=findViewById(R.id.journalist5);
        journalist6=findViewById(R.id.journalist6);
        journalist7=findViewById(R.id.journalist7);
        journalist8=findViewById(R.id.journalist8);
        journalist9=findViewById(R.id.journalist9);
        journalist10=findViewById(R.id.journalist10);
        journalist11=findViewById(R.id.journalist11);
        journalist12=findViewById(R.id.journalist12);
        journalist13=findViewById(R.id.journalist13);
        journalist14=findViewById(R.id.journalist14);
        journalist15=findViewById(R.id.journalist15);
        journalist16=findViewById(R.id.journalist16);
        journalist17=findViewById(R.id.journalist17);
        journalist18=findViewById(R.id.journalist18);
        journalist19=findViewById(R.id.journalist19);
        journalist20=findViewById(R.id.journalist20);
        journalist21=findViewById(R.id.journalist21);
        journalist22=findViewById(R.id.journalist22);
        journalist23=findViewById(R.id.journalist23);
        journalist24=findViewById(R.id.journalist24);
        journalist25=findViewById(R.id.journalist25);
        journalist26=findViewById(R.id.journalist26);
        journalist27=findViewById(R.id.journalist27);
        journalist28=findViewById(R.id.journalist28);
        journalist29=findViewById(R.id.journalist29);
        journalist30=findViewById(R.id.journalist30);

        back=findViewById(R.id.back9);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Service_9.super.onBackPressed();

            }
        });





        //================================journalist=============================================//
        journalist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01716-365971";
                callPhoneNumber();
            }
        });
        journalist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01199-091509";
                callPhoneNumber();
            }
        });
        journalist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01199-091511";
                callPhoneNumber();
            }
        });
        journalist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01714-440948";
                callPhoneNumber();
            }
        });
        journalist5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01199-091513";
                callPhoneNumber();
            }
        });
        journalist6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01199-091512";
                callPhoneNumber();
            }
        });
        journalist7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01716-180700";
                callPhoneNumber();
            }
        });
        journalist8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01711-241020";
                callPhoneNumber();
            }
        });
        journalist9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01712-246580";
                callPhoneNumber();
            }
        });
        journalist10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01715-368437";
                callPhoneNumber();
            }
        });
        journalist11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01912-134941";
                callPhoneNumber();
            }
        });
        journalist12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01716-232962";
                callPhoneNumber();
            }
        });
        journalist13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01199-096296";
                callPhoneNumber();
            }
        });
        journalist14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01719-628057";
                callPhoneNumber();
            }
        });
        journalist15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01716-971999";
                callPhoneNumber();
            }
        });
        journalist16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01721-587864";
                callPhoneNumber();
            }
        });
        journalist17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01914-718161";
                callPhoneNumber();
            }
        });
        journalist18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01999-091431";
                callPhoneNumber();
            }
        });
        journalist19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01717-058340";
                callPhoneNumber();
            }
        });
        journalist20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01722-331018";
                callPhoneNumber();
            }
        });
        journalist21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01720-000291";
                callPhoneNumber();
            }
        });
        journalist22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01712-654140";
                callPhoneNumber();
            }
        });
        journalist23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01916-007810";
                callPhoneNumber();
            }
        });
        journalist24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01916-49538";
                callPhoneNumber();
            }
        });
        journalist25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01712-763470";
                callPhoneNumber();
            }
        });
        journalist26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01912-835268";
                callPhoneNumber();
            }
        });
        journalist27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01670-686370";
                callPhoneNumber();
            }
        });
        journalist28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01721-755625";
                callPhoneNumber();
            }
        });
        journalist29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01713-773077";
                callPhoneNumber();
            }
        });
        journalist30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01724-341539";
                callPhoneNumber();
            }
        });

        //================================end===================================================//
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
                    ActivityCompat.requestPermissions(Service_9.this, new String[]{Manifest.permission.CALL_PHONE}, 101);
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

    //==============================================Banner ad start=============================//




}