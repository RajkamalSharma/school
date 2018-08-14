package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@Table(name="StudentEntity")
public class StudentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Student_id")
	private int student_id;

	@Column(name="C_Address_Line_1")
	private String c_Address_Line_1;

	@Column(name="C_Address_Line_2")
	private String c_Address_Line_2;

	@Column(name="C_City")
	private String c_City;

	@Column(name="C_Postal_COde")
	private String c_Postal_COde;

	@Column(name="C_State")
	private String c_State;

	@Column(name="Class_Id")
	private Long class_Id;

	@Column(name="Date_Of_Birth")
    @Temporal( TemporalType.DATE)
	private Date date_Of_Birth;

	@Column(name="Date_of_Enrollment")
    @Temporal( TemporalType.DATE)
	private Date date_of_Enrollment;

	@Column(name="Emergency_Contact_number")
	private String emergency_Contact_number;

	@Column(name="Father_Name")
	private String father_Name;

	@Column(name="Father_Occupation")
	private String father_Occupation;

	@Column(name="Last_attended_School")
	private String last_attended_School;

	@Column(name="Mother_Name")
	private String mother_Name;

	@Column(name="Mother_Occupation")
	private String mother_Occupation;

	@Column(name="Other_Details")
	private String other_Details;

	@Column(name="P_Address_Line_1")
	private String p_Address_Line_1;

	@Column(name="P_Address_Line_2")
	private String p_Address_Line_2;

	@Column(name="P_City")
	private String p_City;

	@Column(name="P_Postal_COde")
	private String p_Postal_COde;

	@Column(name="P_State")
	private String p_State;

	@Column(name="Roll_Number")
	private int roll_Number;

	@Column(name="School_id")
	private int school_id;

	@Column(name="Student_First_name")
	private String student_First_name;

	@Column(name="Student_Last_name")
	private String student_Last_name;

	@Column(name="Student_Middle_name")
	private String student_Middle_name;

	@Column(name="UID")
	private String uid;

    public StudentEntity() {
    }

	public int getStudent_id() {
		return this.student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getC_Address_Line_1() {
		return this.c_Address_Line_1;
	}

	public void setC_Address_Line_1(String c_Address_Line_1) {
		this.c_Address_Line_1 = c_Address_Line_1;
	}

	public String getC_Address_Line_2() {
		return this.c_Address_Line_2;
	}

	public void setC_Address_Line_2(String c_Address_Line_2) {
		this.c_Address_Line_2 = c_Address_Line_2;
	}

	public String getC_City() {
		return this.c_City;
	}

	public void setC_City(String c_City) {
		this.c_City = c_City;
	}

	public String getC_Postal_COde() {
		return this.c_Postal_COde;
	}

	public void setC_Postal_COde(String c_Postal_COde) {
		this.c_Postal_COde = c_Postal_COde;
	}

	public String getC_State() {
		return this.c_State;
	}

	public void setC_State(String c_State) {
		this.c_State = c_State;
	}

	public Long getClass_Id() {
		return this.class_Id;
	}

	public void setClass_Id(Long class_Id) {
		this.class_Id = class_Id;
	}

	public Date getDate_Of_Birth() {
		return this.date_Of_Birth;
	}

	public void setDate_Of_Birth(Date date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}

	public Date getDate_of_Enrollment() {
		return this.date_of_Enrollment;
	}

	public void setDate_of_Enrollment(Date date_of_Enrollment) {
		this.date_of_Enrollment = date_of_Enrollment;
	}

	public String getEmergency_Contact_number() {
		return this.emergency_Contact_number;
	}

	public void setEmergency_Contact_number(String emergency_Contact_number) {
		this.emergency_Contact_number = emergency_Contact_number;
	}

	public String getFather_Name() {
		return this.father_Name;
	}

	public void setFather_Name(String father_Name) {
		this.father_Name = father_Name;
	}

	public String getFather_Occupation() {
		return this.father_Occupation;
	}

	public void setFather_Occupation(String father_Occupation) {
		this.father_Occupation = father_Occupation;
	}

	public String getLast_attended_School() {
		return this.last_attended_School;
	}

	public void setLast_attended_School(String last_attended_School) {
		this.last_attended_School = last_attended_School;
	}

	public String getMother_Name() {
		return this.mother_Name;
	}

	public void setMother_Name(String mother_Name) {
		this.mother_Name = mother_Name;
	}

	public String getMother_Occupation() {
		return this.mother_Occupation;
	}

	public void setMother_Occupation(String mother_Occupation) {
		this.mother_Occupation = mother_Occupation;
	}

	public String getOther_Details() {
		return this.other_Details;
	}

	public void setOther_Details(String other_Details) {
		this.other_Details = other_Details;
	}

	public String getP_Address_Line_1() {
		return this.p_Address_Line_1;
	}

	public void setP_Address_Line_1(String p_Address_Line_1) {
		this.p_Address_Line_1 = p_Address_Line_1;
	}

	public String getP_Address_Line_2() {
		return this.p_Address_Line_2;
	}

	public void setP_Address_Line_2(String p_Address_Line_2) {
		this.p_Address_Line_2 = p_Address_Line_2;
	}

	public String getP_City() {
		return this.p_City;
	}

	public void setP_City(String p_City) {
		this.p_City = p_City;
	}

	public String getP_Postal_COde() {
		return this.p_Postal_COde;
	}

	public void setP_Postal_COde(String p_Postal_COde) {
		this.p_Postal_COde = p_Postal_COde;
	}

	public String getP_State() {
		return this.p_State;
	}

	public void setP_State(String p_State) {
		this.p_State = p_State;
	}

	public int getRoll_Number() {
		return this.roll_Number;
	}

	public void setRoll_Number(int roll_Number) {
		this.roll_Number = roll_Number;
	}

	public int getSchool_id() {
		return this.school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public String getStudent_First_name() {
		return this.student_First_name;
	}

	public void setStudent_First_name(String student_First_name) {
		this.student_First_name = student_First_name;
	}

	public String getStudent_Last_name() {
		return this.student_Last_name;
	}

	public void setStudent_Last_name(String student_Last_name) {
		this.student_Last_name = student_Last_name;
	}

	public String getStudent_Middle_name() {
		return this.student_Middle_name;
	}

	public void setStudent_Middle_name(String student_Middle_name) {
		this.student_Middle_name = student_Middle_name;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

}