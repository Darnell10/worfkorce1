package nyc.c4q.workforce1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.events_rv.EventsAdapter;
import nyc.c4q.workforce1.model.DummyData;
import nyc.c4q.workforce1.model.Event;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragments extends Fragment {

    private List<Event> eventList;
    private RecyclerView recyclerView;
    private View rootview;



    public EventsFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview = inflater.inflate(R.layout.fragment_events_fragments, container, false);
       // EventsAdapter events_adapter = new EventsAdapter();
        recyclerView = rootview.findViewById(R.id.recycler_view);
        eventList = DummyData.eventList;
        Event event = eventList.get(0);
        Log.d("CHECKTIME",""+event.getCheckInFrom());
        EventsAdapter events_adapter = new EventsAdapter(eventList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setAdapter(events_adapter);
        recyclerView.setLayoutManager(linearLayoutManager);



        return rootview;
    }

}
