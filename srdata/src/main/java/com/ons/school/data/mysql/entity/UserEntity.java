package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user database table.
 * 
 */

@NamedQueries({

@NamedQuery(name = "FETCH_USER_DETAILS", query = "SELECT o FROM UserEntity o WHERE o.schoolId = :schoolId and o.userId = :userId " )
		
}) 

@Table(name = "User")
@Entity
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_Seq_Id")
	private int userSeqId;

	@Column(name = "Role_Code")
	private String roleCode;

	@Column(name = "School_id")
	private int schoolId;

	@Column(name = "User_First_name")
	private String firstName;

	@Column(name = "User_Id")
	private String userId;

	@Column(name = "User_Last_Name")
	private String lastName;

	@Column(name = "User_Middle_name")
	private String middleName;

	@Column(name = "User_Password")
	private String userPassword;

	@Column(name = "User_Status")
	private String userStatus;

	public UserEntity() {
	}

	public int getUserSeqId() {
		return userSeqId;
	}

	public void setUserSeqId(int userSeqId) {
		this.userSeqId = userSeqId;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
}