package nyc.c4q.workforce1.controller;

import android.widget.Filter;
import android.widget.Filterable;
import java.util.List;
import nyc.c4q.workforce1.model.Event;
import nyc.c4q.workforce1.model.Job;
import static nyc.c4q.workforce1.model.DummyData.populateEventList;
import static nyc.c4q.workforce1.model.DummyData.populateJobList;

/**
 * Created by C4Q on 3/3/18.
 */

public class DummyAdapter implements Filterable {

    public static List<Job> jobList = populateJobList();

    public static List<Event> eventList = populateEventList();

    @Override
    public Filter getFilter() {
        return null;
    }
}
