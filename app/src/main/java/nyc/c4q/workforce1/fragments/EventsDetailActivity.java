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

//        borough= findViewById(R.id.job_borough);
//        checkInFrom =findViewById(R.id.checkIn_From);
//        checkInTo =findViewById(R.id.event_title);
//        companyName =findViewById(R.id.company_Name);
//        eventDate =findViewById(R.id.date);
//        eventTitle =findViewById(R.id.event_title);
//        location =findViewById(R.id.job_location);
//        locationNameAndAddress =findViewById(R.id.location_address);
//        qualifications =findViewById(R.id.qualification);

    }
}


//            android:id="@+id/event_title"

//            android:id="@+id/company_Name"

//            android:id="@+id/date"

//            android:id="@+id/job_borough"

//            android:id="@+id/job_location"

//            android:id="@+id/location_address"

//            android:id="@+id/checkIn_From"

//            android:id="@+id/checkIn_To"

//            android:id="@+id/qualification"




