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

    public void setBorough(String borough) {
        this.borough = borough;
    }

    public void setCheckInFrom(Date checkInFrom) {
        this.checkInFrom = checkInFrom;
    }

    public void setCheckInTo(Date checkInTo) {
        this.checkInTo = checkInTo;
    }

    public void setCompanyNameOrType(String companyNameOrType) {
        this.companyNameOrType = companyNameOrType;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLocationNameAndAddress(String locationNameAndAddress) {
        this.locationNameAndAddress = locationNameAndAddress;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
}
