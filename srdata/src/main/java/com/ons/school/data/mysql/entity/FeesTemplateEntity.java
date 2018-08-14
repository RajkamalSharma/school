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

@NamedQuery(name = "FETCH_FEES_TEMPLATE", query = "SELECT f FROM FeesTemplateEntity f WHERE f.month_Year >= :monthFirstDayAtZeroOClock "
		+ "AND f.month_Year <= :monthAfterFirstDayAtZeroOClock  AND f.class_id = :classID AND f.monthly_Template = :isMonthlyTemplate")

}) 

@Table(name = "fees_template")
public class FeesTemplateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Fees_Template_id")
	private int fees_Template_id;

	@Column(name = "Class_id")
	private int class_id;

	@Column(name = "Fees_Component_Name")
	private String fees_Component_Name;

	@Column(name = "Fees_Component_Value")
	private int fees_Component_Value;

	@Temporal(TemporalType.DATE)
	@Column(name = "Month_Year")
	private Date month_Year;

	@Column(name = "Monthly_Template")
	private boolean monthly_Template;

	public FeesTemplateEntity() {
	}

	public int getFees_Template_id() {
		return this.fees_Template_id;
	}

	public void setFees_Template_id(int fees_Template_id) {
		this.fees_Template_id = fees_Template_id;
	}

	public int getClass_id() {
		return this.class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getFees_Component_Name() {
		return this.fees_Component_Name;
	}

	public void setFees_Component_Name(String fees_Component_Name) {
		this.fees_Component_Name = fees_Component_Name;
	}

	public int getFees_Component_Value() {
		return this.fees_Component_Value;
	}

	public void setFees_Component_Value(int fees_Component_Value) {
		this.fees_Component_Value = fees_Component_Value;
	}

	public Date getMonth_Year() {
		return this.month_Year;
	}

	public void setMonth_Year(Date month_Year) {
		this.month_Year = month_Year;
	}

	public boolean getMonthly_Template() {
		return this.monthly_Template;
	}

	public void setMonthly_Template(boolean monthly_Template) {
		this.monthly_Template = monthly_Template;
	}

}