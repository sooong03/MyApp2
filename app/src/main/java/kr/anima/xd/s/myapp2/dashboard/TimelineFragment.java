package kr.anima.xd.s.myapp2.dashboard;


import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import kr.anima.xd.s.myapp2.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimelineFragment extends Fragment implements View.OnClickListener{

    AppBarLayout appBarLayout;
    Toolbar toolbar;
    TextView TV_Month, TV_Date;
    ImageView IV_Prev, IV_Next;
    RecyclerView recyclerView;



    public TimelineFragment() {
        // load today data
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_timeline, container, false);

        toolbar=view.findViewById(R.id.Tb_Dashboard);


        TV_Month=view.findViewById(R.id.TV_Month);
        TV_Date=view.findViewById(R.id.TV_Date);
        IV_Prev=view.findViewById(R.id.IV_Arrow_Prev);
        IV_Next=view.findViewById(R.id.IV_Arrow_Next);

        TV_Month.setOnClickListener(this);
        TV_Date.setOnClickListener(this);
        IV_Prev.setOnClickListener(this);
        IV_Next.setOnClickListener(this);

        recyclerView=view.findViewById(R.id.RV_Dashboard_List);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL));
        recyclerView.setAdapter(new TimelineItemListAdapter());

        return view;
    }

     private void initCurrentDate(){
         // date
         Calendar calendar=Calendar.getInstance();
         calendar.setTimeInMillis(System.currentTimeMillis());

         TV_Month.setText(String.format(DateFormat.MONTH, calendar.get(Calendar.MONTH-1)));
//         TV_Date.setText(String.format(DateFormat.DATE_FIELD, calendar.get(Calendar.DATE))+"");

     }

    private void loadDataByDate(){
        // load data
        // schedule : date, time, objective, purpose, elements,
        // task
        // info : date, weather
        //
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.TV_Date:
            case R.id.TV_Month:
                // 날짜 선택
                break;
            case R.id.IV_Arrow_Prev:
                // 어제 날짜
                break;
            case R.id.IV_Arrow_Next:
                // 내일날짜
                break;
        }
    }
}
