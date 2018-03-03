package nyc.c4q.workforce1.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.model.DummyData;

/**
 * A simple {@link Fragment} subclass.
 */
public class JobsDetailFragment extends Fragment {
    TextView company, title, location, type, description, maxWage, minWage, maxHour, minHour, experience, requirement, rate,;
    Button url;
    ImageView logo;
    String job_id;
    String result;
    List<DummyData> jobs = new ArrayList<>();
    Context context;


    DummyData job = new DummyData();
//    GitJobsDBHelper db;


    public JobsDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View rootView = inflater.inflate(R.layout.fragment_jobs_detail, container, false);
        company = rootView.findViewById(R.id.job_company);
        title = rootView.findViewById(R.id.job_title);
        location = rootView.findViewById(R.id.job_location);
        type = rootView.findViewById(R.id.job_type);
        description = rootView.findViewById(R.id.job_description);
        url = rootView.findViewById(R.id.comp_url);
        logo = rootView.findViewById(R.id.company_logo);
        maxWage = rootView.findViewById(R.id.max_wage);
        minWage= rootView.findViewById(R.id.min_wage);
        maxHour= rootView.findViewById(R.id.max_hours);
        minHour= rootView.findViewById(R.id.min_hours);
        experience= rootView.findViewById(R.id.experience);
        requirement= rootView.findViewById(R.id.ed_requirements);
        rate= rootView.findViewById(R.id.rate);


        context = getActivity().getApplicationContext();


        return inflater.inflate(R.layout.fragment_jobs_detail, container, false);
    }

}
