package kr.anima.xd.s.myapp2.inventory;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.anima.xd.s.myapp2.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class InventoryFragment extends Fragment implements View.OnClickListener{


    RecyclerView RV_Inventory_List;



    public InventoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_inventory, container, false);

        RV_Inventory_List=view.findViewById(R.id.RV_Inventory_List);
        RV_Inventory_List.setLayoutManager(new LinearLayoutManager(container.getContext(), LinearLayoutManager.VERTICAL, true));
        RV_Inventory_List.setAdapter(new GoalListAdapter());

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.CV_Inventory_Tracker: // 트래커
                break;
            case R.id.CV_Inventory_Total: // 종합 그래프
                break;
            case R.id.LL_Inventory_Event: // 이벤트창
                break;
            case R.id.LL_Inventory_Storage: // 저장소
                break;

        }
    }
}
