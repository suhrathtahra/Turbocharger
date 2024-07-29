package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class login extends AppCompatActivity {

    Button cancelBtn, signupFb, signupGl;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.signup_page);

        cancelBtn = findViewById(R.id.cancelBtn);
        signupFb = findViewById(R.id.signupFb);
        signupGl = findViewById(R.id.signupGl);

        cancelBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent login_to_main_page = new Intent (login.this, MainActivity.class);
                startActivity (login_to_main_page);
                finish ();
            }
        });

        signupFb.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent login_to_home_page = new Intent (login.this, home_page.class);
                startActivity (login_to_home_page);
                finish ();
            }
        });

        signupGl.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent login_to_home_page = new Intent (login.this, home_page.class);
                startActivity (login_to_home_page);
                finish ();
            }
        });


    }
}