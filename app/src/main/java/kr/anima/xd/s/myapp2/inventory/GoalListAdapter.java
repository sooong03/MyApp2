package kr.anima.xd.s.myapp2.inventory;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import kr.anima.xd.s.myapp2.R;

/**
 * Created by alfo6-10 on 9/15/2017.
 */

public class GoalListAdapter extends RecyclerView.Adapter<GoalListAdapter.ViewHolder> {

    // TODO : Goal 리스트 받아오기
    private ArrayList<String> aa;

    public GoalListAdapter() {
    }

    public GoalListAdapter(ArrayList<String> aa){
        this.aa=aa;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_item_goal, parent, false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return aa.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView TV_Title_Goal;
        TextView TV_Num_Total;
        TextView TV_Num_Progress;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            TV_Title_Goal=itemView.findViewById(R.id.TV_Title_Goal);
            TV_Num_Total=itemView.findViewById(R.id.TV_numOfTotal);
            TV_Num_Progress=itemView.findViewById(R.id.TV_numOfProgress);
        }

        @Override
        public void onClick(View view) {
            // Goal 상세페이지로 이동
        }
    }

}
