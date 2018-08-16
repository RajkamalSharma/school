package com.ons.school.web.application.vo;


import java.util.Date;

public class FeesTemplateVo {

    private String feesComponentName;
    private int feesComponentValue;
    private String classId;
    private boolean isMonthlyTemplate;
    private String feesTemplateId;
    private Date monthYear;


    public String getFeesComponentName() {
        return feesComponentName;
    }

    public void setFeesComponentName(String feesComponentName) {
        this.feesComponentName = feesComponentName;
    }

    public int getFeesComponentValue() {
        return feesComponentValue;
    }

    public void setFeesComponentValue(int feesComponentValue) {
        this.feesComponentValue = feesComponentValue;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public boolean isMonthlyTemplate() {
        return isMonthlyTemplate;
    }

    public void setMonthlyTemplate(boolean isMonthlyTemplate) {
        this.isMonthlyTemplate = isMonthlyTemplate;
    }

    public String getFeesTemplateId() {
        return feesTemplateId;
    }

    public void setFeesTemplateId(String feesTemplateId) {
        this.feesTemplateId = feesTemplateId;
    }

    public Date getMonthYear() {
        return monthYear;
    }

    public void setMonthYear(Date monthYear) {
        this.monthYear = monthYear;
    }


}