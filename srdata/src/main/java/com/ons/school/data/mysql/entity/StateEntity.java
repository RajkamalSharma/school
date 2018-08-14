package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the state database table.
 * 
 */
@Entity
@Table(name = "StateEntity")
public class StateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "State_id")
	private int state_id;

	@Column(name = "State_Name")
	private String state_Name;

	public StateEntity() {
	}

	public int getState_id() {
		return this.state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	public String getState_Name() {
		return this.state_Name;
	}

	public void setState_Name(String state_Name) {
		this.state_Name = state_Name;
	}

}