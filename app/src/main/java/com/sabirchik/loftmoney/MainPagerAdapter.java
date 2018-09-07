package com.sabirchik.loftmoney;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

class MainPagerAdapter extends FragmentPagerAdapter {
    private final String[] titles;
    private final String[] types = {"expense", "income"};

    MainPagerAdapter(MainActivity activity) {
        super(activity.getSupportFragmentManager());
        titles = activity.getResources().getStringArray(R.array.main_pager_titles);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == getCount() - 1)
            return new BalanceFragment();
        return ItemsFragment.newInstance(types[position]);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return titles.length;
    }
}