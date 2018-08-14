package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the teacher database table.
 * 
 */
@Entity
public class TeacherEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Teacher_id")
	private int teacher_id;

	@Column(name="Emergency_Contact_number")
	private String emergency_Contact_number;

	@Column(name="School_id")
	private int school_id;

	@Column(name="Teacher_Address_Line_1")
	private String teacher_Address_Line_1;

	@Column(name="Teacher_Address_Line_2")
	private String teacher_Address_Line_2;

	@Column(name="Teacher_City")
	private String teacher_City;

	@Column(name="Teacher_Contact_Number")
	private String teacher_Contact_Number;

    @Temporal( TemporalType.DATE)
    @Column(name="Teacher_Date_Of_Birth")
	private Date teacher_Date_Of_Birth;

    @Column(name="Teacher_Educational_Background")
	private String teacher_Educational_Background;

    @Column(name="Teacher_Name")
	private String teacher_Name;

    @Column(name="Teacher_Postal_COde")
	private String teacher_Postal_COde;

    @Column(name="Teacher_Professional_Background")
	private String teacher_Professional_Background;

    @Column(name="Teacher_State")
	private String teacher_State;

    @Column(name="Teacher_UID")
	private String teacher_UID;

    public TeacherEntity() {
    }

	public int getTeacher_id() {
		return this.teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getEmergency_Contact_number() {
		return this.emergency_Contact_number;
	}

	public void setEmergency_Contact_number(String emergency_Contact_number) {
		this.emergency_Contact_number = emergency_Contact_number;
	}

	public int getSchool_id() {
		return this.school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public String getTeacher_Address_Line_1() {
		return this.teacher_Address_Line_1;
	}

	public void setTeacher_Address_Line_1(String teacher_Address_Line_1) {
		this.teacher_Address_Line_1 = teacher_Address_Line_1;
	}

	public String getTeacher_Address_Line_2() {
		return this.teacher_Address_Line_2;
	}

	public void setTeacher_Address_Line_2(String teacher_Address_Line_2) {
		this.teacher_Address_Line_2 = teacher_Address_Line_2;
	}

	public String getTeacher_City() {
		return this.teacher_City;
	}

	public void setTeacher_City(String teacher_City) {
		this.teacher_City = teacher_City;
	}

	public String getTeacher_Contact_Number() {
		return this.teacher_Contact_Number;
	}

	public void setTeacher_Contact_Number(String teacher_Contact_Number) {
		this.teacher_Contact_Number = teacher_Contact_Number;
	}

	public Date getTeacher_Date_Of_Birth() {
		return this.teacher_Date_Of_Birth;
	}

	public void setTeacher_Date_Of_Birth(Date teacher_Date_Of_Birth) {
		this.teacher_Date_Of_Birth = teacher_Date_Of_Birth;
	}

	public String getTeacher_Educational_Background() {
		return this.teacher_Educational_Background;
	}

	public void setTeacher_Educational_Background(String teacher_Educational_Background) {
		this.teacher_Educational_Background = teacher_Educational_Background;
	}

	public String getTeacher_Name() {
		return this.teacher_Name;
	}

	public void setTeacher_Name(String teacher_Name) {
		this.teacher_Name = teacher_Name;
	}

	public String getTeacher_Postal_COde() {
		return this.teacher_Postal_COde;
	}

	public void setTeacher_Postal_COde(String teacher_Postal_COde) {
		this.teacher_Postal_COde = teacher_Postal_COde;
	}

	public String getTeacher_Professional_Background() {
		return this.teacher_Professional_Background;
	}

	public void setTeacher_Professional_Background(String teacher_Professional_Background) {
		this.teacher_Professional_Background = teacher_Professional_Background;
	}

	public String getTeacher_State() {
		return this.teacher_State;
	}

	public void setTeacher_State(String teacher_State) {
		this.teacher_State = teacher_State;
	}

	public String getTeacher_UID() {
		return this.teacher_UID;
	}

	public void setTeacher_UID(String teacher_UID) {
		this.teacher_UID = teacher_UID;
	}

}