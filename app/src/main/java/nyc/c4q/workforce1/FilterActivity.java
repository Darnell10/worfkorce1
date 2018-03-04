package nyc.c4q.workforce1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import nyc.c4q.workforce1.model.DummyData;
import nyc.c4q.workforce1.model.Event;
import nyc.c4q.workforce1.model.Job;

import static nyc.c4q.workforce1.model.DummyData.populateEventList;
import static nyc.c4q.workforce1.model.DummyData.populateJobList;

public class FilterActivity extends AppCompatActivity {

    public static List<Job> jobList = DummyData.jobList;
    public static List<Event> eventList = DummyData.eventList;
    public List<Job> filteredjobs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        FilterDummyData filterCriteria = new FilterDummyData();

        filterCriteria.setPositionType("Film & Industry");
        filterCriteria.setWageMax(24.00);
        filterCriteria.setWageMin(15.00);

        for (int i = 0; i < jobList.size(); i++) {
            Job job = jobList.get(i);
            Log.d("Position", "onCreate: " + job);
            if (job.getWageMin() >= filterCriteria.getWageMin()
                    && job.getWageMax() < filterCriteria.getWageMax()
                    && job.getPositionType() == filterCriteria.getPositionType()) {
                filteredjobs.add(job);
            }
        }
    }
}
