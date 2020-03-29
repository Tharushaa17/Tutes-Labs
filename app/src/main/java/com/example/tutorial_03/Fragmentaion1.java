package com.example.tutorial_03;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragmentaion1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragmentaion1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmentaion1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmentaion1, container, false);
    }

    public void changeFragment(View view){
        Fragment fragment;
        if (view == findViewById(R.id.btnFragmentation1)){
            fragment = new Fragment1();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frgmntDefault,fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.btnFragmetn2)){
            fragment = new Fragment2();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frgmntDefault,fragment);
            ft.commit();
        }
    }



}