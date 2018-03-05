package nyc.c4q.workforce1.fragments;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.model.DummyData;
import nyc.c4q.workforce1.model.Event;



public class EventsDetailActivity extends AppCompatActivity {
    TextView borough, checkInFrom, checkInTo, eventDate, eventTitle,location,locationNameAndAddress,qualifications;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_detail);

        Bundle bundle = getIntent().getExtras();

        borough= findViewById(R.id.event_borough);
        checkInFrom =findViewById(R.id.checkIn_From);
        checkInTo =findViewById(R.id.event_title);
        eventDate =findViewById(R.id.event_date);
        eventTitle =findViewById(R.id.event_title);
        location =findViewById(R.id.event_location);
        locationNameAndAddress =findViewById(R.id.event_location_address);
        qualifications =findViewById(R.id.event_qualification);

        borough.setText(bundle.getString("borough"));
        checkInFrom.setText(bundle.getString("from"));
        checkInTo.setText(bundle.getString("to"));
        eventDate.setText(bundle.getString("date"));
        eventTitle.setText(bundle.getString("title"));
        location.setText(bundle.getString("location"));
        locationNameAndAddress.setText(bundle.getString("address"));
        qualifications.setText(bundle.getString("qualifications"));


    }





}






