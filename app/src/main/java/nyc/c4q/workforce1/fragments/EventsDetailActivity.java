package nyc.c4q.workforce1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Date;

import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.model.DummyData;
import nyc.c4q.workforce1.model.Event;
import nyc.c4q.workforce1.model.Job;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsDetailActivity extends AppCompatActivity {
    TextView borough, checkInFrom, checkInTo, companyName, eventDate, eventTitle,location,locationNameAndAddress,qualifications;


    Event event = DummyData.eventList.get(0);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_detail);

//        borough= findViewById(R.id.);
//        checkInFrom findViewById(R.id.);
//        checkInTo findViewById(R.id.);
//        companyName findViewById(R.id.);
//        eventDate findViewById(R.id.);
//        eventTitle findViewById(R.id.);
//        location findViewById(R.id.);
//        locationNameAndAddress findViewById(R.id.);
//        qualifications findViewById(R.id.);

    }
}




