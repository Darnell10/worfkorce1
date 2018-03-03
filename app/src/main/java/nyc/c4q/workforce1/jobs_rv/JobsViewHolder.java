package nyc.c4q.workforce1.jobs_rv;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.model.Job;
import nyc.c4q.workforce1.model.Jobs;

/**
 * Created by c4q on 3/3/18.
 */

public class JobsViewHolder extends RecyclerView.ViewHolder {
    TextView tv1;
    TextView tv2;
    TextView tv3;
    //public Button saveBtn;
    //public Button applyBtn;
    public LinearLayout linearLayout;

    public JobsViewHolder(View itemView) {
        super(itemView);

        tv1 = itemView.findViewById(R.id.git_jobs_title_text_view);
        tv2 = itemView.findViewById(R.id.git_jobs_company_text_view);
        tv3 = itemView.findViewById(R.id.git_jobs_location_text_view);
        //saveBtn = itemView.findViewById(R.id.save_btn);
        //applyBtn = itemView.findViewById(R.id.apply_btn);
        linearLayout = itemView.findViewById(R.id.job_item_layout);
    }
    public void onBind(Job job) {
        tv1.setText(job.getPositionTitle());
        tv2.setText(job.getPositionType());

    }
}
