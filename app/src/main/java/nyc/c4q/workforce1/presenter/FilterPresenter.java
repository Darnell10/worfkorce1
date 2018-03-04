package nyc.c4q.workforce1.presenter;

import android.util.Log;

import java.util.List;

import nyc.c4q.workforce1.FilterDummyData;
import nyc.c4q.workforce1.model.DummyData;
import nyc.c4q.workforce1.model.Event;
import nyc.c4q.workforce1.model.Job;

/**
 * Created by C4Q on 3/4/18.
 */

public class FilterPresenter {

    // a reference to your Lists. assume it has a method something like: database.addData(Data data)
    public static List<Job> jobList = DummyData.jobList;
    public static List<Event> eventList = DummyData.eventList;
    public static List<Job> filteredjobs;
    public static List<Event> filteredevents;

    // a reference to your retrofit api or networking assemble. assume it has a method something like: api.getData()
    // private RetrofitService api;

    public FilterPresenter(List<Job> jobList, List<Event> eventList) {
        this.jobList = jobList;
        this.eventList = eventList;
    }

    public static void filterData() {

        FilterDummyData filterCriteria = new FilterDummyData();

        filterCriteria.setPositionType("Film & Industry");
        filterCriteria.setWageMax(24.00);
        filterCriteria.setWageMin(15.00);

        for (int i = 0; i < jobList.size(); i++) {
            for (int j = 0; j < eventList.size(); j++) {
                Job job = jobList.get(i);
                Event event = eventList.get(j);
                Log.d("EVENTS: ", "onCreate: " + event);
                Log.d("JOBS: ", "onCreate: " + job);
                if (job.getWageMin() >= filterCriteria.getWageMin()
                        && job.getWageMax() < filterCriteria.getWageMax()
                        && job.getPositionType() == filterCriteria.getPositionType()) {
                    filteredjobs.add(job);
                    filteredevents.add(event);
                }
            }
        }

    }

}
