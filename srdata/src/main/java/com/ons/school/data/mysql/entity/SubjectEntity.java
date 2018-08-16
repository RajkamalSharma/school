package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the subject database table.
 * 
 */
@Entity

@NamedQueries({

@NamedQuery(name = "FETCH_ALL_SUBJECTS_FOR_CLASS", query = "SELECT S FROM SubjectEntity S WHERE S.classId = :classId ")

}) 


@Table(name="Subject")
public class SubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Subject_id")
	private int subjectId;

	@Column(name="Class_id")
	private int classId;

	@Column(name="Is_Practical_Subject")
	private boolean isPracticalSubject;

	@Column(name="Subject_Code")
	private String subjectCode;

	@Column(name="Subject_Name")
	private String subjectName;

	@Column(name="Period_Frequency_Per_Week")
	private int periodFrequencyPerWeek ;
	
	@Column(name="Period_Duration")
	private int periodDuration ;
	
	
    public SubjectEntity() {
    }

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public boolean isPracticalSubject() {
		return isPracticalSubject;
	}

	public void setPracticalSubject(boolean practicalSubject) {
		isPracticalSubject = practicalSubject;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getPeriodFrequencyPerWeek() {
		return periodFrequencyPerWeek;
	}

	public void setPeriodFrequencyPerWeek(int periodFrequencyPerWeek) {
		this.periodFrequencyPerWeek = periodFrequencyPerWeek;
	}

	public int getPeriodDuration() {
		return periodDuration;
	}

	public void setPeriodDuration(int periodDuration) {
		this.periodDuration = periodDuration;
	}
}