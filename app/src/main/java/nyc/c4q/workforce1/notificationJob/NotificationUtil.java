package nyc.c4q.workforce1.notificationJob;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;

import nyc.c4q.workforce1.MainActivity;
import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.fragments.EventsFragments;

/**
 * Created by AmyRivera on 3/4/18.
 */

public class NotificationUtil {
    private static final int NOTIFICATION_ID = 000;
    private static String NOTIFICATION_CHANNEL = "New Events";
    public static boolean notificationFired = false;

    public static void fireNotification(Context context) {

        if(notificationFired){
            return;
        }

        Intent weatherIntent = new Intent(context, MainActivity.class);
        int requestID = (int) System.currentTimeMillis();
        int flags = PendingIntent.FLAG_CANCEL_CURRENT;
        PendingIntent pendingIntent = PendingIntent.getActivity(context, requestID, weatherIntent, flags);
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(context, NOTIFICATION_CHANNEL)
                .setSmallIcon(R.drawable.icon)
                .setContentTitle("Events")
                .setContentText("Events in your area")
                .setTicker("Alert New Events")
                .setContentIntent(pendingIntent)
                .setAutoCancel(true);
        notificationBuilder.setPriority(Notification.PRIORITY_HIGH);
        if (Build.VERSION.SDK_INT >= 21) notificationBuilder.setVibrate(new long[0]);

        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(NOTIFICATION_ID, notificationBuilder.build());

    }

}
