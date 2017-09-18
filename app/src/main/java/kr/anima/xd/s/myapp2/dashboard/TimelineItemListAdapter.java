package kr.anima.xd.s.myapp2.dashboard;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.vipulasri.timelineview.TimelineView;

/**
 * Created by alfo6-10 on 9/5/2017.
 */

public class TimelineItemListAdapter extends RecyclerView.Adapter<TimelineItemListAdapter.TimelineViewHolder> {

    final int NUM_ITEM=5;

    public TimelineItemListAdapter() {
    }

    @Override
    public TimelineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(TimelineViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class TimelineViewHolder extends RecyclerView.ViewHolder{
        TextView mDate;
        TextView mMessage;
        TimelineView mTimelineView;
        public TimelineViewHolder(View itemView) {
            super(itemView);
        }
    }

}
