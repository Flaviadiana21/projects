package com.example.travelassistant.reguli;

public class Trip {

    private String country;
    private String startDate;
    private String endDate;

    public Trip(String country, String startDate, String endDate) {
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
