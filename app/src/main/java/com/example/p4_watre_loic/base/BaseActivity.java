package com.example.p4_watre_loic.base;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p4_watre_loic.repository.Reurepository;

import MyReuApp.MaReuApplication;


public class BaseActivity extends AppCompatActivity {

    public Reurepository getReuRepository() {
        return ((MaReuApplication) getApplication()). getReuRepository();
    }
}
