package com.example.jsac;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jsac.UserVerification.Mobile_no_varification;

public class Splash_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        getSupportActionBar().hide();


        Thread background = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent i = new Intent(Splash_Activity.this, Mobile_no_varification.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        };
        background.run();
    }


}
