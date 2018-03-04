package nyc.c4q.workforce1.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shant on 3/3/2018.
 */

public class DummyData {

    public static List<Job> jobList = populateJobList();

    public static List<Event> eventList = populateEventList();

    public static List<Job> populateJobList(){
        List<Job> jobs = new ArrayList<>();
        for(int i =0 ;i < 100;i++) {
            Job dummyJob = new Job();
            dummyJob.setBoroughBronx(true);
            dummyJob.setCandidateExperienceQualificationSkills("Must have valid drivers license");
            dummyJob.setEducationRequired("High School Diploma");
            dummyJob.setHourlyAnnual("Hourly");
            dummyJob.setMaxHoursPerWeek(40);
            dummyJob.setMinHoursPerWeek(20);
            dummyJob.setWageMin(15.00);
            dummyJob.setWageMax(24.00);
            dummyJob.setPositionDescritption("Drive to filming locations to set up film sets");
            dummyJob.setPositionTitle("Film Assistant");
            dummyJob.setPositionType("Film & Industry");
            jobs.add(dummyJob);
        }
        return jobs;
    }

    public static List<Event> populateEventList(){
        List<Event> events = new ArrayList<>();
        for(int i = 0;i <100;i++){
            Event dummyEvent = new Event();
            dummyEvent.setBorough("Bronx");
            dummyEvent.setCheckInFrom("10:00 AM");
            dummyEvent.setCheckInTo("10:15 AM");
            dummyEvent.setCompanyNameOrType("MADE IN NY");
            dummyEvent.setEventDate("Tuesday, February 27, 2018");
            dummyEvent.setEventTitle("FILM INDUSTRY RECRUITMENT");
            dummyEvent.setQualifications("Must have valid driver license");
            dummyEvent.setLocation("Bronx Center");
            dummyEvent.setLocationNameAndAddress("100 Bronx Avenue, Bronx New York, 11221");
            events.add(dummyEvent);
        }
        return events;
    }
}
