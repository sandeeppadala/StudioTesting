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


public class NovFragment extends Fragment {

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


        Event sharanya=new Event();
        sharanya.date="21st Nov";
        sharanya.name="Sharanya Birth Day";
        sharanya.eventType= EventTypes.EVENT_BDAY;
        sharanya.resourceId=R.drawable.sharru;
        events.add(sharanya);

        Event madhu=new Event();
        madhu.date="21st Nov";
        madhu.name="Madhu Birth Day";
        madhu.eventType= EventTypes.EVENT_BDAY;
        madhu.resourceId=R.drawable.madhu;
        events.add(madhu);

        Event aurna=new Event();
        aurna.date="21st Nov";
        aurna.name="Aruna Birth Day";
        aurna.eventType= EventTypes.EVENT_BDAY;
        aurna.resourceId=R.drawable.aruna;
        events.add(aurna);

        Event srinu=new Event();
        srinu.date="21st Nov";
        srinu.name="Srinivas Birth Day";
        srinu.eventType= EventTypes.EVENT_BDAY;
        srinu.resourceId=R.drawable.sreenunew;
        events.add(srinu);

        Event sunny=new Event();
        sunny.date="22nd Nov";
        sunny.name="Sunny Birth Day";
        sunny.eventType= EventTypes.EVENT_BDAY;
        sunny.resourceId=R.drawable.saandy;
        events.add(sunny);

        Event sunitha=new Event();
        sunitha.date="28nd Nov";
        sunitha.name="Sunitha Birth Day";
        sunitha.eventType= EventTypes.EVENT_BDAY;
        sunitha.resourceId=R.drawable.sunni;
        events.add(sunitha);


        return events;
    }

}
