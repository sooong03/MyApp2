package kr.anima.xd.s.myapp2;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment implements View.OnClickListener{

    // 페이지 체인지 다이얼로그 추가
    ViewPager pager;
    FloatingActionButton fab;

    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dashboard, container, false);

        pager=view.findViewById(R.id.VP_Dash_pager);
        pager.setAdapter(new DashboardPagerAdapter(getActivity().getSupportFragmentManager()));
        fab=view.findViewById(R.id.FAB);
        fab.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        view=pager;
        switch (pager.getCurrentItem()){
            case 0:
                // add content
                break;
            case 1:
                // add content
                break;
            case 2:
                // edit tracker
                break;
        }
    }
}
