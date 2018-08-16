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
	private int teacherId;

	@Column(name="Emergency_Contact_number")
	private String emergencyContactNumber;

	@Column(name="School_id")
	private int schoolId;

	@Column(name="Teacher_Address_Line_1")
	private String teacherAddressLine1;

	@Column(name="Teacher_Address_Line_2")
	private String teacherAddressLine_2;

	@Column(name="Teacher_City")
	private String teacherCity;

	@Column(name="Teacher_Contact_Number")
	private String teacherContactNumber;

    @Temporal( TemporalType.DATE)
    @Column(name="Teacher_Date_Of_Birth")
	private Date teacherDateOfBirth;

    @Column(name="Teacher_Educational_Background")
	private String teacherEducationalBackground;

    @Column(name="Teacher_Name")
	private String teacherName;

    @Column(name="Teacher_Postal_COde")
	private String teacherPostalCOde;

    @Column(name="Teacher_Professional_Background")
	private String teacherProfessionalBackground;

    @Column(name="Teacher_State")
	private String teacherState;

    @Column(name="Teacher_UID")
	private String teacherUID;

    public TeacherEntity() {
    }

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getTeacherAddressLine1() {
		return teacherAddressLine1;
	}

	public void setTeacherAddressLine1(String teacherAddressLine1) {
		this.teacherAddressLine1 = teacherAddressLine1;
	}

	public String getTeacherAddressLine_2() {
		return teacherAddressLine_2;
	}

	public void setTeacherAddressLine_2(String teacherAddressLine_2) {
		this.teacherAddressLine_2 = teacherAddressLine_2;
	}

	public String getTeacherCity() {
		return teacherCity;
	}

	public void setTeacherCity(String teacherCity) {
		this.teacherCity = teacherCity;
	}

	public String getTeacherContactNumber() {
		return teacherContactNumber;
	}

	public void setTeacherContactNumber(String teacherContactNumber) {
		this.teacherContactNumber = teacherContactNumber;
	}

	public Date getTeacherDateOfBirth() {
		return teacherDateOfBirth;
	}

	public void setTeacherDateOfBirth(Date teacherDateOfBirth) {
		this.teacherDateOfBirth = teacherDateOfBirth;
	}

	public String getTeacherEducationalBackground() {
		return teacherEducationalBackground;
	}

	public void setTeacherEducationalBackground(String teacherEducationalBackground) {
		this.teacherEducationalBackground = teacherEducationalBackground;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherPostalCOde() {
		return teacherPostalCOde;
	}

	public void setTeacherPostalCOde(String teacherPostalCOde) {
		this.teacherPostalCOde = teacherPostalCOde;
	}

	public String getTeacherProfessionalBackground() {
		return teacherProfessionalBackground;
	}

	public void setTeacherProfessionalBackground(String teacherProfessionalBackground) {
		this.teacherProfessionalBackground = teacherProfessionalBackground;
	}

	public String getTeacherState() {
		return teacherState;
	}

	public void setTeacherState(String teacherState) {
		this.teacherState = teacherState;
	}

	public String getTeacherUID() {
		return teacherUID;
	}

	public void setTeacherUID(String teacherUID) {
		this.teacherUID = teacherUID;
	}
}