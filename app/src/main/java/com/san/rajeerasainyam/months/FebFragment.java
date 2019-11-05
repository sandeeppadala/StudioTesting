package com.san.rajeerasainyam.months;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.san.rajeerasainyam.R;
import com.san.rajeerasainyam.adapters.EventsListAdapter;
import com.san.rajeerasainyam.bean.Event;
import com.san.rajeerasainyam.bean.EventTypes;

import java.util.ArrayList;


public class FebFragment extends Fragment {

    RecyclerView recyclerView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jan, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViewsAndSetData();
    }

    private void initViewsAndSetData() {
        recyclerView=getView().findViewById(R.id.rides_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        EventsListAdapter listAdapater = new EventsListAdapter(getActivity(), getThisMonthEvents());
        recyclerView.setAdapter(listAdapater);
    }

    public ArrayList<Event> getThisMonthEvents()
    {
        ArrayList<Event> events=new ArrayList<Event>();
        Event shiri=new Event();
        shiri.date="Feb 8th";
        shiri.name="Shirisha Birth Day";
        shiri.eventType= EventTypes.EVENT_BDAY;
        shiri.resourceId=R.drawable.shiri;
        events.add(shiri);


        return events;
    }

}
