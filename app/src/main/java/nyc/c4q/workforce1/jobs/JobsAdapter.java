package nyc.c4q.workforce1.jobs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.model.Job;

/**
 * Created by c4q on 3/3/18.
 */

public class JobsAdapter extends RecyclerView.Adapter<JobsViewHolder> {
    List<Job> jobsList;
    //View.OnClickListener saveButtonOnClick;
    //View.OnClickListener applyButtonOnClick;

    public JobsAdapter(List<Job> jobsList) {
        this.jobsList = jobsList;
        //this.saveButtonOnClick = saveButtonOnClick;
        //this.applyButtonOnClick = applyButtonOnClick;
    }

    @Override
    public JobsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.jobs_itemview, parent, false);
        return new JobsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(JobsViewHolder holder, int position) {
        Job job = jobsList.get(position);
        holder.onBind(job);

       //holder.applyBtn.setOnClickListener(applyButtonOnClick);
        //holder.saveBtn.setOnClickListener(saveButtonOnClick);


    }

    @Override
    public int getItemCount() {
        return jobsList.size();
    }
}
