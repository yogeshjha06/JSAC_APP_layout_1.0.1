package com.example.jsac.UserVerification;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jsac.R;

public class Otp_verifaction extends AppCompatActivity {
    Button submit, resend;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_verifaction);
        getSupportActionBar().hide();

        // send component here
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Otp_verifaction.this,Employee_profile.class);
                startActivity(i);
            }
        });

        // resend component here
        resend=(Button) findViewById(R.id.resend);
        resend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent b = new Intent(Otp_verifaction.this,Mobile_no_varification.class);
                startActivity(b);
            }
        });
    }
}
