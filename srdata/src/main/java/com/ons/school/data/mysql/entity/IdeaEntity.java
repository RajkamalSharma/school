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
	private int ideas_id;

	@OneToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "Contributor_id")
	private ContributorEntity contributor;

	@Column(name = "Count_Of_Likes")
	private int count_Of_Likes;

	@Column(name = "Date_Of_Reply")
	private Timestamp date_Of_Reply;


	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name="Issue_id")
    private IssueEntity issueEntity;
	

	@Column(name = "Solution_Text")
	private String solution_Text;

	@Column(name = "Student_Ids_Who_Liked")
	private String student_Ids_Who_Liked;

    public IdeaEntity() {
    }

	public int getIdeas_id() {
		return this.ideas_id;
	}

	public void setIdeas_id(int ideas_id) {
		this.ideas_id = ideas_id;
	}

	public ContributorEntity getContributor() {
		return contributor;
	}

	public void setContributor(ContributorEntity contributor) {
		this.contributor = contributor;
	}

	public int getCount_Of_Likes() {
		return this.count_Of_Likes;
	}

	public void setCount_Of_Likes(int count_Of_Likes) {
		this.count_Of_Likes = count_Of_Likes;
	}

	public Timestamp getDate_Of_Reply() {
		return this.date_Of_Reply;
	}

	public void setDate_Of_Reply(Timestamp date_Of_Reply) {
		this.date_Of_Reply = date_Of_Reply;
	}


	public IssueEntity getIssueEntity() {
		return issueEntity;
	}

	public void setIssueEntity(IssueEntity issueEntity) {
		this.issueEntity = issueEntity;
	}

	public String getSolution_Text() {
		return this.solution_Text;
	}

	public void setSolution_Text(String solution_Text) {
		this.solution_Text = solution_Text;
	}

	public String getStudent_Ids_Who_Liked() {
		return this.student_Ids_Who_Liked;
	}

	public void setStudent_Ids_Who_Liked(String student_Ids_Who_Liked) {
		this.student_Ids_Who_Liked = student_Ids_Who_Liked;
	}

}