package nyc.c4q.workforce1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.jobs.JobsAdapter;
import nyc.c4q.workforce1.model.DummyData;
import nyc.c4q.workforce1.model.Job;

/**
 * A simple {@link Fragment} subclass.
 */
public class JobsFragment extends Fragment {
    View rootView;
    RecyclerView recyclerView;
    List<Job> jobList;


    public JobsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_jobs, container, false);
        recyclerView = rootView.findViewById(R.id.jobs_recyclerview);
        jobList = DummyData.jobList;
        JobsAdapter jobsAdapter = new JobsAdapter(jobList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setAdapter(jobsAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

        return rootView;
    }

}
