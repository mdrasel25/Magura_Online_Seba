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

public class Service_8 extends AppCompatActivity {

    AdView mAdView;
    InterstitialAd mInterstitialAd;
    public String num="";
    ImageView back;
    LottieAnimationView lawyer1,lawyer2,lawyer3,lawyer4,lawyer5,lawyer6
            ,lawyer7,lawyer8,lawyer9,lawyer10,lawyer11,lawyer12,lawyer13,lawyer14,lawyer15,lawyer16,lawyer17,lawyer18,lawyer19,lawyer20,lawyer21,lawyer22,lawyer23,
            lawyer24,lawyer25,lawyer26,lawyer27,lawyer28,lawyer29,lawyer30,lawyer31,lawyer32,lawyer33,lawyer34,lawyer35,lawyer36,lawyer37,lawyer38,lawyer39,lawyer40,lawyer41;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service8);


        lawyer1=findViewById(R.id.lawyer1);
        lawyer2=findViewById(R.id.lawyer2);
        lawyer3=findViewById(R.id.lawyer3);
        lawyer4=findViewById(R.id.lawyer4);
        lawyer5=findViewById(R.id.lawyer5);
        lawyer6=findViewById(R.id.lawyer6);
        lawyer7=findViewById(R.id.lawyer7);
        lawyer8=findViewById(R.id.lawyer8);
        lawyer9=findViewById(R.id.lawyer9);
        lawyer10=findViewById(R.id.lawyer10);
        lawyer11=findViewById(R.id.lawyer11);
        lawyer12=findViewById(R.id.lawyer12);
        lawyer13=findViewById(R.id.lawyer13);
        lawyer14=findViewById(R.id.lawyer14);
        lawyer15=findViewById(R.id.lawyer15);
        lawyer16=findViewById(R.id.lawyer16);
        lawyer17=findViewById(R.id.lawyer17);
        lawyer18=findViewById(R.id.lawyer18);
        lawyer19=findViewById(R.id.lawyer19);
        lawyer20=findViewById(R.id.lawyer20);
        lawyer21=findViewById(R.id.lawyer21);
        lawyer22=findViewById(R.id.lawyer22);
        lawyer23=findViewById(R.id.lawyer23);
        lawyer24=findViewById(R.id.lawyer24);
        lawyer25=findViewById(R.id.lawyer25);
        lawyer26=findViewById(R.id.lawyer26);
        lawyer27=findViewById(R.id.lawyer27);
        lawyer28=findViewById(R.id.lawyer28);
        lawyer29=findViewById(R.id.lawyer29);
        lawyer30=findViewById(R.id.lawyer30);
        lawyer31=findViewById(R.id.lawyer31);
        lawyer32=findViewById(R.id.lawyer32);
        lawyer33=findViewById(R.id.lawyer33);
        lawyer34=findViewById(R.id.lawyer34);
        lawyer35=findViewById(R.id.lawyer35);
        lawyer36=findViewById(R.id.lawyer36);
        lawyer37=findViewById(R.id.lawyer37);
        lawyer38=findViewById(R.id.lawyer38);
        lawyer39=findViewById(R.id.lawyer39);
        lawyer40=findViewById(R.id.lawyer40);
        lawyer41=findViewById(R.id.lawyer41);

        back=findViewById(R.id.back8);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Service_8.super.onBackPressed();

            }
        });






        //=======================================================================//




        //=====================================lawyer==============================================//

        lawyer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01912-335616";
                callPhoneNumber();
            }
        });
        lawyer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01816-046739";
                callPhoneNumber();
            }
        });
        lawyer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01718-778704";
                callPhoneNumber();
            }
        });
        lawyer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01716-137478";
                callPhoneNumber();
            }
        });
        lawyer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01724-221282";
                callPhoneNumber();
            }
        });
        lawyer6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01721-515600";
                callPhoneNumber();
            }
        });
        lawyer7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01716-733777";
                callPhoneNumber();
            }
        });
        lawyer8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01712-618976";
                callPhoneNumber();
            }
        });
        lawyer9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01718-248503";
                callPhoneNumber();
            }
        });
        lawyer10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01710-116312";
                callPhoneNumber();
            }
        });
        lawyer11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01716-399962";
                callPhoneNumber();
            }
        });
        lawyer12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01911-535181";
                callPhoneNumber();
            }
        });
        lawyer13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01925-060815";
                callPhoneNumber();
            }
        });
        lawyer14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01716-251757";
                callPhoneNumber();
            }
        });
        lawyer15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01716-582370";
                callPhoneNumber();
            }
        });
        lawyer16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01720-997668";
                callPhoneNumber();
            }
        });
        lawyer17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01728-238826";
                callPhoneNumber();
            }
        });
        lawyer18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01718-019376";
                callPhoneNumber();
            }
        });
        lawyer19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01715-149949";
                callPhoneNumber();
            }
        });
        lawyer20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01712-862486";
                callPhoneNumber();
            }
        });
        lawyer21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01719-100815";
                callPhoneNumber();
            }
        });
        lawyer22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01712-971338";
                callPhoneNumber();
            }
        });
        lawyer23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01714-252968";
                callPhoneNumber();
            }
        });
        lawyer24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01715-352156";
                callPhoneNumber();
            }
        });
        lawyer25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01717-283858";
                callPhoneNumber();
            }
        });
        lawyer26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01717-086481";
                callPhoneNumber();
            }
        });
        lawyer27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01718-299889";
                callPhoneNumber();
            }
        });
        lawyer28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01819-974855";
                callPhoneNumber();
            }
        });
        lawyer29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01715-950544";
                callPhoneNumber();
            }
        });
        lawyer30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01726-265469";
                callPhoneNumber();
            }
        });
        lawyer31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01719-974611";
                callPhoneNumber();
            }
        });
        lawyer32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01712-137026";
                callPhoneNumber();
            }
        });
        lawyer33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01725-717411";
                callPhoneNumber();
            }
        });
        lawyer34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01724-177854";
                callPhoneNumber();
            }
        });
        lawyer35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01819-143872";
                callPhoneNumber();
            }
        });
        lawyer36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01771-440331";
                callPhoneNumber();
            }
        });
        lawyer37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01937-557522";
                callPhoneNumber();
            }
        });
        lawyer38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01712-992352";
                callPhoneNumber();
            }
        });
        lawyer39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01719-663539";
                callPhoneNumber();
            }
        });
        lawyer40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01719-569396";
                callPhoneNumber();
            }
        });
        lawyer41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01711-667570";
                callPhoneNumber();
            }
        });


        //======================================end================================================//

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
                    ActivityCompat.requestPermissions(Service_8.this, new String[]{Manifest.permission.CALL_PHONE}, 101);
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