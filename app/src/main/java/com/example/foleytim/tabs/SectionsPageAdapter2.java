package com.example.foleytim.tabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by foleytim on 31/10/2017.
 */

public class SectionsPageAdapter2 extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList2 = new ArrayList<>();
    private final List<String> mFragmentTitleList2 = new ArrayList<>();


    public SectionsPageAdapter2(FragmentManager fm){
        super(fm);
    }

    public void addFragment(Fragment fragment,String title){
        mFragmentList2.add(fragment);
        mFragmentTitleList2.add(title);

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList2.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList2.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList2.size();
    }
}
