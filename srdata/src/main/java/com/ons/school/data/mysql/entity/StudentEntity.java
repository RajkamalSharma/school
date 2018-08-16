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
	private int studentId;

	@Column(name="C_Address_Line_1")
	private String cAddressLine1;

	@Column(name="C_Address_Line_2")
	private String cAddressLine2;

	@Column(name="C_City")
	private String cCity;

	@Column(name="C_Postal_COde")
	private String cPostalCOde;

	@Column(name="C_State")
	private String cState;

	@Column(name="Class_Id")
	private Long classId;

	@Column(name="Date_Of_Birth")
    @Temporal( TemporalType.DATE)
	private Date dateOfBirth;

	@Column(name="Date_of_Enrollment")
    @Temporal( TemporalType.DATE)
	private Date dateOfEnrollment;

	@Column(name="Emergency_Contact_number")
	private String emergencyContactNumber;

	@Column(name="Father_Name")
	private String fatherName;

	@Column(name="Father_Occupation")
	private String fatherOccupation;

	@Column(name="Last_attended_School")
	private String lastAttendedSchool;

	@Column(name="Mother_Name")
	private String motherName;

	@Column(name="Mother_Occupation")
	private String motherOccupation;

	@Column(name="Other_Details")
	private String otherDetails;

	@Column(name="P_Address_Line_1")
	private String pAddressLine1;

	@Column(name="P_Address_Line_2")
	private String pAddressLine2;

	@Column(name="P_City")
	private String pCity;

	@Column(name="P_Postal_COde")
	private String pPostalCOde;

	@Column(name="P_State")
	private String pState;

	@Column(name="Roll_Number")
	private int rollNumber;

	@Column(name="School_id")
	private int schoolId;

	@Column(name="Student_First_name")
	private String studentFirstName;

	@Column(name="Student_Last_name")
	private String studentLastName;

	@Column(name="Student_Middle_name")
	private String studentMiddleName;

	@Column(name="UID")
	private String uid;

    public StudentEntity() {
    }

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getcAddressLine1() {
		return cAddressLine1;
	}

	public void setcAddressLine1(String cAddressLine1) {
		this.cAddressLine1 = cAddressLine1;
	}

	public String getcAddressLine2() {
		return cAddressLine2;
	}

	public void setcAddressLine2(String cAddressLine2) {
		this.cAddressLine2 = cAddressLine2;
	}

	public String getcCity() {
		return cCity;
	}

	public void setcCity(String cCity) {
		this.cCity = cCity;
	}

	public String getcPostalCOde() {
		return cPostalCOde;
	}

	public void setcPostalCOde(String cPostalCOde) {
		this.cPostalCOde = cPostalCOde;
	}

	public String getcState() {
		return cState;
	}

	public void setcState(String cState) {
		this.cState = cState;
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfEnrollment() {
		return dateOfEnrollment;
	}

	public void setDateOfEnrollment(Date dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}

	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}

	public String getLastAttendedSchool() {
		return lastAttendedSchool;
	}

	public void setLastAttendedSchool(String lastAttendedSchool) {
		this.lastAttendedSchool = lastAttendedSchool;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherOccupation() {
		return motherOccupation;
	}

	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}

	public String getOtherDetails() {
		return otherDetails;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	public String getpAddressLine1() {
		return pAddressLine1;
	}

	public void setpAddressLine1(String pAddressLine1) {
		this.pAddressLine1 = pAddressLine1;
	}

	public String getpAddressLine2() {
		return pAddressLine2;
	}

	public void setpAddressLine2(String pAddressLine2) {
		this.pAddressLine2 = pAddressLine2;
	}

	public String getpCity() {
		return pCity;
	}

	public void setpCity(String pCity) {
		this.pCity = pCity;
	}

	public String getpPostalCOde() {
		return pPostalCOde;
	}

	public void setpPostalCOde(String pPostalCOde) {
		this.pPostalCOde = pPostalCOde;
	}

	public String getpState() {
		return pState;
	}

	public void setpState(String pState) {
		this.pState = pState;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentMiddleName() {
		return studentMiddleName;
	}

	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
}