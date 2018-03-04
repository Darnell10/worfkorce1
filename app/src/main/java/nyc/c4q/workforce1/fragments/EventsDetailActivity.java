package nyc.c4q.workforce1.fragments;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.model.DummyData;
import nyc.c4q.workforce1.model.Event;



public class EventsDetailActivity extends AppCompatActivity {
    TextView borough, checkInFrom, checkInTo, companyName, eventDate, eventTitle,location,locationNameAndAddress,qualifications;

    Event event = DummyData.eventList.get(0);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_detail);

        borough= findViewById(R.id.event_borough);
        checkInFrom =findViewById(R.id.checkIn_From);
        checkInTo =findViewById(R.id.event_title);
        companyName =findViewById(R.id.event_company_Name);
        eventDate =findViewById(R.id.event_date);
        eventTitle =findViewById(R.id.event_title);
        location =findViewById(R.id.job_location);
        locationNameAndAddress =findViewById(R.id.event_location_address);
        qualifications =findViewById(R.id.event_qualification);

        borough.setText(event.getBorough());
        checkInFrom.setText(event.getCheckInFrom().toString());
        checkInTo.setText(event.getCheckInTo().toString());
        companyName.setText(event.getCompanyNameOrType());
        eventDate.setText(event.getEventDate().toString());
        eventTitle.setText(event.getEventTitle());
        location.setText(event.getLocation());
        locationNameAndAddress.setText(event.getLocationNameAndAddress());
        qualifications.setText(event.getQualifications());


    }
}






