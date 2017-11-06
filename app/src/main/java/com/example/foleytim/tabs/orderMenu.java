package com.example.foleytim.tabs;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;

public class orderMenu extends AppCompatActivity {
    private static final String TAG = "Order Menu";
    private SectionsPageAdapter mSectionsPageAdapater;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Log.d(TAG,"onCreate: Starting");
        mSectionsPageAdapater = new SectionsPageAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }
    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapater =new SectionsPageAdapter(getSupportFragmentManager());
        adapater.addFragment(new Burgers(),"Burgers");
        adapater.addFragment(new Drinks(),"Drinks");
        adapater.addFragment(new Sides(),"Sides");
        viewPager.setAdapter(adapater);
    }
}
