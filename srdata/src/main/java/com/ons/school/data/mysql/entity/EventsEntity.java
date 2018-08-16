package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the event database table.
 * 
 */

@NamedQueries({

@NamedQuery(name = "FETCH_ALL_EVENTS", query = "SELECT I FROM EventsEntity I WHERE I.schoolId = :schoolId"),
@NamedQuery(name = "FETCH_TODAYS_EVENTS", query = "SELECT I FROM EventsEntity I WHERE I.schoolId = :schoolId AND " +
		" I.eventStartDate >= :todaysDate AND I.eventEndDate < :tomorrowsDate and I.eventType = :event_Type ")

}) 


@Entity
@Table(name="event")
public class EventsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Event_id")
	private int eventId;

	@Column(name = "Event_Description")
	private String eventDescription;

	@Temporal(TemporalType.DATE)
	@Column(name = "Event_End_date")
	private Date eventEndDate;

	@Column(name = "Event_Name")
	private String eventName;

	@Temporal(TemporalType.DATE)
	@Column(name = "Event_Start_date")
	private Date eventStartDate;

	@Column(name = "Event_Type")
	private int eventType;

	@Column(name = "Event_Value")
	private int eventValue;

	@Column(name = "Is_Paid_Event")
	private boolean isPaidEvent;
	
	@Column(name = "School_Id")
	private int schoolId;

	public EventsEntity() {
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public Date getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(Date eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(Date eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public int getEventValue() {
		return eventValue;
	}

	public void setEventValue(int eventValue) {
		this.eventValue = eventValue;
	}

	public boolean isPaidEvent() {
		return isPaidEvent;
	}

	public void setPaidEvent(boolean paidEvent) {
		isPaidEvent = paidEvent;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
}