package kr.anima.xd.s.myapp2.dashboard;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

import com.kelin.calendarlistview.library.BaseCalendarItemAdapter;
import com.kelin.calendarlistview.library.BaseCalendarListAdapter;
import com.kelin.calendarlistview.library.CalendarListView;

import kr.anima.xd.s.myapp2.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalendarFragment extends Fragment {

    CalendarListView CV_Calendar;
    CoordinatorLayout CL_Calendar;
    RecyclerView RV_Calendar_list;

    private Context mContext;

    public CalendarFragment() {
        // Required empty public constructor
    }

    public CalendarFragment(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_calendar, container, false);

//        listItemAdapter = new ListItemAdapter(this);
//        calendarItemAdapter = new CalendarItemAdapter(this);
//
//        calendarListView.setCalendarListViewAdapter(calendarItemAdapter, listItemAdapter);
//
//        BaseCalendarItemAdapter itemAdapter=new BaseCalendarItemAdapter(mContext);
//        BaseCalendarListAdapter listAdapter=new BaseCalendarListAdapter(mContext) {
//            @Override
//            public View getItemView(Object model, String month, int pos, View convertView, ViewGroup parent) {
//                return null;
//            }
//        };
//
//        CV_Calendar=view.findViewById(R.id.CV_calendar);
//        CV_Calendar.setCalendarListViewAdapter(itemAdapter, listAdapter);
//        CL_Calendar=view.findViewById(R.id.CL_Calendar);
//        CoordinatorLayout.Behavior behavior=CL_Calendar.generateLayoutParams(null).getBehavior();

//        CL_Calendar.generateLayoutParams(null).setBehavior();
//        RV_Calendar_list=view.findViewById(R.id.RV_Calendar_list);
//        RV_Calendar_list.setLayoutManager(new LinearLayoutManager(container.getContext(), LinearLayoutManager.VERTICAL, false));


        return view;
    }

}
