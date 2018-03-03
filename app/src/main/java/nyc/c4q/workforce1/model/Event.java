package nyc.c4q.workforce1.model;

import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Shant on 3/3/2018.
 */

public class Event {

    private String borough;
    @SerializedName("check_in_from)")
    private String checkInFrom;
    @SerializedName("check_in_from")
    private String  checkInTo;
    @SerializedName("company_name_or_type")
    private String companyNameOrType;
    @SerializedName("event_date")
    private String eventDate;
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
        return fromHourStringToDate(checkInFrom);
    }

    public Date getCheckInTo() {
        return fromHourStringToDate(checkInTo);
    }

    public String getCompanyNameOrType() {
        return companyNameOrType;
    }

    public Date getEventDate() {
        return fromDateStringToDate(eventDate);
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

    public void setCheckInFrom(String checkInFrom) {
        this.checkInFrom = checkInFrom;
    }

    public void setCheckInTo(String checkInTo) {
        this.checkInTo = checkInTo;
    }

    public void setCompanyNameOrType(String companyNameOrType) {
        this.companyNameOrType = companyNameOrType;
    }

    public void setEventDate(String eventDate) {
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

    private Date fromHourStringToDate(String s) {
        SimpleDateFormat format = new SimpleDateFormat("h:m a");
        Date date = null;
        try {
            date = format.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    private Date fromDateStringToDate(String s){
        //"Tuesday, February 27, 2018"
        SimpleDateFormat format = new SimpleDateFormat("E, M d, y");
        Date date = null;
        try {
            date = format.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    private String dateToString(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("E, M d, y");
        String sdt = formatter.format(date);
        return sdt;
    }

    private String hourToString(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("h:m a");        String sdt = formatter.format(date);
        return sdt;

    }
}
