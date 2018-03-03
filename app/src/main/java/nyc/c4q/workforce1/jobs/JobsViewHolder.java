package nyc.c4q.workforce1.jobs;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.workforce1.R;
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
        tv1.setText(job.getPositionTitle());
        tv2.setText(job.getPositionType());
        tv3.setText(job.getBorough());

    }
}
