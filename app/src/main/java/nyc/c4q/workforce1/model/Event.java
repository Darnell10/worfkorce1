package nyc.c4q.workforce1.model;

import java.util.Date;

/**
 * Created by Shant on 3/3/2018.
 */

public class Event {

    String borough;
    Date checkInFrom;
    Date checkInTo;
    String companyNameOrType;
    Date eventDate;
    String eventTitle;
    String location;
    String locationNameAndAddress;
    String qualifications;

    public String getBorough() {
        return borough;
    }

    public Date getCheckInFrom() {
        return checkInFrom;
    }

    public Date getCheckInTo() {
        return checkInTo;
    }

    public String getCompanyNameOrType() {
        return companyNameOrType;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getLocation() {
        return location;
    }

    public String getLocationNameAndAddress() {
        return locationNameAndAddress;
    }

    public String getQualifications() {
        return qualifications;
    }
}
