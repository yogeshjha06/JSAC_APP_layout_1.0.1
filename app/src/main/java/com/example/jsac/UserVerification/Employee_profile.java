package com.example.jsac.UserVerification;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jsac.R;
import com.example.jsac.dashbord;
import com.example.jsac.databinding.FragmentHomeBinding;

public class Employee_profile extends AppCompatActivity {

    Button confirmbtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_profile);
        getSupportActionBar().hide();

        confirmbtn=(Button)  findViewById(R.id.confirmbtn);

        confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n= new Intent(Employee_profile.this, dashbord.class);
                startActivity(n);
            }
        });


    }
}
