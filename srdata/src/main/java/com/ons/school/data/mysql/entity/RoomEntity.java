package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the room database table.
 * 
 */
@Entity

@NamedQueries({
	
@NamedQuery(name = "FETCH_ALL_ROOMS_IN_SCHOOL", query = "SELECT R from RoomEntity R where R.school_id = :schoolId ")

}) 

@Table(name="ROOM")
public class RoomEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Room_id")
	private int room_id;

	@Column(name = "Is_Laboratory")
	private boolean is_Laboratory;

	@Column(name = "Is_Projector_Istalled")
	private boolean is_Projector_Istalled;

	@Column(name = "Room_Number")
	private String room_Number;

	@Column(name = "Room_Occupancy")
	private int room_Occupancy;
	
	
	@Column(name="School_id")
	private int school_id;

    public RoomEntity() {
    }

	public int getRoom_id() {
		return this.room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	
	public boolean isIs_Laboratory() {
		return is_Laboratory;
	}

	public void setIs_Laboratory(boolean is_Laboratory) {
		this.is_Laboratory = is_Laboratory;
	}

	public boolean isIs_Projector_Istalled() {
		return is_Projector_Istalled;
	}

	public void setIs_Projector_Istalled(boolean is_Projector_Istalled) {
		this.is_Projector_Istalled = is_Projector_Istalled;
	}

	public String getRoom_Number() {
		return this.room_Number;
	}

	public void setRoom_Number(String room_Number) {
		this.room_Number = room_Number;
	}

	public int getRoom_Occupancy() {
		return this.room_Occupancy;
	}

	public void setRoom_Occupancy(int room_Occupancy) {
		this.room_Occupancy = room_Occupancy;
	}

	public int getSchool_id() {
		return school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}
	
	

}