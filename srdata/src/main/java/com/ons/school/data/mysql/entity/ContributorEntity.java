package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;

/**
 * The persistent class for the contributors database table.
 * 
 */

@NamedQueries({

@NamedQuery(name = "FETCH_ALL_CONTRIBUTORS_LIST", query = "SELECT C FROM ContributorEntity C WHERE C.school_id = :schoolId"),
@NamedQuery(name = "FETCH_ACTIVE_INACTIVE_CONTRIBUTORS_LIST", query = "SELECT C FROM ContributorEntity C WHERE C.school_id = :schoolId " +
		"and  C.email_Address_Valid=:email_Address_Valid AND C.unsubscribed = :unsubscribed "),
@NamedQuery(name = "FETCH_UNSUBSCRIBED_CONTRIBUTORS_LIST", query = "SELECT C FROM ContributorEntity C WHERE C.school_id = :schoolId " +
				"and C.unsubscribed = :unsubscribed "),
@NamedQuery(name = "FETCH_VALID_CONTRIBUTORS_LIST", query = "SELECT C FROM ContributorEntity C WHERE C.school_id = :schoolId " +
						"and C.email_Address_Valid=:email_Address_Valid "),
@NamedQuery(name = "FETCH_CONTRIBUTOR_ON_EMAILID", query = "SELECT C FROM ContributorEntity C WHERE C.school_id = :schoolId " +
								"and C.email_id = :email_id ")
						
}) 

@Entity
@Table(name = "contributors")
public class ContributorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Contributor_id")
	private int contributor_id;

	@Column(name = "Address_1")
	private String address_1;

	@Column(name = "Address_2")
	private String address_2;

	@Column(name = "City")
	private String city;

	@Column(name = "Contact_Number")
	private String contact_Number;

	@Column(name = "Contributor_Name")
	private String contributor_Name;

	@Column(name = "Country")
	private String country;

	@Column(name = "Email_Address_Valid")
	private boolean email_Address_Valid;

	@Column(name = "Email_id")
	private String email_id;

	@Column(name = "Last_Response_Time")
	private Timestamp last_Response_Time;

	@Column(name = "Pincode")
	private String pincode;

	@Column(name = "School_id")
	private int school_id;

	@Column(name = "State_id")
	private String state_id;

	@Column(name = "Unsubscribed")
	private boolean unsubscribed;

	@Column(name = "Website_Url")
	private String website_Url;

	public ContributorEntity() {
	}

	public int getContributor_id() {
		return this.contributor_id;
	}

	public void setContributor_id(int contributor_id) {
		this.contributor_id = contributor_id;
	}

	public String getAddress_1() {
		return this.address_1;
	}

	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}

	public String getAddress_2() {
		return this.address_2;
	}

	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact_Number() {
		return this.contact_Number;
	}

	public void setContact_Number(String contact_Number) {
		this.contact_Number = contact_Number;
	}

	public String getContributor_Name() {
		return this.contributor_Name;
	}

	public void setContributor_Name(String contributor_Name) {
		this.contributor_Name = contributor_Name;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}



	public String getEmail_id() {
		return this.email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public Timestamp getLast_Response_Time() {
		return this.last_Response_Time;
	}

	public void setLast_Response_Time(Timestamp last_Response_Time) {
		this.last_Response_Time = last_Response_Time;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getSchool_id() {
		return this.school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public String getState_id() {
		return this.state_id;
	}

	public void setState_id(String state_id) {
		this.state_id = state_id;
	}
 
	
	public boolean isEmail_Address_Valid() {
		return email_Address_Valid;
	}

	public void setEmail_Address_Valid(boolean email_Address_Valid) {
		this.email_Address_Valid = email_Address_Valid;
	}

	public boolean isUnsubscribed() {
		return unsubscribed;
	}

	public void setUnsubscribed(boolean unsubscribed) {
		this.unsubscribed = unsubscribed;
	}

	public String getWebsite_Url() {
		return this.website_Url;
	}

	public void setWebsite_Url(String website_Url) {
		this.website_Url = website_Url;
	}

}