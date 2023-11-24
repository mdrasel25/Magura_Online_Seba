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

public class Service_5 extends AppCompatActivity {


  public String num="";
  ImageView back;
  LottieAnimationView  Fire1,Fire2,Fire3;

    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service5);


        Fire1=findViewById(R.id.Fire1);
        Fire2=findViewById(R.id.Fire2);
        Fire3=findViewById(R.id.Fire3);

        back=findViewById(R.id.back5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Service_5.super.onBackPressed();

            }
        });



        //=======================================================================//




        //==============================Fire service=============================================//
        Fire1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01730-009185";
                callPhoneNumber();
            }
        });
        Fire2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01744-146496";
                callPhoneNumber();
            }
        });
        Fire3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01791-912286";
                callPhoneNumber();
            }
        });

        //================================end====================================================//


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
                    ActivityCompat.requestPermissions(Service_5.this, new String[]{Manifest.permission.CALL_PHONE}, 101);
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