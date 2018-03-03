package nyc.c4q.workforce1.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by Shant on 3/3/2018.
 */

public class Event {

    private String borough;
    @SerializedName("check_in_from)")
    private Date checkInFrom;
    @SerializedName("check_in_from")
    private Date checkInTo;
    @SerializedName("company_name_or_type")
    private String companyNameOrType;
    @SerializedName("event_date")
    private Date eventDate;
    @SerializedName("event_title")
    private String eventTitle;
    private String location;
    @SerializedName("location_name_and_address")
    private String locationNameAndAddress;
    private String qualifications;

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
