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
	private int event_Type_id;

	private String event_Type;

	public EventTypeEntity() {
	}

	public int getEvent_Type_id() {
		return this.event_Type_id;
	}

	public void setEvent_Type_id(int event_Type_id) {
		this.event_Type_id = event_Type_id;
	}

	public String getEvent_Type() {
		return this.event_Type;
	}

	public void setEvent_Type(String event_Type) {
		this.event_Type = event_Type;
	}

}