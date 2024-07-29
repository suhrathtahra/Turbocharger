package com.example.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class signup_page extends AppCompatActivity {

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
                Intent signup_page_to_main_page = new Intent (signup_page.this, MainActivity.class);
                startActivity (signup_page_to_main_page);
                finish ();
            }
        });

        signupFb.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent signup_page_to_home_page = new Intent (signup_page.this, home_page.class);
                startActivity (signup_page_to_home_page);
                finish ();
            }
        });

        signupGl.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent signup_page_to_home_page = new Intent (signup_page.this, home_page.class);
                startActivity (signup_page_to_home_page);
                finish ();
            }
        });


    }
}