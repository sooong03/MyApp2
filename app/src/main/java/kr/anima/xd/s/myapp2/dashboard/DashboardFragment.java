package kr.anima.xd.s.myapp2.dashboard;


import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import org.honorato.multistatetogglebutton.MultiStateToggleButton;
import org.honorato.multistatetogglebutton.ToggleButton;

import kr.anima.xd.s.myapp2.R;
import kr.anima.xd.s.myapp2.items.FabTest;
import kr.anima.xd.s.myapp2.items.MyFloatingActionMenu;
import kr.anima.xd.s.myapp2.main.MainActivity;

import static kr.anima.xd.s.myapp2.items.NameOfItem.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment implements View.OnClickListener,
        ToggleButton.OnValueChangedListener, ViewPager.OnPageChangeListener{



    // 페이지 체인지 다이얼로그 추가
    ViewPager pager;
//    FloatingActionButton fab;
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

//        fab=view.findViewById(R.id.FAB);
//        fab.setOnClickListener(this);
        test(view);






        return view;
    }

    private void setButton(FloatingActionButton btn){

        btn.setSize(FloatingActionButton.SIZE_MINI);
        btn.setColorNormalResId(R.color.myColorGreyAccent);
        btn.setColorPressedResId(R.color.colorAccent);
        btn.setStrokeVisible(false);
        btn.setTitle(getString(R.string.app_name));
        Drawable drawable=Drawable.createFromPath(String.valueOf(R.drawable.ic_star));
        btn.setIconDrawable(drawable);
    }

    private void test(View view){

        final FloatingActionsMenu FAB_Menu=view.findViewById(R.id.FAB_Menu);
        FloatingActionButton FAB_btn_1=view.findViewById(R.id.FAB_btn_1);
        FloatingActionButton FAB_btn_2=view.findViewById(R.id.FAB_btn_2);
        FloatingActionButton FAB_btn_3=view.findViewById(R.id.FAB_btn_3);

        setButton(FAB_btn_1);
        setButton(FAB_btn_2);
        setButton(FAB_btn_3);



//        FloatingActionsMenu m=view.findViewById(R.id.center_menu);
//        FloatingActionButton btn=view.findViewById(R.id.center_btn);
//
//        FabTest fabTest=new FabTest(mContext, m, btn);

        // TODO :: FAB Setting
//         1. xml
        // - menu size, color
        // - btn title, icon
//         2. java
        // - btn size, color

//        FAB_a.setSize(FloatingActionButton.SIZE_MINI);
//        FAB_a.setColorNormal(R.color.myColorGreyAccent);
//        FAB_a.setColorPressed(R.color.myColorGreyAccent);
////        FAB_a.setIcon(R.drawable.ic_star);
//        FAB_a.setStrokeVisible(false);
//
//        FAB_b.setSize(FloatingActionButton.SIZE_MINI);
//        FAB_b.setColorNormal(R.color.myColorGreyWhite);


//
//        view.findViewById(R.id.pink_icon).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(mContext, "Clicked pink Floating Action Button", Toast.LENGTH_SHORT).show();
//            }
//        });

//        FloatingActionButton button = view.findViewById(R.id.setter);
//        button.setSize(FloatingActionButton.SIZE_MINI);
//        button.setColorNormalResId(R.color.pink);
//        button.setColorPressedResId(R.color.pink_pressed);
//        button.setIcon(R.drawable.ic_fab_star);
//        button.setStrokeVisible(false);

//        final View actionB = view.findViewById(R.id.action_b);

//        FloatingActionButton actionC = new FloatingActionButton(mContext);
//        actionC.setTitle("Hide/Show Action above");
//        actionC.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                actionB.setVisibility(actionB.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
//            }
//        });

//        final FloatingActionsMenu menuMultipleActions = view.findViewById(R.id.multiple_actions);
//        menuMultipleActions.addButton(actionC);

//        final FloatingActionsMenu menu=view.findViewById(R.id.multiple_actions_down);

//        final FloatingActionButton removeAction = view.findViewById(R.id.button_remove);
//        removeAction.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                menu.removeButton(removeAction);
//            }
//        });

//        ShapeDrawable drawable = new ShapeDrawable(new OvalShape());
////        drawable.getPaint().setColor(getResources().getColor(R.color.white));
//        ((FloatingActionButton) view.findViewById(R.id.setter_drawable)).setIconDrawable(drawable);
//
//        final FloatingActionButton actionA = view.findViewById(R.id.action_a);
//        actionA.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                actionA.setTitle("Action A clicked");
//            }
//        });

        // Test that FAMs containing FABs with visibility GONE do not cause crashes
//        view.findViewById(R.id.button_gone).setVisibility(View.GONE);
//
//        final FloatingActionButton actionEnable = view.findViewById(R.id.action_enable);
//        actionEnable.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                menuMultipleActions.setEnabled(!menuMultipleActions.isEnabled());
//            }
//        });

//        FloatingActionsMenu rightLabels = view.findViewById(R.id.right_labels);
//        FloatingActionButton addedOnce = new FloatingActionButton(mContext);
//        addedOnce.setTitle("Added once");
//        rightLabels.addButton(addedOnce);
//
//        FloatingActionButton addedTwice = new FloatingActionButton(mContext);
//        addedTwice.setTitle("Added twice");
//        rightLabels.addButton(addedTwice);
//        rightLabels.removeButton(addedTwice);
//        rightLabels.addButton(addedTwice);
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
