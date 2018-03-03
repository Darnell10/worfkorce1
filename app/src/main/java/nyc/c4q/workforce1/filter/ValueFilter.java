package nyc.c4q.workforce1.filter;

import android.widget.Filter;
import android.widget.Filterable;

import java.util.List;

import nyc.c4q.workforce1.model.DummyData;
import nyc.c4q.workforce1.model.Event;
import nyc.c4q.workforce1.model.Job;

import static nyc.c4q.workforce1.model.DummyData.populateEventList;
import static nyc.c4q.workforce1.model.DummyData.populateJobList;

/**
 * Created by C4Q on 3/3/18.
 */

public class ValueFilter extends Filter {

    public static List<Job> jobList = populateJobList();

    public static List<Event> eventList = populateEventList();

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
           for(int i = 0; i < jobList.size(); i++){
               if(DummyData.jobList != null){

               }
           }

        return null;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {

    }
}
