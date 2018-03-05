package nyc.c4q.workforce1.events_rv;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Date;

import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.fragments.EventsDetailActivity;
import nyc.c4q.workforce1.fragments.EventsFragments;
import nyc.c4q.workforce1.model.Event;

import static nyc.c4q.workforce1.R.*;

/**
 * Created by D on 3/3/18.
 */

public class EventsHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView borough;
    private TextView checkin_to;
    private TextView checkin_from;
    private TextView eventTitle;
    private TextView location;
    private TextView address;
    private TextView qualifications;
    private TextView eventDate;

    public EventsHolder(View itemView) {
        super(itemView);

        checkin_to = itemView.findViewById(id.checkin_to);
        checkin_from = itemView.findViewById(R.id.checkin_from);
        eventTitle = itemView.findViewById(R.id.event_title);
        eventDate = itemView.findViewById(R.id.event_date);
        location = itemView.findViewById(R.id.location);
        address = itemView.findViewById(R.id.address);
        qualifications = itemView.findViewById(R.id.qualification);

    }

    public void onBind(final Event event) {
        final Event thisEvent = event;

        //borough.setText(thisEvent.getBorough());
        checkin_to.setText("9:30 AM");
        checkin_from.setText("9:00 AM");
        eventTitle.setText(thisEvent.getEventTitle());
        eventDate.setText("Tuesday, March 14, 2018");
        location.setText(thisEvent.getLocation());
        address.setText(thisEvent.getLocationNameAndAddress());
        qualifications.setText(thisEvent.getQualifications());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(itemView.getContext(),EventsDetailActivity.class);
                eventIntent.putExtra("borough", event.getBorough());
                eventIntent.putExtra("to", "9:30 AM");
                eventIntent.putExtra("from", "9:00 AM");
                eventIntent.putExtra("title", event.getEventTitle());
                eventIntent.putExtra("date", "Tuesday, March 14, 2018");
                eventIntent.putExtra("location", event.getLocation());
                eventIntent.putExtra("address", event.getLocationNameAndAddress());
                eventIntent.putExtra("qualifications", event.getQualifications());
                itemView.getContext().startActivity(eventIntent);
            }
        });

    }
}
