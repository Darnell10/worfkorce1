package nyc.c4q.workforce1.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.model.DummyData;
import nyc.c4q.workforce1.model.Job;


public class JobsDetailActivity extends AppCompatActivity {
    TextView company, title, location, type, description, maxWage, minWage, maxHour, minHour, experience, requirement, rate;
    //Button url;
    ImageView logo;
    Job job = DummyData.jobList.get(0);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_detail);


      //  company =  findViewById(R.id.job_company);
        title = findViewById(R.id.job_title);
        location = findViewById(R.id.job_location);
        type = findViewById(R.id.job_type);
        description = findViewById(R.id.job_description);
       // url = findViewById(R.id.comp_url);
        logo = findViewById(R.id.company_logo);
        maxWage = findViewById(R.id.max_wage);
        minWage= findViewById(R.id.min_wage);
        maxHour= findViewById(R.id.max_hours);
        minHour= findViewById(R.id.min_hours);
        experience= findViewById(R.id.experience);
        requirement= findViewById(R.id.ed_requirements);
        rate= findViewById(R.id.rate);

        Bundle extras = getIntent().getExtras();

        title.setText(extras.getString("title"));
        location.setText(extras.getString("borough"));
        type.setText(extras.getString("type"));
        description.setText(extras.getString("desc"));
        maxWage.setText(extras.getString("wageMax"));
        minWage.setText(extras.getString("wageMin"));
        maxHour.setText(extras.getString("hoursMax"));
        minHour.setText(extras.getString("hoursMin"));
        experience.setText(extras.getString("exp"));
        requirement.setText(extras.getString("req"));


    }

}
