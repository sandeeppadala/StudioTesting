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


public class JulyFragment extends Fragment {

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
        Event vicky=new Event();
        vicky.date="21st july";
        vicky.name="Vicky Birth day";
        vicky.eventType= EventTypes.EVENT_BDAY;
        vicky.resourceId=R.drawable.vicky;
        events.add(vicky);

        Event srithi=new Event();
        srithi.date="21st july";
        srithi.name="Srithi Birth day";
        srithi.eventType= EventTypes.EVENT_BDAY;
        srithi.resourceId=R.drawable.srithinew;
        events.add(srithi);

        Event indu=new Event();
        indu.date="29th july";
        indu.name="Indu Birth day";
        indu.eventType= EventTypes.EVENT_BDAY;
        indu.resourceId=R.drawable.indu;
        events.add(indu);

        return events;
    }
}
