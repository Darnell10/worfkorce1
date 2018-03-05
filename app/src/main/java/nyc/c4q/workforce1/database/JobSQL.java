package nyc.c4q.workforce1.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by D on 3/4/18.
 */

public class JobSQL extends SQLiteOpenHelper {
    private static  JobSQL myJobs = null;
    private static final String DATABASE_NAME = "Jobs.db";
    private static final String TABLE_NAME = "JOBS";
    private static final int SCHEMA_VERSION = 1;


    private JobSQL(Context context){
        super(context,DATABASE_NAME,null,SCHEMA_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public static JobSQL getInstance( Context ctx){
        if (myJobs == null){
            myJobs = new JobSQL(ctx.getApplicationContext());
        }
        return myJobs;
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "CREATE TABLE " + TABLE_NAME +
                        "(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        //Add detail later
                        "borough TEXT, company_name TEXT,location TEXT, address Text,qualifications Text,position TEXT,education TEXT,p);");
    }

    public void addJob(Bundle bundle) {

        getWritableDatabase().execSQL(" INSERT INTO " + TABLE_NAME +
                "(borough,company_name,event_name,location, address,qualification) VALUES ("
                + "'" + bundle.getString("borough")+ "'"
                + "," +"'"+ bundle.getString("company")+"'"
                + "," + "'"+bundle.getString("address")
                + "," + "'"+bundle.getString("position")
                + "," + "'"+bundle.getString("education")
                +"," + "'" +bundle.getString("qualifications")
                + "');");
    }

    public List<SavedJobs> savedJobs() {
        List<SavedJobs> savedJobs = new ArrayList<>();
        Cursor cursor = getReadableDatabase().rawQuery(
                " SELECT * FROM " + TABLE_NAME + ";", null);

        if (cursor != null) {
            if (cursor.moveToFirst()) {
                do {
                    SavedJobs favorite = new SavedJobs(
                            cursor.getString(cursor.getColumnIndex("borough")),
                            cursor.getString(cursor.getColumnIndex("company_name")),
                            cursor.getString(cursor.getColumnIndex("event_name")),
                            cursor.getString(cursor.getColumnIndex("location")),
                            cursor.getString(cursor.getColumnIndex("address")),
                            cursor.getString(cursor.getColumnIndex("position")),
                            cursor.getString(cursor.getColumnIndex("education")),
                            cursor.getString(cursor.getColumnIndex("qualifications")));
                    savedJobs.add(favorite);
                } while (cursor.moveToNext());
            }
        }
        return savedJobs;
    }


}
