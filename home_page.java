package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class home_page extends AppCompatActivity {

    BottomNavigationView btn_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_home_page);

        btn_nav = findViewById (R.id.nav_btn);

        btn_nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener () {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id== R.id.navigation_home){

                    loadFrg (new home (), false);

                }
                else if(id == R.id.navigation_search){

                    loadFrg (new search (), false);

                }

                else if(id == R.id.navigation_sell){

                    loadFrg (new sell(), false);


                }

                else if(id == R.id.navigation_inbox){

                    loadFrg (new inbox(), false);


                }
                else{

                    loadFrg (new profile(), false);


                }
                return true;
            }
        });

        btn_nav.setSelectedItemId (R.id.navigation_home);
        }

        public void loadFrg (Fragment fragment, boolean flag){

            FragmentManager frgM = getSupportFragmentManager();
            FragmentTransaction frgT = frgM.beginTransaction();

            if (flag){
                frgT.add(R.id.FrmLay, fragment );
            }

            else {
                frgT.replace (R.id.FrmLay, fragment );
            }
            frgT.commit ();
        }

//    public  void frag (Fragment fragment, boolean flag){
//
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//
//        if(flag){
//            ft.add(R.id.FrmLay,fragment);
//        }
//        else {
//            ft.replace(R.id.FrmLay,fragment);
//        }
//
//        ft.commit();
//    }




    }
