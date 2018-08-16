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
	private int stateId;

	@Column(name = "State_Name")
	private String stateName;

	public StateEntity() {
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
}