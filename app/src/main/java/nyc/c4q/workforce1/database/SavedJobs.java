package nyc.c4q.workforce1.database;

/**
 * Created by D on 3/4/18.
 */

public class SavedJobs {


    private String borough;
    private String company;
    private String address;
    private String position;
    private String education;
    private String qualifications;


    public SavedJobs(String string, String company_name, String borough, String company, String address, String position, String education, String qualifications) {
        this.borough = borough;
        this.company = company;
        this.address = address;
        this.position = position;
        this.education = education;
        this.qualifications = qualifications;
    }

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }


}
