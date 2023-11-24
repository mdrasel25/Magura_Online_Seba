package com.raselacademy.boalmari_online_seba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
 /*   private static final String ONESIGNAL_APP_ID = "f099ff64-4ea6-47a9-9067-2697df760571"; */


    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

    ImageView imageMenu;


    TextView tvDate;
CardView Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9,Button10,Button11,Button12,Button13,Button14,Button15,Button16,Button17,Button18,Button19,Button20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button1=findViewById(R.id.Button1);
        Button2=findViewById(R.id.Button2);
        Button3=findViewById(R.id.Button3);
        Button4=findViewById(R.id.Button4);
        Button5=findViewById(R.id.Button5);
        Button6=findViewById(R.id.Button6);
        Button7=findViewById(R.id.Button7);
        Button8=findViewById(R.id.Button8);
        Button9=findViewById(R.id.Button9);
        Button10=findViewById(R.id.Button10);
        Button11=findViewById(R.id.Button11);
        Button12=findViewById(R.id.Button12);
        Button13=findViewById(R.id.Button13);
        Button14=findViewById(R.id.Button14);
        Button15=findViewById(R.id.Button15);
        Button16=findViewById(R.id.Button16);
        Button17=findViewById(R.id.Button17);
        Button18=findViewById(R.id.Button18);
        Button19=findViewById(R.id.Button19);
        Button20=findViewById(R.id.Button20);


        /*
//===============================PUSH NOTIFICATION=====================================//

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);

        // promptForPushNotifications will show the native Android notification permission prompt.
        // We recommend removing the following code and instead using an In-App Message to prompt for notification permission (See step 7)
        OneSignal.promptForPushNotifications();

        //===========================================================================//
*/


        tvDate=findViewById(R.id.tvDate);
        //Set Date For Cover Section
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
        formatter.setTimeZone(TimeZone.getDefault());
        Date date1 = new Date();
        String s_date = formatter.format(date1);
        tvDate.setText(s_date);

//=====================================navigation drawer=======================================//




        // Navagation Drawar------------------------------
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_View);
        imageMenu = findViewById(R.id.imageMenu);


        toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(null);
        navigationView.setItemIconTintList(null);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Drawar click event
        // Drawer item Click event ------
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {



                switch (item.getItemId()) {
                    case R.id.Developer:

                        Intent nextActivity = new Intent(MainActivity.this, Developer.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("VAL", 100);
                        nextActivity.putExtras(bundle);
                        startActivity(nextActivity);
                        
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.mAbout:
                        Intent nextActivity1 = new Intent(MainActivity.this, About_app.class);
                        Bundle bundle1 = new Bundle();
                        bundle1.putInt("VAL", 0);
                        nextActivity1.putExtras(bundle1);
                        startActivity(nextActivity1);

                        drawerLayout.closeDrawers();
                        break;

                    case R.id.mRate:

                        try {
                            Uri uri = Uri.parse("market://details?id="+getPackageName()+"");
                            Intent goMarket = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(goMarket);
                        }catch (ActivityNotFoundException e){
                            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id="+getPackageName()+"");
                            Intent goMarket = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(goMarket);
                        }
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.mShare:

                        try {
                            Intent shareIntent = new Intent(Intent.ACTION_SEND);
                            shareIntent.setType("text/plain");
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                            String shareMessage= "\nLet me recommend you this application\n\n";
                            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
                            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                            startActivity(Intent.createChooser(shareIntent, "choose one"));
                        } catch(Exception e) {
                            //e.toString();
                        }
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.mExit:

                        new AlertDialog.Builder(MainActivity.this).setIcon(R.drawable.warning).setTitle("বাহির!")
                                .setMessage("আপনি কি বের হতে চান?")
                                .setPositiveButton("হ্যাঁ", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                        Intent intent = new Intent(Intent.ACTION_MAIN);
                                        intent.addCategory(Intent.CATEGORY_HOME);
                                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                        startActivity(intent);

                                    }
                                }).setNegativeButton("না", null).show();

                        drawerLayout.closeDrawers();
                        break;

                }

                return false;
            }
        });
        //------------------------------

        // ------------------------
        // App Bar Click Event
        imageMenu = findViewById(R.id.imageMenu);

        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code Here
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });


        // ------------------------





        //====================end=======================================================//
        //===========Image Slider=========================//



        ImageSlider imageSlider;


        imageSlider =findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.magura5, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.magura6,ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.magura1,ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.magura2,ScaleTypes.FIT));

        imageSlider.setImageList(imageList);


        //==================end==================================//


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button 1
                Intent nextActivity = new Intent(MainActivity.this, Service_1.class);

                startActivity(nextActivity);

            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button 1
                Intent nextActivity = new Intent(MainActivity.this, Service_2.class);
                startActivity(nextActivity);

            }
        });


        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button 1
                Intent nextActivity = new Intent(MainActivity.this, Service_3.class);
                startActivity(nextActivity);

            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button 1
                Intent nextActivity = new Intent(MainActivity.this, Service_4.class);
                startActivity(nextActivity);

            }
        });


        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Web_browser.WEBSITE_LINK="https://daktarbook.com/district/doctor/35";
                Web_browser.WEBSITE_TITLE="ডাক্তার লিস্ট";
                Intent myIntent=new Intent(MainActivity.this,Web_browser.class);
                startActivity(myIntent);

            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button 1
                Intent nextActivity = new Intent(MainActivity.this, Service_5.class);

                startActivity(nextActivity);
            }
        });


        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button 1
                Intent nextActivity = new Intent(MainActivity.this, Service_6.class);

                startActivity(nextActivity);
            }
        });


        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button 1
                Intent nextActivity = new Intent(MainActivity.this, Service_7.class);

                startActivity(nextActivity);
            }
        });


        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button 1
                Intent nextActivity = new Intent(MainActivity.this, Service_8.class);
                startActivity(nextActivity);
            }
        });
        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button 1
                Intent nextActivity = new Intent(MainActivity.this, Service_9.class);
                startActivity(nextActivity);
            }
        });
        Button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button 1
                Intent nextActivity = new Intent(MainActivity.this, Service_10.class);

                startActivity(nextActivity);
            }
        });

        Button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button 12
                Intent nextActivity = new Intent(MainActivity.this, Service_11.class);
                startActivity(nextActivity);
            }
        });


        Button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Web_browser.WEBSITE_LINK="https://www.foodpanda.com.bd/city/magura";
                Web_browser.WEBSITE_TITLE="রেস্টুরেন্ট";
                Intent myIntent=new Intent(MainActivity.this,Web_browser.class);
                startActivity(myIntent);

            }
        });
        Button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Web_browser.WEBSITE_LINK="https://www.shohoz.com/bus-tickets";
                Web_browser.WEBSITE_TITLE="বাস টিকেট";
                Intent myIntent=new Intent(MainActivity.this,Web_browser.class);
                startActivity(myIntent);

            }
        });
        Button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(MainActivity.this,"শীঘ্রই আসছে",Toast.LENGTH_LONG).show();




            }
        });

        Button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Button 16
                Intent nextActivity = new Intent(MainActivity.this, Service_12.class);
                startActivity(nextActivity);
            }
        });

        Button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Web_browser.WEBSITE_LINK="https://bangla.tourtoday.com.bd/category/tourist-spots-in-khulna/magura-tour/#:~:text=%E0%A6%AE%E0%A6%BE%E0%A6%97%E0%A7%81%E0%A6%B0%E0%A6%BE%20%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE%E0%A6%B0%20%E0%A6%A6%E0%A6%B0%E0%A7%8D%E0%A6%B6%E0%A6%A8%E0%A7%80%E0%A6%AF%E0%A6%BC%20%E0%A6%B8%E0%A7%8D%E0%A6%A5%E0%A6%BE%E0%A6%A8%20%E0%A6%97%E0%A7%81%E0%A6%B2%E0%A7%8B%E0%A6%B0,%E0%A6%93%20%E0%A6%B8%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%A7%E0%A7%87%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%B0%E0%A7%80%20%E0%A6%AE%E0%A6%A0%20%E0%A6%AC%E0%A7%87%E0%A6%B6%20%E0%A6%9C%E0%A6%A8%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%BF%E0%A6%AF%E0%A6%BC";
                Web_browser.WEBSITE_TITLE="জেলার দর্শনীয় স্থান সমূহ";
                Intent myIntent=new Intent(MainActivity.this,Web_browser.class);
                startActivity(myIntent);

            }
        });

        Button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Web_browser.WEBSITE_LINK="https://bangla.tourtoday.com.bd/category/tourist-spots-in-khulna/magura-tour/#:~:text=%E0%A6%AE%E0%A6%BE%E0%A6%97%E0%A7%81%E0%A6%B0%E0%A6%BE%20%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE%E0%A6%B0%20%E0%A6%A6%E0%A6%B0%E0%A7%8D%E0%A6%B6%E0%A6%A8%E0%A7%80%E0%A6%AF%E0%A6%BC%20%E0%A6%B8%E0%A7%8D%E0%A6%A5%E0%A6%BE%E0%A6%A8%20%E0%A6%97%E0%A7%81%E0%A6%B2%E0%A7%8B%E0%A6%B0,%E0%A6%93%20%E0%A6%B8%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%A7%E0%A7%87%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%B0%E0%A7%80%20%E0%A6%AE%E0%A6%A0%20%E0%A6%AC%E0%A7%87%E0%A6%B6%20%E0%A6%9C%E0%A6%A8%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%BF%E0%A6%AF%E0%A6%BC";
                Web_browser.WEBSITE_TITLE="জেলার দর্শনীয় স্থান সমূহ";
                Intent myIntent=new Intent(MainActivity.this,Web_browser.class);
                startActivity(myIntent);

            }
        });

        Button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"শীঘ্রই আসছে",Toast.LENGTH_LONG).show();

            }
        });

        Button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"শীঘ্রই আসছে",Toast.LENGTH_LONG).show();

            }
        });




    }


    //................................back presses exit======================================//

    ///====================================================

    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired
    private long mBackPressed;

    // When user click bakpress button this method is called

    @Override
    public void onBackPressed() {
        // When user press back button

        new AlertDialog.Builder(MainActivity.this).setIcon(R.drawable.warning)
                .setTitle("বাহির!")
                .setMessage("আপনি কি বের হতে চান?")
                .setPositiveButton("হ্যা", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                }).setNegativeButton("না", null).show();

        drawerLayout.closeDrawers();

        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        }

        mBackPressed = System.currentTimeMillis();



    } // end of onBackpressed method

    //#############################################################################################





}