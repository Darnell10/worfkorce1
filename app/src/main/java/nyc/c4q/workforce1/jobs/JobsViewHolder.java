package nyc.c4q.workforce1.jobs;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.fragments.JobsDetailActivity;
import nyc.c4q.workforce1.model.Job;

/**
 * Created by c4q on 3/3/18.
 */

public class JobsViewHolder extends RecyclerView.ViewHolder {
    TextView tv1;
    TextView tv2;
    TextView tv3;
    //public Button saveBtn;
    //public Button applyBtn;


    public JobsViewHolder(View itemView) {
        super(itemView);

        tv1 = itemView.findViewById(R.id.git_jobs_title_text_view);
        tv2 = itemView.findViewById(R.id.git_jobs_company_text_view);
        tv3 = itemView.findViewById(R.id.git_jobs_location_text_view);
        //saveBtn = itemView.findViewById(R.id.save_btn);
        //applyBtn = itemView.findViewById(R.id.apply_btn);

    }
    public void onBind(Job job) {
        final String title = job.getPositionTitle();
        final String type = job.getPositionType();
        final String boro = job.getBorough();
        final String desc = job.getPositionDescritption();
        final String maxW = job.getWageMax().toString();
        final String minW = job.getWageMin().toString();
        final String maxH = Integer.toString(job.getMaxHoursPerWeek());
        final String minH = Integer.toString(job.getMinHoursPerWeek());
        final String exp = job.getCandidateExperienceQualificationSkills();
        final String req = job.getEducationRequired();



        tv1.setText(job.getPositionTitle());
        tv2.setText(job.getPositionType());
        tv3.setText(job.getBorough());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotToDetail = new Intent(itemView.getContext(), JobsDetailActivity.class);
                gotToDetail.putExtra("title",title);
                gotToDetail.putExtra("type",type);
                gotToDetail.putExtra("borough",boro);
                gotToDetail.putExtra("desc",desc);
                gotToDetail.putExtra("wageMax",maxW);
                gotToDetail.putExtra("wageMin",minW);
                gotToDetail.putExtra("hoursMax",maxH);
                gotToDetail.putExtra("hoursMin",minH);
                gotToDetail.putExtra("exp",exp);
                gotToDetail.putExtra("req",req);

                itemView.getContext().startActivity(gotToDetail);

            }
        });

    }
}
