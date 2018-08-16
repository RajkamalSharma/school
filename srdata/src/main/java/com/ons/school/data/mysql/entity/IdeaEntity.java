package com.ons.school.data.mysql.entity;
import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the ideas database table.
 * 
 */

@Entity
@Table(name="ideas")
public class IdeaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Ideas_id")
	private int ideasId;

	@OneToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "Contributor_id")
	private ContributorEntity contributor;

	@Column(name = "Count_Of_Likes")
	private int countOfLikes;

	@Column(name = "Date_Of_Reply")
	private Timestamp dateOfReply;


	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name="Issue_id")
    private IssueEntity issueEntity;
	

	@Column(name = "Solution_Text")
	private String solutionText;

	@Column(name = "Student_Ids_Who_Liked")
	private String studentIdsWhoLiked;

    public IdeaEntity() {
    }

	public int getIdeasId() {
		return ideasId;
	}

	public void setIdeasId(int ideasId) {
		this.ideasId = ideasId;
	}

	public ContributorEntity getContributor() {
		return contributor;
	}

	public void setContributor(ContributorEntity contributor) {
		this.contributor = contributor;
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

	public IssueEntity getIssueEntity() {
		return issueEntity;
	}

	public void setIssueEntity(IssueEntity issueEntity) {
		this.issueEntity = issueEntity;
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
}