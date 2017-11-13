package com.example.foleytim.tabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by foleytim on 31/10/2017.
 */

public class SectionsPageAdapter3 extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList3 = new ArrayList<>();
    private final List<String> mFragmentTitleList3 = new ArrayList<>();


    public SectionsPageAdapter3(FragmentManager fm){
        super(fm);
    }

    public void addFragment(Fragment fragment,String title){
        mFragmentList3.add(fragment);
        mFragmentTitleList3.add(title);

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList3.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList3.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList3.size();
    }
}
