package nyc.c4q.workforce1.events_rv;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Date;

import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.model.Event;

import static nyc.c4q.workforce1.R.*;

/**
 * Created by D on 3/3/18.
 */

public class Events_Holder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView borough;
    private TextView checkin_to;
    private TextView checkin_from;
    private TextView eventTitle;
    private TextView location;
    private TextView address;
    private TextView qualifications;


    public Events_Holder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(id.job_image);
        borough = itemView.findViewById(id.borough);
        checkin_to = itemView.findViewById(id.checkin_to);
        checkin_from = itemView.findViewById(R.id.checkin_from);
        eventTitle = itemView.findViewById(R.id.event_title);
        location = itemView.findViewById(id.location);
        address = itemView.findViewById(id.address);
        qualifications = itemView.findViewById(id.qualification);

    }

    public void onBind(Event event) {
        Event thisEvent = event;

        borough.setText(thisEvent.getBorough());
        checkin_to.setText((CharSequence) thisEvent.getCheckInTo());
        checkin_from.setText((CharSequence) thisEvent.getCheckInFrom());
        eventTitle.setText(thisEvent.getEventTitle());
        location.setText(thisEvent.getLocation());
        address.setText(thisEvent.getLocationNameAndAddress());
        qualifications.setText(thisEvent.getQualifications());


    }
}
