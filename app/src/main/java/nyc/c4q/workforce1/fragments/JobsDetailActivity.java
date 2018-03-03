package nyc.c4q.workforce1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.model.DummyData;
import nyc.c4q.workforce1.model.Job;

/**
 * A simple {@link Fragment} subclass.
 */
public class JobsDetailActivity extends AppCompatActivity {
    TextView company, title, location, type, description, maxWage, minWage, maxHour, minHour, experience, requirement, rate;
    Button url;
    ImageView logo;
    Job job = DummyData.jobList.get(0);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_detail);


        company =  findViewById(R.id.job_company);
        title = findViewById(R.id.job_title);
        location = findViewById(R.id.job_location);
        type = findViewById(R.id.job_type);
        description = findViewById(R.id.job_description);
        url = findViewById(R.id.comp_url);
        logo = findViewById(R.id.company_logo);
        maxWage = findViewById(R.id.max_wage);
        minWage= findViewById(R.id.min_wage);
        maxHour= findViewById(R.id.max_hours);
        minHour= findViewById(R.id.min_hours);
        experience= findViewById(R.id.experience);
        requirement= findViewById(R.id.ed_requirements);
        rate= findViewById(R.id.rate);

        title.setText(job.getPositionTitle());
        location.setText(job.getBorough());
        type.setText(job.getPositionType());
        description.setText(job.getPositionDescritption());
        maxWage.setText(job.getWageMax().toString());
        minWage.setText(job.getWageMin().toString());
        maxHour.setText(job.getMaxHoursPerWeek());
        minHour.setText(job.getMinHoursPerWeek());
        experience.setText(job.getCandidateExperienceQualificationSkills());
        requirement.setText(job.getEducationRequired());


    }

}
