package com.ons.school.web.application.vo;

import java.util.Date;

public class TeacherVo {

    private String teacherId;
    private String teacherName;
    private Date DOB;
    private String UID;
    private String TeacherAddressLine1;
    private String TeacherAddressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String schoolId;
    private String educationalBackground;
    private String professionalBackground;
    private String teacherContactNumber;
    private String emergencyContactNumber;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date dOB) {
        DOB = dOB;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String uID) {
        UID = uID;
    }

    public String getTeacherAddressLine1() {
        return TeacherAddressLine1;
    }

    public void setTeacherAddressLine1(String teacherAddressLine1) {
        TeacherAddressLine1 = teacherAddressLine1;
    }

    public String getTeacherAddressLine2() {
        return TeacherAddressLine2;
    }

    public void setTeacherAddressLine2(String teacherAddressLine2) {
        TeacherAddressLine2 = teacherAddressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getEducationalBackground() {
        return educationalBackground;
    }

    public void setEducationalBackground(String educationalBackground) {
        this.educationalBackground = educationalBackground;
    }

    public String getProfessionalBackground() {
        return professionalBackground;
    }

    public void setProfessionalBackground(String professionalBackground) {
        this.professionalBackground = professionalBackground;
    }

    public String getTeacherContactNumber() {
        return teacherContactNumber;
    }

    public void setTeacherContactNumber(String teacherContactNumber) {
        this.teacherContactNumber = teacherContactNumber;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }


}
