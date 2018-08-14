package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the subject database table.
 * 
 */
@Entity

@NamedQueries({

@NamedQuery(name = "FETCH_ALL_SUBJECTS_FOR_CLASS", query = "SELECT S FROM SubjectEntity S WHERE S.class_id = :classId ")

}) 


@Table(name="SubjectEntity")
public class SubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Subject_id")
	private int subject_id;

	@Column(name="Class_id")
	private int class_id;

	@Column(name="Is_Practical_Subject")
	private boolean is_Practical_Subject;

	@Column(name="Subject_Code")
	private String subject_Code;

	@Column(name="Subject_Name")
	private String subject_Name;

	@Column(name="Period_Frequency_Per_Week")
	private int period_Frequency_Per_Week ;
	
	@Column(name="Period_Duration")
	private int period_Duration ;
	
	
    public SubjectEntity() {
    }

	public int getSubject_id() {
		return this.subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public int getClass_id() {
		return this.class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}


	public boolean is_Practical_Subject() {
		return is_Practical_Subject;
	}

	public void setIs_Practical_Subject(boolean is_Practical_Subject) {
		this.is_Practical_Subject = is_Practical_Subject;
	}

	
	public String getSubject_Code() {
		return subject_Code;
	}

	public void setSubject_Code(String subject_Code) {
		this.subject_Code = subject_Code;
	}

	public String getSubject_Name() {
		return this.subject_Name;
	}

	public void setSubject_Name(String subject_Name) {
		this.subject_Name = subject_Name;
	}

	public int getPeriod_Frequency_Per_Week() {
		return period_Frequency_Per_Week;
	}

	public void setPeriod_Frequency_Per_Week(int period_Frequency_Per_Week) {
		this.period_Frequency_Per_Week = period_Frequency_Per_Week;
	}

	public int getPeriod_Duration() {
		return period_Duration;
	}

	public void setPeriod_Duration(int period_Duration) {
		this.period_Duration = period_Duration;
	}
	
	
	

}