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

@NamedQuery(name = "FETCH_ALL_ISSUES", query = "SELECT I FROM IssueEntity I WHERE I.school_id = :schoolId"),
@NamedQuery(name = "FETCH_TODAYS_ISSUES", query = "SELECT I FROM IssueEntity I WHERE I.school_id = :schoolId AND " +
		" I.active_Start_Date >= :todaysDate AND I.active_Start_Date < :tomorrowsDate ")

}) 




@Entity
@Table(name="issues")
public class IssueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Issue_id")
	private int issue_id;

	@Column(name = "Active_Inactive_Status")
	private boolean active_Inactive_Status;

	@Column(name = "Active_Start_Date")
    @Temporal( TemporalType.DATE)
	private Date active_Start_Date;

	@Column(name = "Created_Timestamp")
	private Timestamp created_Timestamp;

	@Column(name = "Issue_Text")
	private String issue_Text;

	@Column(name = "School_id")
	private int school_id;
	
	@OneToMany(mappedBy = "issueEntity",fetch=FetchType.EAGER,cascade = { CascadeType.ALL,CascadeType.PERSIST,CascadeType.MERGE })
	private Set<IdeaEntity> ideaEntities;
	
    public IssueEntity() {
    }

	public int getIssue_id() {
		return this.issue_id;
	}

	public void setIssue_id(int issue_id) {
		this.issue_id = issue_id;
	}

	public boolean getActive_Inactive_Status() {
		return this.active_Inactive_Status;
	}

	public void setActive_Inactive_Status(boolean active_Inactive_Status) {
		this.active_Inactive_Status = active_Inactive_Status;
	}

	public Date getActive_Start_Date() {
		return this.active_Start_Date;
	}

	public void setActive_Start_Date(Date active_Start_Date) {
		this.active_Start_Date = active_Start_Date;
	}

	public Timestamp getCreated_Timestamp() {
		return this.created_Timestamp;
	}

	public void setCreated_Timestamp(Timestamp created_Timestamp) {
		this.created_Timestamp = created_Timestamp;
	}

	public String getIssue_Text() {
		return this.issue_Text;
	}

	public void setIssue_Text(String issue_Text) {
		this.issue_Text = issue_Text;
	}

	public int getSchool_id() {
		return this.school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public Set<IdeaEntity> getIdeaEntities() {
		return ideaEntities;
	}

	public void setIdeaEntities(Set<IdeaEntity> ideaEntities) {
		this.ideaEntities = ideaEntities;
	}

	
	
}