package com.ons.school.web.application.vo;

import javax.validation.constraints.*;


public class SubjectVo {

    private String subjectId;

    @NotBlank
    @Size(min = 3 , max = 3 , message = "Subject code has to be 3 characters long")
    private String subjectCode;

    @NotNull
    private String classId;

    @NotBlank
    private String subjectName;

    @NotNull
    //@Max(value = 1 , message = "Value can be either 0 or 1")
   // @Min(value = 0 , message = "Value can be either 0 or 1")
    private boolean isPracticalSubject;

    @NotNull
    @Max(value = 5 , message = "Period cannot be more than 5 times a week")
    @Min(value = 1 , message = "Period cannot be less than once a week")
    private int periodFrequecnyPerWeek;

    @NotNull
    @Max(value = 60 , message =  "Period duration cannot be more than 60 minutes")
    @Min(value = 30 , message =  "Period duration cannot be less than 30 minutes")
    private int periodDuration;

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public boolean isPracticalSubject() {
        return isPracticalSubject;
    }

    public void setPracticalSubject(boolean isPracticalSubject) {
        this.isPracticalSubject = isPracticalSubject;
    }

    public int getPeriodFrequecnyPerWeek() {
        return periodFrequecnyPerWeek;
    }

    public void setPeriodFrequecnyPerWeek(int periodFrequecnyPerWeek) {
        this.periodFrequecnyPerWeek = periodFrequecnyPerWeek;
    }

    public int getPeriodDuration() {
        return periodDuration;
    }

    public void setPeriodDuration(int periodDuration) {
        this.periodDuration = periodDuration;
    }


}
