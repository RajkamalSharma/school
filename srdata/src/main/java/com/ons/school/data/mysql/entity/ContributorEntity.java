package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;

/**
 * The persistent class for the contributors database table.
 * 
 */

@NamedQueries({

@NamedQuery(name = "FETCH_ALL_CONTRIBUTORS_LIST", query = "SELECT C FROM ContributorEntity C WHERE C.schoolId = :schoolId"),
@NamedQuery(name = "FETCH_ACTIVE_INACTIVE_CONTRIBUTORS_LIST", query = "SELECT C FROM ContributorEntity C WHERE C.schoolId = :schoolId " +
		"and  C.emailAddressValid=:email_Address_Valid AND C.unsubscribed = :unsubscribed "),
@NamedQuery(name = "FETCH_UNSUBSCRIBED_CONTRIBUTORS_LIST", query = "SELECT C FROM ContributorEntity C WHERE C.schoolId = :schoolId " +
				"and C.unsubscribed = :unsubscribed "),
@NamedQuery(name = "FETCH_VALID_CONTRIBUTORS_LIST", query = "SELECT C FROM ContributorEntity C WHERE C.schoolId = :schoolId " +
						"and C.emailAddressValid=:email_Address_Valid "),
@NamedQuery(name = "FETCH_CONTRIBUTOR_ON_EMAILID", query = "SELECT C FROM ContributorEntity C WHERE C.schoolId = :schoolId " +
								"and C.emailId = :email_id ")
						
}) 

@Entity
@Table(name = "contributors")
public class ContributorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Contributor_id")
	private int contributorId;

	@Column(name = "Address_1")
	private String address1;

	@Column(name = "Address_2")
	private String address2;

	@Column(name = "City")
	private String city;

	@Column(name = "Contact_Number")
	private String contactNumber;

	@Column(name = "Contributor_Name")
	private String contributorName;

	@Column(name = "Country")
	private String country;

	@Column(name = "Email_Address_Valid")
	private boolean emailAddressValid;

	@Column(name = "Email_id")
	private String emailId;

	@Column(name = "Last_Response_Time")
	private Timestamp lastResponseTime;

	@Column(name = "Pincode")
	private String pincode;

	@Column(name = "School_id")
	private int schoolId;

	@Column(name = "State_id")
	private String stateId;

	@Column(name = "Unsubscribed")
	private boolean unsubscribed;

	@Column(name = "Website_Url")
	private String websiteUrl;

	public ContributorEntity() {
	}

	public int getContributorId() {
		return contributorId;
	}

	public void setContributorId(int contributorId) {
		this.contributorId = contributorId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContributorName() {
		return contributorName;
	}

	public void setContributorName(String contributorName) {
		this.contributorName = contributorName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isEmailAddressValid() {
		return emailAddressValid;
	}

	public void setEmailAddressValid(boolean emailAddressValid) {
		this.emailAddressValid = emailAddressValid;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Timestamp getLastResponseTime() {
		return lastResponseTime;
	}

	public void setLastResponseTime(Timestamp lastResponseTime) {
		this.lastResponseTime = lastResponseTime;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public boolean isUnsubscribed() {
		return unsubscribed;
	}

	public void setUnsubscribed(boolean unsubscribed) {
		this.unsubscribed = unsubscribed;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
}