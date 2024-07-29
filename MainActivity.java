package com.example.Test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button signupBtn, loginBtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);



        signupBtn = findViewById (R.id.signupBtn);
        loginBtn = findViewById (R.id.loginBtn);

        signupBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent main_to_signup_page = new Intent (MainActivity.this, signup_page.class);
                startActivity (main_to_signup_page);
                finish ();
            }
        });


        loginBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent main_to_login_page= new Intent (MainActivity.this, login.class);
                startActivity (main_to_login_page);
                finish ();
            }
        });

    }
}