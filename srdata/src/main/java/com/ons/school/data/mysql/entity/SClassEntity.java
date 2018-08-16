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
	private Long classId;

	@Column(name="Class_Code")
	private String classCode;

	@Column(name="Class_Fees")
	private int classFees;

	@Column(name="Class_Full_Name")
	private String fullClassName;

	@Column(name="Class_Name")
	private String className;

	@Column(name="School_id")
	private int schoolId;

    public SClassEntity() {
    }

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public int getClassFees() {
		return classFees;
	}

	public void setClassFees(int classFees) {
		this.classFees = classFees;
	}

	public String getFullClassName() {
		return fullClassName;
	}

	public void setFullClassName(String fullClassName) {
		this.fullClassName = fullClassName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
}