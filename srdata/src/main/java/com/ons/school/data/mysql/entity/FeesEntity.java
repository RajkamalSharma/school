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

@NamedQuery(name = "FETCH_STUDENT_FEES_FOR_A_MONTH", query = "SELECT f from FeesEntity f where f.studentId= :student_id AND f.schoolId= :school_id"
		+ " AND f.classId= :class_id AND f.feesMonth >= :monthFirstDayAtZeroOClock	AND f.feesMonth <= :monthAfterFirstDayAtZeroOClock  "),


@NamedQuery(name = "FETCH_CLASS_FEES_STATUS_FOR_A_MONTH", query = "SELECT f from FeesEntity f where f.schoolId= :school_id"
		+ " AND f.classId= :class_id AND f.feesMonth >= :monthFirstDayAtZeroOClock	AND f.feesMonth <= :monthAfterFirstDayAtZeroOClock " +
		" AND f.feesPaid = :fees_paid "),
		
		

@NamedQuery(name = "FETCH_SCHOOL_FEES_STATUS_FOR_A_MONTH", query = "SELECT f from FeesEntity f where f.schoolId= :school_id"
		+ " AND f.feesMonth >= :monthFirstDayAtZeroOClock	AND f.feesMonth <= :monthAfterFirstDayAtZeroOClock  AND f.feesPaid = :fees_paid  ")

}
)


@Table(name = "fees")
public class FeesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Fees_id")
	private int feesId;

	@Column(name = "Class_id")
	private int classId;

	@Column(name = "Fees_Month")
	@Temporal(TemporalType.DATE)
	private Date feesMonth;

	@Column(name = "Fees_Paid")
	private boolean feesPaid;

	@Column(name = "Previous_Fees_Paid")
	private boolean previousFeesPaid;

	@Column(name = "School_id")
	private int schoolId;

	@Column(name = "Student_id")
	private int studentId;

	@Column(name = "Total_Fees")
	private int totalFees;

	// bi-directional many-to-one association to FeesDetail
	@OneToMany(mappedBy = "feesEntity",fetch=FetchType.EAGER,cascade = { CascadeType.ALL,CascadeType.PERSIST,CascadeType.MERGE })
	private Set<FeesDetail> feesDetails;

	public FeesEntity() {
	}

	public int getFeesId() {
		return feesId;
	}

	public void setFeesId(int feesId) {
		this.feesId = feesId;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public Date getFeesMonth() {
		return feesMonth;
	}

	public void setFeesMonth(Date feesMonth) {
		this.feesMonth = feesMonth;
	}

	public boolean isFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(boolean feesPaid) {
		this.feesPaid = feesPaid;
	}

	public boolean isPreviousFeesPaid() {
		return previousFeesPaid;
	}

	public void setPreviousFeesPaid(boolean previousFeesPaid) {
		this.previousFeesPaid = previousFeesPaid;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(int totalFees) {
		this.totalFees = totalFees;
	}

	public Set<FeesDetail> getFeesDetails() {
		return feesDetails;
	}

	public void setFeesDetails(Set<FeesDetail> feesDetails) {
		this.feesDetails = feesDetails;
	}
}