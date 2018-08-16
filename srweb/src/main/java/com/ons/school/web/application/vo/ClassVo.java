package com.ons.school.web.application.vo;

public class ClassVo {

    private String classId;
    private String className;
    private String fullClassName;
    private String classCode;
    private int classFees;


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFullClassName() {
        return fullClassName;
    }

    public void setFullClassName(String fullClassName) {
        this.fullClassName = fullClassName;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public int getClassFess() {
        return classFees;
    }

    public void setClassFees(int classFees) {
        this.classFees = classFees;
    }

    public String getClassFeesString() {
        return String.valueOf(getClassFess());

    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getClassFees() {
        return classFees;
    }


}
