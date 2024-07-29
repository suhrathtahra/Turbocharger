package com.example.test;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class inbox extends Fragment {

    Button goto_messages, goto_not;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate (R.layout.fragment_inbox, container, false);

//        goto_not = view.findViewById (R.id.not_btn);
//
//        goto_messages.setOnClickListener (new View.OnClickListener () {
//            @Override
//            public void onClick(View view) {
//
//                Fragment not_frg = new notifications ();
//                FragmentTransaction fm = getActivity ().getSupportFragmentManager ().beginTransaction ();
//                fm.replace (R.id.container,not_frg).commit ();
//            }
//        });



        return view;

    }








}


