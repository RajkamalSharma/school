package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the notification database table.
 * 
 */



@NamedQueries({

@NamedQuery(name = "FETCH_NOTIFICATIONS", query = "SELECT o FROM NotificationEntity o WHERE o.school_id = :schoolId " +
		"and o.notification_Start_Date <= :todaysDate  and o.notification_End_Date >= :todaysDate "),

@NamedQuery(name = "FETCH_ACTIVE_NOTIFICATIONS", query = "SELECT o FROM NotificationEntity o WHERE o.school_id = :schoolId " +
				"and o.notification_Start_Date <= :todaysDate  and o.notification_End_Date >= :todaysDate  and o.show_Notification = true")
		
		
}) 


@Table(name = "NotificationEntity")
@Entity
public class NotificationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Notification_id")
	private int notification_id;

	@Column(name = "Notification_End_Date")
	@Temporal(TemporalType.DATE)
	private Date notification_End_Date;

	@Column(name = "Notification_Start_Date")
	@Temporal(TemporalType.DATE)
	private Date notification_Start_Date;

	@Column(name = "Notification_Text")
	private String notification_Text;

	@Column(name = "School_id")
	private int school_id;

	@Column(name = "Show_Notification")
	private boolean show_Notification;

	public NotificationEntity() {
	}

	public int getNotification_id() {
		return this.notification_id;
	}

	public void setNotification_id(int notification_id) {
		this.notification_id = notification_id;
	}

	public Date getNotification_End_Date() {
		return this.notification_End_Date;
	}

	public void setNotification_End_Date(Date notification_End_Date) {
		this.notification_End_Date = notification_End_Date;
	}

	public Date getNotification_Start_Date() {
		return this.notification_Start_Date;
	}

	public void setNotification_Start_Date(Date notification_Start_Date) {
		this.notification_Start_Date = notification_Start_Date;
	}

	public String getNotification_Text() {
		return this.notification_Text;
	}

	public void setNotification_Text(String notification_Text) {
		this.notification_Text = notification_Text;
	}

	public int getSchool_id() {
		return this.school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public boolean isShow_Notification() {
		return show_Notification;
	}

	public void setShow_Notification(boolean show_Notification) {
		this.show_Notification = show_Notification;
	}

}