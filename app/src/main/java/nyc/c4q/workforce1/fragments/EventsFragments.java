package nyc.c4q.workforce1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONException;

import java.util.List;

import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.events_rv.Events_Adapter;
import nyc.c4q.workforce1.model.DummyData;
import nyc.c4q.workforce1.model.Event;
import nyc.c4q.workforce1.model.StaticEventJSON;

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
       // Events_Adapter events_adapter = new Events_Adapter();
        recyclerView = rootview.findViewById(R.id.recycler_view);
        try {
            eventList = StaticEventJSON.getListFromJSON();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Events_Adapter events_adapter = new Events_Adapter(eventList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setAdapter(events_adapter);
        recyclerView.setLayoutManager(linearLayoutManager);


        return rootview;
    }

}
