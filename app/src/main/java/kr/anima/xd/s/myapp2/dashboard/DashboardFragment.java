package kr.anima.xd.s.myapp2.dashboard;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.honorato.multistatetogglebutton.MultiStateToggleButton;
import org.honorato.multistatetogglebutton.ToggleButton;

import kr.anima.xd.s.myapp2.R;
import static kr.anima.xd.s.myapp2.items.NameOfItem.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment implements View.OnClickListener,
        ToggleButton.OnValueChangedListener, ViewPager.OnPageChangeListener{

    // 페이지 체인지 다이얼로그 추가
    ViewPager pager;
    FloatingActionButton fab;
    MultiStateToggleButton toggleButton;

    private Context mContext;
    private DashboardPagerAdapter adapter;
    private int numOfSelectedPage;

    public DashboardFragment() {
        // Required empty public constructor
    }

    public DashboardFragment(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dashboard, container, false);

        toggleButton=view.findViewById(R.id.MSTB_Dashboard);
        toggleButton.setValue(PAGE_TIMELINE);
        toggleButton.setOnValueChangedListener(this);

        pager=view.findViewById(R.id.VP_Dash_pager);
        adapter=new DashboardPagerAdapter(getActivity().getSupportFragmentManager());
        pager.setAdapter(adapter);
        pager.addOnPageChangeListener(this);

        fab=view.findViewById(R.id.FAB);
        fab.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        // click fab
        switch (numOfSelectedPage){
            case PAGE_TIMELINE:
                Toast.makeText(mContext, PAGE_TIMELINE+"", Toast.LENGTH_SHORT).show();
                break;
            case PAGE_CALENDAR:
                Toast.makeText(mContext, PAGE_CALENDAR+"", Toast.LENGTH_SHORT).show();
                break;
            case PAGE_TRACKER:
                Toast.makeText(mContext, PAGE_TRACKER+"", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onValueChanged(int value) {
        pager.setCurrentItem(value, true);
        numOfSelectedPage=value;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        toggleButton.setValue(position);
        numOfSelectedPage=position;
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
