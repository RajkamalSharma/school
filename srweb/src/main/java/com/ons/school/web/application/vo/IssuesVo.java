package com.ons.school.web.application.vo;


import java.util.Date;
import java.util.List;

public class IssuesVo {

    private String issueId;

    private String schoolId;

    private String issueText;

    private Date activeStartDate;

    private boolean activeInactiveStatus;


    private List<IdeasVo> allIdeas;

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getIssueText() {
        return issueText;
    }

    public void setIssueText(String issueText) {
        this.issueText = issueText;
    }

    public Date getActiveStartDate() {
        return activeStartDate;
    }

    public void setActiveStartDate(Date activeStartDate) {
        this.activeStartDate = activeStartDate;
    }

    public boolean isActiveInactiveStatus() {
        return activeInactiveStatus;
    }

    public void setActiveInactiveStatus(boolean activeInactiveStatus) {
        this.activeInactiveStatus = activeInactiveStatus;
    }

    public List<IdeasVo> getAllIdeas() {
        return allIdeas;
    }

    public void setAllIdeas(List<IdeasVo> allIdeas) {
        this.allIdeas = allIdeas;
    }


}
