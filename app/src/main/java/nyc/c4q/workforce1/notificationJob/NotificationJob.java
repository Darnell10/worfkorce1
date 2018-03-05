package nyc.c4q.workforce1.notificationJob;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.widget.Toast;

/**
 * Created by AmyRivera on 3/4/18.
 */

public class NotificationJob extends JobService {
    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        NotificationUtil.fireNotification(getApplicationContext());
        NotificationUtil.notificationFired = true;
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {

        return false;
    }
}
