package com.san.rajeerasainyam.adapters;

import android.content.Context;
import android.content.DialogInterface;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.san.rajeerasainyam.R;
import com.san.rajeerasainyam.bean.Event;

import java.util.List;


/**
 * Created by on 6/21/2017.
 */

public class EventsListAdapter extends RecyclerView.Adapter<EventsListAdapter.MyViewHolder> {


    public List<Event> events;
    private Context mContext;



    public EventsListAdapter(Context context, List<Event> events) {
        mContext = context;
        this.events = events;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.events_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Event event = events.get(position);
        holder.tvDisplayName.setText(event.name);
        holder.tvPick.setText(event.date);

        Glide.with(mContext).load(event.resourceId).into(holder.btnDelete);

    }



    private String getColoredSpanned(String text, String color) {
        String input = "<font color=" + color + ">" + text + "</font>";
        return input;
    }

    @Override
    public int getItemCount() {
        return events.size();
    }




    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView tvDisplayName;
        public TextView tvPick;
        public TextView tvDrop;
        public TextView tvStartTime;
        public ImageView btnDelete;
        public RelativeLayout parent;



        public MyViewHolder(View view) {
            super(view);
            tvDisplayName = (TextView) view.findViewById(R.id.tv_display_name);
            tvPick = (TextView) view.findViewById(R.id.tv_pick);


            btnDelete=view.findViewById(R.id.btn_delete);
            parent=view.findViewById(R.id.parent);


        }
    }



}