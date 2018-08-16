package com.ons.school.web.application.vo;

import java.sql.Timestamp;

public class IdeasVo {

    private String ideasId;

    private String contributorsId;

    private int countOfLikes;

    private Timestamp dateOfReply;

    private String issueId;

    private String solutionText;

    private String studentIdsWhoLiked;

    private String contributorsName;

    public String getIdeasId() {
        return ideasId;
    }

    public void setIdeasId(String ideasId) {
        this.ideasId = ideasId;
    }

    public String getContributorsId() {
        return contributorsId;
    }

    public void setContributorsId(String contributorsId) {
        this.contributorsId = contributorsId;
    }

    public int getCountOfLikes() {
        return countOfLikes;
    }

    public void setCountOfLikes(int countOfLikes) {
        this.countOfLikes = countOfLikes;
    }

    public Timestamp getDateOfReply() {
        return dateOfReply;
    }

    public void setDateOfReply(Timestamp dateOfReply) {
        this.dateOfReply = dateOfReply;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getSolutionText() {
        return solutionText;
    }

    public void setSolutionText(String solutionText) {
        this.solutionText = solutionText;
    }

    public String getStudentIdsWhoLiked() {
        return studentIdsWhoLiked;
    }

    public void setStudentIdsWhoLiked(String studentIdsWhoLiked) {
        this.studentIdsWhoLiked = studentIdsWhoLiked;
    }

    public String getContributorsName() {
        return contributorsName;
    }

    public void setContributorsName(String contributorsName) {
        this.contributorsName = contributorsName;
    }


}
