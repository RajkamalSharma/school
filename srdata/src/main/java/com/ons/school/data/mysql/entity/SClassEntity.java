package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the class database table.
 * 
 */
@Entity
@Table(name="Class")
public class SClassEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Class_id")
	private Long class_id;

	@Column(name="Class_Code")
	private String class_Code;

	@Column(name="Class_Fees")
	private int class_Fees;

	@Column(name="Class_Full_Name")
	private String class_Full_Name;

	@Column(name="Class_Name")
	private String class_Name;

	@Column(name="School_id")
	private int school_id;

    public SClassEntity() {
    }

	public Long getClass_id() {
		return this.class_id;
	}

	public void setClass_id(Long class_id) {
		this.class_id = class_id;
	}

	public String getClass_Code() {
		return this.class_Code;
	}

	public void setClass_Code(String class_Code) {
		this.class_Code = class_Code;
	}

	public int getClass_Fees() {
		return this.class_Fees;
	}

	public void setClass_Fees(int class_Fees) {
		this.class_Fees = class_Fees;
	}

	public String getClass_Full_Name() {
		return this.class_Full_Name;
	}

	public void setClass_Full_Name(String class_Full_Name) {
		this.class_Full_Name = class_Full_Name;
	}

	public String getClass_Name() {
		return this.class_Name;
	}

	public void setClass_Name(String class_Name) {
		this.class_Name = class_Name;
	}

	public int getSchool_id() {
		return this.school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

}