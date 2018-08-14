package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the event database table.
 * 
 */

@NamedQueries({

@NamedQuery(name = "FETCH_ALL_EVENTS", query = "SELECT I FROM EventsEntity I WHERE I.school_Id = :schoolId"),
@NamedQuery(name = "FETCH_TODAYS_EVENTS", query = "SELECT I FROM EventsEntity I WHERE I.school_Id = :schoolId AND " +
		" I.event_Start_date >= :todaysDate AND I.event_End_date < :tomorrowsDate and I.event_Type = :event_Type ")

}) 


@Entity
@Table(name="event")
public class EventsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Event_id")
	private int event_id;

	@Column(name = "Event_Description")
	private String event_Description;

	@Temporal(TemporalType.DATE)
	@Column(name = "Event_End_date")
	private Date event_End_date;

	@Column(name = "Event_Name")
	private String event_Name;

	@Temporal(TemporalType.DATE)
	@Column(name = "Event_Start_date")
	private Date event_Start_date;

	@Column(name = "Event_Type")
	private int event_Type;

	@Column(name = "Event_Value")
	private int event_Value;

	@Column(name = "Is_Paid_Event")
	private boolean is_Paid_Event;
	
	@Column(name = "School_Id")
	private int school_Id;

	public EventsEntity() {
	}

	public int getEvent_id() {
		return this.event_id;
	}

	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}

	public String getEvent_Description() {
		return this.event_Description;
	}

	public void setEvent_Description(String event_Description) {
		this.event_Description = event_Description;
	}

	public Date getEvent_End_date() {
		return this.event_End_date;
	}

	public void setEvent_End_date(Date event_End_date) {
		this.event_End_date = event_End_date;
	}

	public String getEvent_Name() {
		return this.event_Name;
	}

	public void setEvent_Name(String event_Name) {
		this.event_Name = event_Name;
	}

	public Date getEvent_Start_date() {
		return this.event_Start_date;
	}

	public void setEvent_Start_date(Date event_Start_date) {
		this.event_Start_date = event_Start_date;
	}

	public int getEvent_Type() {
		return this.event_Type;
	}

	public void setEvent_Type(int event_Type) {
		this.event_Type = event_Type;
	}

	public int getEvent_Value() {
		return this.event_Value;
	}

	public void setEvent_Value(int event_Value) {
		this.event_Value = event_Value;
	}

	public boolean getIs_Paid_Event() {
		return this.is_Paid_Event;
	}

	public void setIs_Paid_Event(boolean is_Paid_Event) {
		this.is_Paid_Event = is_Paid_Event;
	}

	public int getSchool_Id() {
		return this.school_Id;
	}

	public void setSchool_Id(int school_Id) {
		this.school_Id = school_Id;
	}

}