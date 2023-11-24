package com.raselacademy.boalmari_online_seba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class About_app extends AppCompatActivity {

    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);

        back=findViewById(R.id.back_about);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                About_app.super.onBackPressed();

            }
        });
    }
}