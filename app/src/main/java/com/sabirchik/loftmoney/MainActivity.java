package com.sabirchik.loftmoney;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TabLayout tabs;
    ViewPager pages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabs = (TabLayout) findViewById(R.id.tabs);
        pages = (ViewPager) findViewById(R.id.pages);
        pages.setAdapter(new MainPagerAdapter(this));
        tabs.setupWithViewPager(pages); //
    }
}