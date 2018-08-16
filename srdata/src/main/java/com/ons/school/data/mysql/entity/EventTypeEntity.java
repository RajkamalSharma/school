package com.ons.school.data.mysql.entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the event_type database table.
 * 
 */

@NamedQueries({

@NamedQuery(name = "FETCH_ALL_EVENT_TYPES", query = "SELECT I FROM EventTypeEntity I")
}) 

@Entity
@Table(name="event_type")
public class EventTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eventTypeId;

	private String eventType;

	public EventTypeEntity() {
	}

	public int getEventTypeId() {
		return eventTypeId;
	}

	public void setEventTypeId(int eventTypeId) {
		this.eventTypeId = eventTypeId;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
}