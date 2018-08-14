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
	private int school_id;

	@Column(name="School_City")
	private String school_City;

	@Column(name="School_Country")
	private String school_Country;

	@Column(name="School_End_Time")
	private Timestamp school_End_Time;

	@Column(name="School_Name")
	private String school_Name;

	@Column(name="School_Open_Frequency_Per_week")
	private int school_Open_Frequency_Per_week;

	@Column(name="School_Start_Time")
	private Timestamp school_Start_Time;

	@Column(name="State_id")
	private int state_id;

	@Column(name="School_Status")
	private String school_Status;

    public SchoolEntity() {
    }

	public int getSchool_id() {
		return this.school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public String getSchool_City() {
		return this.school_City;
	}

	public void setSchool_City(String school_City) {
		this.school_City = school_City;
	}

	public String getSchool_Country() {
		return this.school_Country;
	}

	public void setSchool_Country(String school_Country) {
		this.school_Country = school_Country;
	}

	public Timestamp getSchool_End_Time() {
		return this.school_End_Time;
	}

	public void setSchool_End_Time(Timestamp school_End_Time) {
		this.school_End_Time = school_End_Time;
	}

	public String getSchool_Name() {
		return this.school_Name;
	}

	public void setSchool_Name(String school_Name) {
		this.school_Name = school_Name;
	}

	public int getSchool_Open_Frequency_Per_week() {
		return this.school_Open_Frequency_Per_week;
	}

	public void setSchool_Open_Frequency_Per_week(int school_Open_Frequency_Per_week) {
		this.school_Open_Frequency_Per_week = school_Open_Frequency_Per_week;
	}

	public Timestamp getSchool_Start_Time() {
		return this.school_Start_Time;
	}

	public void setSchool_Start_Time(Timestamp school_Start_Time) {
		this.school_Start_Time = school_Start_Time;
	}

	public int getState_id() {
		return state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	public String getSchool_Status() {
		return this.school_Status;
	}

	public void setSchool_Status(String school_Status) {
		this.school_Status = school_Status;
	}

}