package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the fees database table.
 * 
 */
@Entity
@NamedQueries({

@NamedQuery(name = "FETCH_STUDENT_FEES_FOR_A_MONTH", query = "SELECT f from FeesEntity f where f.student_id= :student_id AND f.school_id= :school_id"
		+ " AND f.class_id= :class_id AND f.fees_Month >= :monthFirstDayAtZeroOClock	AND f.fees_Month <= :monthAfterFirstDayAtZeroOClock  "),


@NamedQuery(name = "FETCH_CLASS_FEES_STATUS_FOR_A_MONTH", query = "SELECT f from FeesEntity f where f.school_id= :school_id"
		+ " AND f.class_id= :class_id AND f.fees_Month >= :monthFirstDayAtZeroOClock	AND f.fees_Month <= :monthAfterFirstDayAtZeroOClock " +
		" AND f.fees_Paid = :fees_paid "),
		
		

@NamedQuery(name = "FETCH_SCHOOL_FEES_STATUS_FOR_A_MONTH", query = "SELECT f from FeesEntity f where f.school_id= :school_id"
		+ " AND f.fees_Month >= :monthFirstDayAtZeroOClock	AND f.fees_Month <= :monthAfterFirstDayAtZeroOClock  AND f.fees_Paid = :fees_paid  ")	

}
)


@Table(name = "fees")
public class FeesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Fees_id")
	private int fees_id;

	@Column(name = "Class_id")
	private int class_id;

	@Column(name = "Fees_Month")
	@Temporal(TemporalType.DATE)
	private Date fees_Month;

	@Column(name = "Fees_Paid")
	private boolean fees_Paid;

	@Column(name = "Previous_Fees_Paid")
	private boolean previous_Fees_Paid;

	@Column(name = "School_id")
	private int school_id;

	@Column(name = "Student_id")
	private int student_id;

	@Column(name = "Total_Fees")
	private int total_Fees;

	// bi-directional many-to-one association to FeesDetail
	@OneToMany(mappedBy = "feesEntity",fetch=FetchType.EAGER,cascade = { CascadeType.ALL,CascadeType.PERSIST,CascadeType.MERGE })
	private Set<FeesDetail> feesDetails;

	public FeesEntity() {
	}

	public int getFees_id() {
		return this.fees_id;
	}

	public void setFees_id(int fees_id) {
		this.fees_id = fees_id;
	}

	public int getClass_id() {
		return this.class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public Date getFees_Month() {
		return this.fees_Month;
	}

	public void setFees_Month(Date fees_Month) {
		this.fees_Month = fees_Month;
	}

	public boolean getFees_Paid() {
		return this.fees_Paid;
	}

	public void setFees_Paid(boolean fees_Paid) {
		this.fees_Paid = fees_Paid;
	}

	public boolean getPrevious_Fees_Paid() {
		return this.previous_Fees_Paid;
	}

	public void setPrevious_Fees_Paid(boolean previous_Fees_Paid) {
		this.previous_Fees_Paid = previous_Fees_Paid;
	}

	public int getSchool_id() {
		return this.school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public int getStudent_id() {
		return this.student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getTotal_Fees() {
		return this.total_Fees;
	}

	public void setTotal_Fees(int total_Fees) {
		this.total_Fees = total_Fees;
	}

	public Set<FeesDetail> getFeesDetails() {
		return this.feesDetails;
	}

	public void setFeesDetails(Set<FeesDetail> feesDetails) {
		this.feesDetails = feesDetails;
	}

}