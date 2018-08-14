package com.ons.school.common.vo;

import java.sql.Timestamp;

public class School {

    private String schoolName;
    private String schoolId;
    private String city;
    private String stateId;
    private String country;
    private String status;
    private int schoolOpenFrequencyPerWeek;
    private Timestamp schoolStartTime;
    private Timestamp schoolEndTime;


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSchoolOpenFrequencyPerWeek() {
        return schoolOpenFrequencyPerWeek;
    }

    public void setSchoolOpenFrequencyPerWeek(int schoolOpenFrequencyPerWeek) {
        this.schoolOpenFrequencyPerWeek = schoolOpenFrequencyPerWeek;
    }

    public Timestamp getSchoolStartTime() {
        return schoolStartTime;
    }

    public void setSchoolStartTime(Timestamp schoolStartTime) {
        this.schoolStartTime = schoolStartTime;
    }

    public Timestamp getSchoolEndTime() {
        return schoolEndTime;
    }

    public void setSchoolEndTime(Timestamp schoolEndTime) {
        this.schoolEndTime = schoolEndTime;
    }
}
