package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the fees_template database table.
 * 
 */
@Entity
@NamedQueries({

@NamedQuery(name = "FETCH_FEES_TEMPLATE", query = "SELECT f FROM FeesTemplateEntity f WHERE f.monthYear >= :monthFirstDayAtZeroOClock "
		+ "AND f.monthYear <= :monthAfterFirstDayAtZeroOClock  AND f.classId = :classID AND f.monthlyTemplate = :isMonthlyTemplate")

}) 

@Table(name = "fees_template")
public class FeesTemplateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Fees_Template_id")
	private int feesTemplateId;

	@Column(name = "Class_id")
	private int classId;

	@Column(name = "Fees_Component_Name")
	private String feesComponentName;

	@Column(name = "Fees_Component_Value")
	private int feesComponentValue;

	@Temporal(TemporalType.DATE)
	@Column(name = "Month_Year")
	private Date monthYear;

	@Column(name = "Monthly_Template")
	private boolean monthlyTemplate;

	public FeesTemplateEntity() {
	}

	public int getFeesTemplateId() {
		return feesTemplateId;
	}

	public void setFeesTemplateId(int feesTemplateId) {
		this.feesTemplateId = feesTemplateId;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getFeesComponentName() {
		return feesComponentName;
	}

	public void setFeesComponentName(String feesComponentName) {
		this.feesComponentName = feesComponentName;
	}

	public int getFeesComponentValue() {
		return feesComponentValue;
	}

	public void setFeesComponentValue(int feesComponentValue) {
		this.feesComponentValue = feesComponentValue;
	}

	public Date getMonthYear() {
		return monthYear;
	}

	public void setMonthYear(Date monthYear) {
		this.monthYear = monthYear;
	}

	public boolean isMonthlyTemplate() {
		return monthlyTemplate;
	}

	public void setMonthlyTemplate(boolean monthlyTemplate) {
		this.monthlyTemplate = monthlyTemplate;
	}
}