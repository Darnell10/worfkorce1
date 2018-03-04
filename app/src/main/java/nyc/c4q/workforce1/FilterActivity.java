package nyc.c4q.workforce1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import java.util.List;

import nyc.c4q.workforce1.model.DummyData;
import nyc.c4q.workforce1.model.Event;
import nyc.c4q.workforce1.model.Job;

public class FilterActivity extends AppCompatActivity {

    public static List<Job> jobList = DummyData.jobList;
    public static List<Event> eventList = DummyData.eventList;
    public List<Job> filteredjobs;
    public List<Event> filteredevents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

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