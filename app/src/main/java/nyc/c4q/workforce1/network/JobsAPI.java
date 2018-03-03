package nyc.c4q.workforce1.network;

import nyc.c4q.workforce1.model.Event;
import nyc.c4q.workforce1.model.Events;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by Shant on 3/3/2018.
 */

public interface JobsAPI {

    @GET("/resource/b8h9-kfbp.json")
    Call<Events> getAllJobs();

}
