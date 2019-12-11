package com.reshika.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.reshika.fragments.Fragment.FirstFragment;
import com.reshika.fragments.Fragment.SecondFragment;

public class TabLayoutActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        //Binding//
        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabId);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPageAdapter viewpageradapter=new ViewPageAdapter(getSupportFragmentManager());
        viewpageradapter.addFragment(new FirstFragment(),"Sum");
        viewpageradapter.addFragment(new SecondFragment(),"area of Circle");

        viewPager.setAdapter(viewpageradapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
