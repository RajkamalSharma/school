package com.ons.school.web.application.vo;


import java.util.Date;
import java.util.Set;

public class FeesVo {

    private String feesId;
    private String studentId;
    private String classId;
    private String schoolId;
    private boolean feesPaid;
    private boolean previousFeesPaid;
    private String rollNumber;
    private int totalFees;
    private Date monthYear;
    private Set<FeesDetailsVo> feesDetails;


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public boolean isFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(boolean feesPaid) {
        this.feesPaid = feesPaid;
    }

    public boolean isPreviousFeesPaid() {
        return previousFeesPaid;
    }

    public void setPreviousFeesPaid(boolean previousFeesPaid) {
        this.previousFeesPaid = previousFeesPaid;
    }

    public int getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(int totalFees) {
        this.totalFees = totalFees;
    }

    public Date getMonthYear() {
        return monthYear;
    }

    public void setMonthYear(Date monthYear) {
        this.monthYear = monthYear;
    }

    public Set<FeesDetailsVo> getFeesDetails() {
        return feesDetails;
    }

    public void setFeesDetails(Set<FeesDetailsVo> feesDetails) {
        this.feesDetails = feesDetails;
    }

    public String getFeesId() {
        return feesId;
    }

    public void setFeesId(String feesId) {
        this.feesId = feesId;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }


}
