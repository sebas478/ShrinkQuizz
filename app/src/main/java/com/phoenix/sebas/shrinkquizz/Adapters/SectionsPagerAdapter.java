package com.phoenix.sebas.shrinkquizz.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.phoenix.sebas.shrinkquizz.Views.Tabs.LukyFragment;
import com.phoenix.sebas.shrinkquizz.Views.Tabs.MatchFragment;
import com.phoenix.sebas.shrinkquizz.Views.Tabs.PartyFragment;

/**
 * Created by sebas on 18-04-2017.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
     switch (position)  {
         case 0:
             return PartyFragment.newInstance();
         case 1:
             return LukyFragment.newInstance();
         case 2:
             return MatchFragment.newInstance();
         default:
             return PartyFragment.newInstance();
     }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Party";
            case 1:
                return "Luky";
            case 2:
                return "Match";
        }
        return null;
    }
}
