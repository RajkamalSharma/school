package com.ons.school.data.mysql.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the room database table.
 * 
 */
@Entity

@NamedQueries({
	
@NamedQuery(name = "FETCH_ALL_ROOMS_IN_SCHOOL", query = "SELECT R from RoomEntity R where R.schoolId = :schoolId ")

}) 

@Table(name="ROOM")
public class RoomEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "RoomId")
	private int roomId;

	@Column(name = "Is_Laboratory")
	private boolean isLaboratory;

	@Column(name = "Is_Projector_Istalled")
	private boolean isProjectorIstalled;

	@Column(name = "Room_Number")
	private String roomNumber;

	@Column(name = "Room_Occupancy")
	private int roomOccupancy;
	
	
	@Column(name="School_id")
	private int schoolId;

    public RoomEntity() {
    }

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public boolean isLaboratory() {
		return isLaboratory;
	}

	public void setLaboratory(boolean laboratory) {
		isLaboratory = laboratory;
	}

	public boolean isProjectorIstalled() {
		return isProjectorIstalled;
	}

	public void setProjectorIstalled(boolean projectorIstalled) {
		isProjectorIstalled = projectorIstalled;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getRoomOccupancy() {
		return roomOccupancy;
	}

	public void setRoomOccupancy(int roomOccupancy) {
		this.roomOccupancy = roomOccupancy;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
}