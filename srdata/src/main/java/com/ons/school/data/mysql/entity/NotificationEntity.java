package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the notification database table.
 * 
 */



@NamedQueries({

@NamedQuery(name = "FETCH_NOTIFICATIONS", query = "SELECT o FROM NotificationEntity o WHERE o.schoolId = :schoolId " +
		"and o.notificationStartDate <= :todaysDate  and o.notificationEndDate >= :todaysDate "),

@NamedQuery(name = "FETCH_ACTIVE_NOTIFICATIONS", query = "SELECT o FROM NotificationEntity o WHERE o.schoolId = :schoolId " +
				"and o.notificationStartDate <= :todaysDate  and o.notificationEndDate >= :todaysDate  and o.showNotification = true")
		
		
}) 


@Table(name = "NotificationEntity")
@Entity
public class NotificationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Notification_id")
	private int notificationId;

	@Column(name = "Notification_End_Date")
	@Temporal(TemporalType.DATE)
	private Date notificationEndDate;

	@Column(name = "Notification_Start_Date")
	@Temporal(TemporalType.DATE)
	private Date notificationStartDate;

	@Column(name = "Notification_Text")
	private String notificationText;

	@Column(name = "School_id")
	private int schoolId;

	@Column(name = "Show_Notification")
	private boolean showNotification;

	public NotificationEntity() {
	}

	public int getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public Date getNotificationEndDate() {
		return notificationEndDate;
	}

	public void setNotificationEndDate(Date notificationEndDate) {
		this.notificationEndDate = notificationEndDate;
	}

	public Date getNotificationStartDate() {
		return notificationStartDate;
	}

	public void setNotificationStartDate(Date notificationStartDate) {
		this.notificationStartDate = notificationStartDate;
	}

	public String getNotificationText() {
		return notificationText;
	}

	public void setNotificationText(String notificationText) {
		this.notificationText = notificationText;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public boolean isShowNotification() {
		return showNotification;
	}

	public void setShowNotification(boolean showNotification) {
		this.showNotification = showNotification;
	}
}