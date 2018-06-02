package com.example.kaogi.proppra;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Taytay on 6/24/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    final int PAGE_COUNT = 2;
    private String tabTitles[] = new String[] { "Chattel", "Realty" };
    private Context context;

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ChattelFragment();
        } else
        {return new ChattelFragment();}
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
