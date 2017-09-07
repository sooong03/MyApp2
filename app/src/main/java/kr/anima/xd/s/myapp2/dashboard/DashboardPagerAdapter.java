package kr.anima.xd.s.myapp2.dashboard;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import static kr.anima.xd.s.myapp2.items.NameOfItem.*;

/**
 * Created by alfo6-10 on 9/5/2017.
 */

public class DashboardPagerAdapter extends FragmentStatePagerAdapter {

    private final int NUM_PAGE=3;
    private Fragment[] pages=new Fragment[3];

    public DashboardPagerAdapter(FragmentManager fm) {
        super(fm);
        pages[PAGE_TIMELINE]=new TimelineFragment();
        pages[PAGE_CALENDAR]=new CalendarFragment();
        pages[PAGE_TRACKER]=new TrackerFragment();
    }

    @Override
    public Fragment getItem(int position) {
        return pages[position];
    }

    @Override
    public int getCount() {
        return NUM_PAGE;
    }



}
