package kr.anima.xd.s.myapp2.inventory;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

import kr.anima.xd.s.myapp2.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class InventoryFragment extends Fragment implements View.OnClickListener{


    RecyclerView RV_Inventory_List;
    CardView CV_Inventory_Tracker;
    CardView CV_Inventory_;
    LinearLayout LL_Inventory_Event;
    LinearLayout LL_Inventory_Stroage;
    LinearLayout LL_Inventory_Comming;

    private ArrayList<String> aa=new ArrayList<>();

    public InventoryFragment() {
        initEntries();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_inventory, container, false);

        RV_Inventory_List=view.findViewById(R.id.RV_Inventory_List);
        RV_Inventory_List.setLayoutManager(new LinearLayoutManager(container.getContext(), LinearLayoutManager.VERTICAL, true));
        RV_Inventory_List.setAdapter(new GoalListAdapter(aa));

        CV_Inventory_Tracker=view.findViewById(R.id.CV_Inventory_Tracker);
        CV_Inventory_=view.findViewById(R.id.CV_Inventory_);
        LL_Inventory_Event=view.findViewById(R.id.LL_Inventory_Event);
        LL_Inventory_Stroage=view.findViewById(R.id.LL_Inventory_Storage);
        LL_Inventory_Comming=view.findViewById(R.id.LL_Inventory_Comming);

        CV_Inventory_Tracker.setOnClickListener(this);
        CV_Inventory_.setOnClickListener(this);
        LL_Inventory_Event.setOnClickListener(this);
        LL_Inventory_Stroage.setOnClickListener(this);
        LL_Inventory_Comming.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.CV_Inventory_Tracker: // 트래커
                break;
            case R.id.LL_Inventory_Event: // 이벤트창
                break;
            case R.id.LL_Inventory_Storage: // 저장소
                break;

        }
    }


    private void initEntries(){
        // TODO : load data
    }



}
