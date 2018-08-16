package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the school database table.
 * 
 */
@Entity
@Table(name="SchoolEntity")
public class SchoolEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="School_id")
	private int schoolId;

	@Column(name="School_City")
	private String schoolCity;

	@Column(name="School_Country")
	private String schoolCountry;

	@Column(name="School_End_Time")
	private Timestamp schoolEndTime;

	@Column(name="School_Name")
	private String schoolName;

	@Column(name="School_Open_Frequency_Per_week")
	private int schoolOpenFrequencyPerWeek;

	@Column(name="School_Start_Time")
	private Timestamp schoolStartTime;

	@Column(name="State_id")
	private int stateId;

	@Column(name="School_Status")
	private String schoolStatus;

    public SchoolEntity() {
    }

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolCity() {
		return schoolCity;
	}

	public void setSchoolCity(String schoolCity) {
		this.schoolCity = schoolCity;
	}

	public String getSchoolCountry() {
		return schoolCountry;
	}

	public void setSchoolCountry(String schoolCountry) {
		this.schoolCountry = schoolCountry;
	}

	public Timestamp getSchoolEndTime() {
		return schoolEndTime;
	}

	public void setSchoolEndTime(Timestamp schoolEndTime) {
		this.schoolEndTime = schoolEndTime;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getSchoolOpenFrequencyPerWeek() {
		return schoolOpenFrequencyPerWeek;
	}

	public void setSchoolOpenFrequencyPerWeek(int schoolOpenFrequencyPerWeek) {
		this.schoolOpenFrequencyPerWeek = schoolOpenFrequencyPerWeek;
	}

	public Timestamp getSchoolStartTime() {
		return schoolStartTime;
	}

	public void setSchoolStartTime(Timestamp schoolStartTime) {
		this.schoolStartTime = schoolStartTime;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getSchoolStatus() {
		return schoolStatus;
	}

	public void setSchoolStatus(String schoolStatus) {
		this.schoolStatus = schoolStatus;
	}
}