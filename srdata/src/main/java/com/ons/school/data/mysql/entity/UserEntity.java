package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user database table.
 * 
 */

@NamedQueries({

@NamedQuery(name = "FETCH_USER_DETAILS", query = "SELECT o FROM UserEntity o WHERE o.school_id = :schoolId and o.user_Id = :userId " )
		
}) 

@Table(name = "User")
@Entity
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_Seq_Id")
	private int user_Seq_Id;

	@Column(name = "Role_Code")
	private String role_Code;

	@Column(name = "School_id")
	private int school_id;

	@Column(name = "User_First_name")
	private String user_First_name;

	@Column(name = "User_Id")
	private String user_Id;

	@Column(name = "User_Last_Name")
	private String user_Last_Name;

	@Column(name = "User_Middle_name")
	private String user_Middle_name;

	@Column(name = "User_Password")
	private String user_Password;

	@Column(name = "User_Status")
	private String user_Status;

	public UserEntity() {
	}

	public int getUser_Seq_Id() {
		return this.user_Seq_Id;
	}

	public void setUser_Seq_Id(int user_Seq_Id) {
		this.user_Seq_Id = user_Seq_Id;
	}

	public String getRole_Code() {
		return this.role_Code;
	}

	public void setRole_Code(String role_Code) {
		this.role_Code = role_Code;
	}

	public int getSchool_id() {
		return this.school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public String getUser_First_name() {
		return this.user_First_name;
	}

	public void setUser_First_name(String user_First_name) {
		this.user_First_name = user_First_name;
	}

	public String getUser_Id() {
		return this.user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	public String getUser_Last_Name() {
		return this.user_Last_Name;
	}

	public void setUser_Last_Name(String user_Last_Name) {
		this.user_Last_Name = user_Last_Name;
	}

	public String getUser_Middle_name() {
		return this.user_Middle_name;
	}

	public void setUser_Middle_name(String user_Middle_name) {
		this.user_Middle_name = user_Middle_name;
	}

	public String getUser_Password() {
		return this.user_Password;
	}

	public void setUser_Password(String user_Password) {
		this.user_Password = user_Password;
	}

	public String getUser_Status() {
		return this.user_Status;
	}

	public void setUser_Status(String user_Status) {
		this.user_Status = user_Status;
	}

}