package com.sabirchik.loftmoney;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    TabLayout tabs;
    ViewPager pages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate:");
        tabs = (TabLayout) findViewById(R.id.tabs);
        pages = (ViewPager) findViewById(R.id.pages);
        pages.setAdapter(new MainPagerAdapter(this));
        tabs.setupWithViewPager(pages); //
    }


    }
