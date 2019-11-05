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


public class DecFragment extends Fragment {

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
        Event dhamuBday=new Event();
        dhamuBday.date="5th Dec";
        dhamuBday.name="Dhamodar Birth Day";
        dhamuBday.eventType= EventTypes.EVENT_BDAY;
        dhamuBday.resourceId=R.drawable.dhamu;
        events.add(dhamuBday);

        Event chintu=new Event();
        chintu.date="6th Dec";
        chintu.name="Chintu Birth Day";
        chintu.eventType= EventTypes.EVENT_BDAY;
        chintu.resourceId=R.drawable.chintu;
        events.add(chintu);

        Event anuBday=new Event();
        anuBday.date="12th Dec";
        anuBday.name="Anusha Birth Day";
        anuBday.eventType= EventTypes.EVENT_BDAY;
        anuBday.resourceId=R.drawable.anu;
        events.add(anuBday);

        Event ushaBday=new Event();
        ushaBday.date="14th Dec";
        ushaBday.name="Usha Birth Day";
        ushaBday.eventType= EventTypes.EVENT_BDAY;
        ushaBday.resourceId=R.drawable.usha;
        events.add(ushaBday);

        Event araviBday=new Event();
        araviBday.date="17th Dec";
        araviBday.name="Aravind Birth Day";
        araviBday.eventType= EventTypes.EVENT_BDAY;
        araviBday.resourceId=R.drawable.aravind;
        events.add(araviBday);

        Event rishi=new Event();
        rishi.date="18th Dec";
        rishi.name="Rishitha Birth Day";
        rishi.eventType= EventTypes.EVENT_BDAY;
        rishi.resourceId=R.drawable.rishi;
        events.add(rishi);

        return events;
    }



}
