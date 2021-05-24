package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.ISendDataListioner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.content_fr1, new Fragment1());
        fragmentTransaction.add(R.id.content_fr2, new Fragment2());
        fragmentTransaction.commit();
    }

    @Override
    public void SendDta(String email) {
        Fragment2 fragment2 = (Fragment2) getSupportFragmentManager().findFragmentById(R.id.content_fr2);
        fragment2.receiveData(email);
    }
}