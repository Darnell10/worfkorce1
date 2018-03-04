package nyc.c4q.workforce1.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by Shant on 3/4/2018.
 */

public class CenterLocations {
    final static String centersJSON = "{\"centers\":[{\n" +
            "\"name\":\"Bronx Employment Works\",\n" +
            "\"Hours\":\"Mon - Wed: 9:00 AM - 5:00 PM; Thu - Fri: 9:00 AM - 7:00 PM\",\n" +
            "\"details\":\"Dedicated Veteran Specialist available to connect veterans and their spouses to training, jobs, and supportive services to meet your career goals while leveraging your military skills and experiences. Workforce1 Career Centers are a proud partner of the American Job Center network. Please call 311 to contact this location.\"\n" +
            "\"lat\":\"40.815895\",\n" +
            "\"long\":\"-73.919111\"},\n" +
            "{\n" +
            "\"name\":\"Flushing Workforce1 Career Center\",\n" +
            "\"Hours\":\"Mon - Fri: 9:00 AM - 5:00 PM\",\n" +
            "\"details\":\"Workforce1 Career Centers are a proud partner of the American Job Center network. Please call 311 to contact this location.\"\n" +
            "\"lat\":\"41.14282\",\n" +
            "\"long\":\"-73.828913\"},\n" +
            "{\n" +
            "\"name\":\"Long Island City Workforce1 Career Center\",\n" +
            "\"Hours\":\"Mon - Fri: 9:00 AM - 5:00 PM\",\n" +
            "\"details\":\"Dedicated Veteran Specialist available to connect veterans and their spouses to training, jobs, and supportive services to meet your career goals while leveraging your military skills and experiences. Workforce1 Career Centers are a proud partner of the American Job Center network. Please call 311 to contact this location.\"\n" +
            "\"lat\":\"40.755758\",\n" +
            "\"long\":\"-73.941707\"},\n" +
            "{\n" +
            "\"name\":\"Midtown Workforce1 Career Center\",\n" +
            "\"Hours\":\"Mon - Fri: 9:00 AM - 5:00 PM\",\n" +
            "\"details\":\"Dedicated Veteran Specialist available to connect veterans and their spouses to training, jobs, and supportive services to meet your career goals while leveraging your military skills and experiences. Workforce1 Career Centers are a proud partner of the American Job Center network. Please call 311 to contact this location.\"\n" +
            "\"lat\":\"40.747774\",\n" +
            "\"long\":\"-73.987874\"}\n" +
            ",{\n" +
            "\"name\":\"Queens Workforce1 Career Center\",\n" +
            "\"Hours\":\"Mon - Wed: 9:00 AM - 5:00 PM; Thu - Fri: 9:00 AM - 7:00 PM\",\n" +
            "\"details\":\"Dedicated Veteran Specialist available to connect veterans and their spouses to training, jobs, and supportive services to meet your career goals while leveraging your military skills and experiences. Workforce1 Career Centers are a proud partner of the American Job Center network. Please call 311 to contact this location.\"\n" +
            "\"lat\":\"40.707139\",\n" +
            "\"long\":\"-73.791644\"},\n" +
            "{\n" +
            "\"name\":\"Washington Heights Workforce1 Career Center\",\n" +
            "\"Hours\":\"Mon - Fri: 8:30 AM - 5:00 PM\",\n" +
            "\"details\":\"Dedicated Veteran Specialist available to connect veterans and their spouses to training, jobs, and supportive services to meet your career goals while leveraging your military skills and experiences. Workforce1 Career Centers are a proud partner of the American Job Center network. Please call 311 to contact this location.\"\n" +
            "\"lat\":\"40.848357\",\n" +
            "\"long\":\"-73.932207\"},\n" +
            "{\n" +
            "\"name\":\"Rockaway Workforce1 Career Center\",\n" +
            "\"Hours\":\"Mon - Fri: 8:30 AM - 5:00 PM\",\n" +
            "\"details\":\"Dedicated Veteran Specialist available to connect veterans and their spouses to training, jobs, and supportive services to meet your career goals while leveraging your military skills and experiences. Workforce1 Career Centers are a proud partner of the American Job Center network. Please call 311 to contact this location.\"\n" +
            "\"lat\":\"40.590668\",\n" +
            "\"long\":\"-73.78751\"},\n" +
            "{\n" +
            "\"name\":\"Brooklyn Workforce1 Career Center\",\n" +
            "\"Hours\":\"Mon - Fri: 9:00 AM - 5:00 PM\",\n" +
            "\"details\":\"Dedicated Veteran Specialist available to connect veterans and their spouses to training, jobs, and supportive services to meet your career goals while leveraging your military skills and experiences. Workforce1 Career Centers are a proud partner of the American Job Center network. Please call 311 to contact this location.\"\n" +
            "\"lat\":\"40.689247\",\n" +
            "\"long\":\"-73.982865}\n" +
            "]}";

    public static JSONArray getCenters() throws JSONException {
        JSONObject obj = new JSONObject(centersJSON);
        return obj.getJSONArray("centers");
    }



}
