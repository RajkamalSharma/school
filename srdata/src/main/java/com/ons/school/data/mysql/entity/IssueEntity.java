package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the issues database table.
 * 
 */


@NamedQueries({

@NamedQuery(name = "FETCH_ALL_ISSUES", query = "SELECT I FROM IssueEntity I WHERE I.schoolId = :schoolId"),
@NamedQuery(name = "FETCH_TODAYS_ISSUES", query = "SELECT I FROM IssueEntity I WHERE I.schoolId = :schoolId AND " +
		" I.activeStartDate >= :todaysDate AND I.activeStartDate < :tomorrowsDate ")

}) 




@Entity
@Table(name="issues")
public class IssueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Issue_id")
	private int issueId;

	@Column(name = "Active_Inactive_Status")
	private boolean activeInactiveStatus;

	@Column(name = "Active_Start_Date")
    @Temporal( TemporalType.DATE)
	private Date activeStartDate;

	@Column(name = "Created_Timestamp")
	private Timestamp createdTimestamp;

	@Column(name = "Issue_Text")
	private String issueText;

	@Column(name = "School_id")
	private int schoolId;
	
	@OneToMany(mappedBy = "issueEntity",fetch=FetchType.EAGER,cascade = { CascadeType.ALL,CascadeType.PERSIST,CascadeType.MERGE })
	private Set<IdeaEntity> ideaEntities;
	
    public IssueEntity() {
    }

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public boolean isActiveInactiveStatus() {
		return activeInactiveStatus;
	}

	public void setActiveInactiveStatus(boolean activeInactiveStatus) {
		this.activeInactiveStatus = activeInactiveStatus;
	}

	public Date getActiveStartDate() {
		return activeStartDate;
	}

	public void setActiveStartDate(Date activeStartDate) {
		this.activeStartDate = activeStartDate;
	}

	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public String getIssueText() {
		return issueText;
	}

	public void setIssueText(String issueText) {
		this.issueText = issueText;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public Set<IdeaEntity> getIdeaEntities() {
		return ideaEntities;
	}

	public void setIdeaEntities(Set<IdeaEntity> ideaEntities) {
		this.ideaEntities = ideaEntities;
	}
}