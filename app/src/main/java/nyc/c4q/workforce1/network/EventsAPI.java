package nyc.c4q.workforce1.network;

import nyc.c4q.workforce1.model.Events;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Shant on 3/3/2018.
 */

public interface EventsAPI {

    @GET("/resource/5hb8-th9w.json")
    Call<Events> getAllEvents();

}
