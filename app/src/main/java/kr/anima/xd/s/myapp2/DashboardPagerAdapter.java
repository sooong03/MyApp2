package kr.anima.xd.s.myapp2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by alfo6-10 on 9/5/2017.
 */

public class DashboardPagerAdapter extends FragmentStatePagerAdapter {

    private final int NUM_PAGE=3;
    private Fragment[] pages=new Fragment[3];

    public DashboardPagerAdapter(FragmentManager fm) {
        super(fm);
        pages[0]=new DashboardListFragment();
        pages[1]=new CalendarFragment();
        pages[2]=new TrackerFragment();
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
