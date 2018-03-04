package nyc.c4q.workforce1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import nyc.c4q.workforce1.fragments.EventsFragments;
import nyc.c4q.workforce1.fragments.JobsFragment;


public class MainActivity extends FragmentActivity {

    private static final int NUM_PAGES = 2;
    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.main_view_pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);

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
            }
            return title;
        }
    }

}
