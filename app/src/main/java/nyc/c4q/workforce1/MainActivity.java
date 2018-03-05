package nyc.c4q.workforce1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

import nyc.c4q.workforce1.fragments.EventsFragments;
import nyc.c4q.workforce1.fragments.JobsFragment;
import nyc.c4q.workforce1.notificationJob.NotificationJob;
import static nyc.c4q.workforce1.presenter.FilterPresenter.filterData;


@RequiresApi(api = Build.VERSION_CODES.M)
public class MainActivity extends AppCompatActivity {

    private static final int NUM_PAGES = 3;
    private ViewPager pager;
    private PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String intentID = getIntent().getStringExtra("id");// id from intent for page adapter

        pager = findViewById(R.id.main_view_pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);
        scheduleJob(this);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);


        filterData();
    }

    @Override
    public void onBackPressed() {
        if (pager.getCurrentItem() == 0) {

            super.onBackPressed();
        } else {

            pager.setCurrentItem(pager.getCurrentItem() - 1);
        }
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    EventsFragments eventsFragments = new EventsFragments();
                    return eventsFragments;
                case 1:
                    JobsFragment jobsFragment = new JobsFragment();
                    return jobsFragment;
                case 2:
                    MapFragment mapFragment = new MapFragment();
                    return mapFragment;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String title = "";
            switch (position) {
                case 0:
                    title = "Events";
                    break;
                case 1:
                    title = "Jobs";
                    break;
                case 2:
                    title = "Centers";
                    break;
            }
            return title;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.filter, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        Log.d("Message", "onOptionsItemSelected: clicked ");

        switch (item.getItemId()) {
            case R.id.filter_menu:
                // get a reference to the already created main layout
                CoordinatorLayout mainLayout = findViewById(R.id.main_activity_hopefully);
                Log.d("Message", "onOptionsItemSelected: clicked ");

                // inflate the layout of the popup window
                LayoutInflater inflater = (LayoutInflater)
                        getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = inflater.inflate(R.layout.activity_filter, null);

                // create the popup window
                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true; // lets taps outside the popup also dismiss it
                final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

                // show the popup window
                popupWindow.showAtLocation(mainLayout, Gravity.CENTER, 0, 0);

                // dismiss the popup window when touched
                popupView.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        popupWindow.dismiss();
                        return true;
                    }
                });
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public static void scheduleJob(Context context) {
        /*
          The ComponentName object is the component we are using. Components available in Android include BroadcastReceiver, ContentProvider, Activity, and Service. In our case we provide TestJobService as the second parameter to the ComponentName constructor because our TestJobService extends a JobService
        */
        ComponentName serviceComponent = new ComponentName(context, NotificationJob.class);


        /*The JobInfo object allows you to define the criteria for the JobService. Specifying when the Job should be performed, what broadcasts to listen for to start the Job (i.e. device charging, connected to network, etc..) and other settings. the Job ID is used by the OS to ensure multiple instances of the same Jobs are not scheduled, this number is arbitrary and we can specify our own*/
        JobInfo.Builder jobInfo = new JobInfo.Builder(0, serviceComponent);

        /*Tell Android to wait a maximum of 3 seconds. Why? The entire point of the JobScheduler is to group together similar tasks then execute them simultaneously in order to save battery. Android will wait a set amount of time for other similar Jobs to be scheduled before beginning execution of those jobs. Example, multiple apps need to download some data, one app schedules a networking job, android will hold on to that job for a set amount of time to see if any other apps also request to use the network connection. We can tell Android to not wait more than x amount of time with the setOverrideDeadline. As the name implies, we are overriding the OS' default deadline */
        jobInfo.setOverrideDeadline(1000*60);
        jobInfo.setMinimumLatency(1000 * 5);


        //get the JobScheduler service that will be scheduling our Jobs
        JobScheduler jobScheduler = context.getSystemService(JobScheduler.class);

        //build the job and schedule it if the jobScheduler is not null
        if (jobScheduler != null) {
            jobScheduler.schedule(jobInfo.build());
        }

    }



}
