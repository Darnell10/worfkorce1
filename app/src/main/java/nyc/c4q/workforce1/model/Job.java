package nyc.c4q.workforce1.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Shant on 3/3/2018.
 */

public class Job {

    @SerializedName("boroughbronx")
    private String boroughBronx;
    @SerializedName("boroughbrooklyn")
    private String boroughBrooklyn;
    @SerializedName("boroughmanhattan")
    private String boroughManhattan;
    @SerializedName("boroughnonnyc")
    private String boroughNonNyc;
    @SerializedName("boroughqueens")
    private String boroughQueens;
    @SerializedName("boroughstatenisland")
    private String boroughStatenIsland;
    @SerializedName("candidateexperiencequalificationskills")
    private String candidateExperienceQualificationSkills;
    @SerializedName("educationrequired")
    private String educationRequired;
    @SerializedName("hourlyannual")
    private String hourlyAnnual;
    @SerializedName("maxhoursperweek")
    private int maxHoursPerWeek;
    @SerializedName("minhoursperweek")
    private int minHoursPerWeek;
    @SerializedName("positiondescritption")
    private String positionDescritption;
    @SerializedName("positiontitle")
    private String positionTitle;
    @SerializedName("positiontype")
    private String positionType;
    @SerializedName("sectorname")
    private String sectorName;
    @SerializedName("wagemax")
    private Double wageMax;
    @SerializedName("wagemin")
    private Double wageMin;
    private String borough;

    public boolean getBoroughBronx() {
        return yesNoToBoolean(boroughBronx);
    }

    public boolean getBoroughBrooklyn() {
        return yesNoToBoolean(boroughBrooklyn);
    }

    public boolean getBoroughManhattan() {
        return yesNoToBoolean(boroughManhattan);
    }

    public boolean getBoroughNonNyc() {
        return yesNoToBoolean(boroughNonNyc);
    }

    public boolean getBoroughQueens() {
        return yesNoToBoolean(boroughQueens);
    }

    public boolean getBoroughStatenIsland() {
        return yesNoToBoolean(boroughStatenIsland);
    }

    public String getCandidateExperienceQualificationSkills() {
        return candidateExperienceQualificationSkills;
    }

    public String getEducationRequired() {
        return educationRequired;
    }

    public String getHourlyAnnual() {
        return hourlyAnnual;
    }

    public int getMaxHoursPerWeek() {
        return maxHoursPerWeek;
    }

    public int getMinHoursPerWeek() {
        return minHoursPerWeek;
    }

    public String getPositionDescritption() {
        return positionDescritption;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public String getPositionType() {
        return positionType;
    }

    public String getSectorName() {
        return sectorName;
    }

    public Double getWageMax() {
        return wageMax;
    }

    public Double getWageMin() {
        return wageMin;
    }

    public void setBoroughBronx(boolean boroughBronx) {
        if(boroughBronx){
            borough = Boroughs.BRONX.getBoroughName();
        }
        this.boroughBronx = booleanToYesNo(boroughBronx);
    }

    public void setBoroughBrooklyn(boolean boroughBrooklyn) {
        if(boroughBrooklyn){
            borough = Boroughs.BROOKLYN.getBoroughName();
        }
        this.boroughBrooklyn = booleanToYesNo(boroughBrooklyn);
    }

    public void setBoroughManhattan(boolean boroughManhattan) {
        if(boroughManhattan){
            borough = Boroughs.MANHATTAN.getBoroughName();
        }
        this.boroughManhattan = booleanToYesNo(boroughManhattan);
    }

    public void setBoroughNonNyc(boolean boroughNonNyc) {
        if(boroughNonNyc){
            borough = Boroughs.NON_NYC.getBoroughName();
        }
        this.boroughNonNyc = booleanToYesNo(boroughNonNyc);
    }

    public void setBoroughQueens(boolean boroughQueens) {
        if(boroughQueens){
            borough = Boroughs.QUEENS.getBoroughName();
        }
        this.boroughQueens = booleanToYesNo(boroughQueens);
    }

    public void setBoroughStatenIsland(boolean boroughStatenIsland) {
        if(boroughStatenIsland){
            borough = Boroughs.STATEN_ISLAND.getBoroughName();
        }
        this.boroughStatenIsland = booleanToYesNo(boroughStatenIsland);
    }

    public void setCandidateExperienceQualificationSkills(String candidateExperienceQualificationSkills) {
        this.candidateExperienceQualificationSkills = candidateExperienceQualificationSkills;
    }

    public void setEducationRequired(String educationRequired) {
        this.educationRequired = educationRequired;
    }

    public void setHourlyAnnual(String hourlyAnnual) {
        this.hourlyAnnual = hourlyAnnual;
    }

    public void setMaxHoursPerWeek(int maxHoursPerWeek) {
        this.maxHoursPerWeek = maxHoursPerWeek;
    }

    public void setMinHoursPerWeek(int minHoursPerWeek) {
        this.minHoursPerWeek = minHoursPerWeek;
    }

    public void setPositionDescritption(String positionDescritption) {
        this.positionDescritption = positionDescritption;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public void setWageMax(Double wageMax) {
        this.wageMax = wageMax;
    }

    public void setWageMin(Double wageMin) {
        this.wageMin = wageMin;
    }

    private boolean yesNoToBoolean(String s) {
        switch (s) {
            case "Yes":
                return true;
            case "No":
            default:
                return false;
        }
    }

    private String booleanToYesNo(boolean b) {
        if (b) {
            return "Yes";
        }
        return "No";
    }

    private enum Boroughs {

        BRONX("Bronx"),
        MANHATTAN("Manhattan"),
        BROOKLYN("Brooklyn"),
        QUEENS("Queens"),
        STATEN_ISLAND("Staten Island"),
        NON_NYC("Non NYC");

        private String boroughName;

        private Boroughs(String s) {
            boroughName = s;
        }

        public String getBoroughName() {
            return boroughName;
        }

    }


}
