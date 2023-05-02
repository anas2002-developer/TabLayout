package com.anas.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout TL = findViewById(R.id.TL);
        ViewPager viewPager = findViewById(R.id.ViewPager);

        ViewPagerWhatsappAdapter whatsappAdapter = new ViewPagerWhatsappAdapter(getSupportFragmentManager());
        viewPager.setAdapter(whatsappAdapter);

        //for allowing swipe between tabs
        TL.setupWithViewPager(viewPager);
    }
}