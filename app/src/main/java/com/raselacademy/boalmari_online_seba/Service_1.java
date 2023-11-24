package com.raselacademy.boalmari_online_seba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class Service_1 extends AppCompatActivity {

    AdView mAdView;
    InterstitialAd mInterstitialAd;

    ImageView back1,back2,back3;
    CardView News1,News2,News3,News4,News5,News6,News7,News8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service1);

        News1=findViewById(R.id.News1);
        News2=findViewById(R.id.News2);
        News3=findViewById(R.id.News3);
        News4=findViewById(R.id.News4);
        News5=findViewById(R.id.News5);
        News6=findViewById(R.id.News6);
        News7=findViewById(R.id.News7);
        News8=findViewById(R.id.News8);
        mAdView=findViewById(R.id.adView);

        mAdView.setVisibility(View.GONE);


        back1=findViewById(R.id.back1);
         back1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 Service_1.super.onBackPressed();

             }
         });


/*
  //=======================================================Ads start=================================//


        //init Mobile Ads
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });



       String url="https://clientcontrol123.blogspot.com/2022/10/blog-post.html";
        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);


// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.

                        if (response.contains("ON")){

                            loadFullscreenAd();
                            loadBannerAd();
                        } else {

                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);



        //=======================================================================//




 */






        //===========================================================news open==============================================//

        News1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://www.dainikmagurakantho.com/";
                Web_browser.WEBSITE_TITLE="দৈনিক মাগুরা কন্ঠ";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        News2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://maguraprotidin.com/";
                Web_browser.WEBSITE_TITLE="মাগুরা প্রতিদিন";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        News3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://dainikmagura.com/";
                Web_browser.WEBSITE_TITLE="দৈনিক মাগুরা";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        News4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="http://magurabarta24.com/";
                Web_browser.WEBSITE_TITLE="মাগুরা বার্তা ২৪";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        News5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://www.maguranews.com/";
                Web_browser.WEBSITE_TITLE="মাগুরা নিউজ";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        News6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://www.prothomalo.com/";
                Web_browser.WEBSITE_TITLE="প্রথম আলো";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        News7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://www.jugantor.com/";
                Web_browser.WEBSITE_TITLE="যুগান্তর";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        News8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://www.bd-pratidin.com/";
                Web_browser.WEBSITE_TITLE="বাংলাদেশ প্রতিদিন";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        //==============================end===============================================//


    }


    //==============================================Banner ad start=============================//

    int BANNER_AD_CLICK_COUNT =0;
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private void loadBannerAd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                if (BANNER_AD_CLICK_COUNT >=3){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }else{
                    if(mAdView!=null) mAdView.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                BANNER_AD_CLICK_COUNT++;

                if (BANNER_AD_CLICK_COUNT >=3){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }

            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //============================================banner ebd==============================//





    // loadFullscreenAd method starts here.....
    int FULLSCREEN_AD_LOAD_COUNT=0;
    public void loadFullscreenAd(){

        //Requesting for a fullscreen Ad
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

                //Fullscreen callback || Requesting again when an ad is shown already
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        //User dismissed the previous ad. So we are requesting a new ad here
                        FULLSCREEN_AD_LOAD_COUNT++;
                        loadFullscreenAd();
                        Log.d("FULLSCREEN_AD", ""+FULLSCREEN_AD_LOAD_COUNT);

                        // None of the above is true. So the category is video collection type


                    }

                }); // FullScreen Callback Ends here


            }
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }

        });

    }


    // loadFullscreenAd method ENDS  here..... >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>










    //=========================onBackPressed ads show======================================//
    @Override
    public void onBackPressed() {

        if (mInterstitialAd != null) {
            mInterstitialAd.show(Service_1.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent();
                    Service_1.super.onBackPressed();
                }
            });
        } else {

            super.onBackPressed();

        }



    }

    //=======================onBAckpressed ads show End=======================================//


}