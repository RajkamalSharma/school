package com.ons.school.web.application.vo;

public class RoomVo {

    private String roomId;
    private String roomNumber;
    private boolean laboratory;
    private boolean projectorInstalled;
    private int roomOccupancy;
    private String schoolId;


    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isLaboratory() {
        return laboratory;
    }

    public void setLaboratory(boolean laboratory) {
        this.laboratory = laboratory;
    }

    public boolean isProjectorInstalled() {
        return projectorInstalled;
    }

    public void setProjectorInstalled(boolean projectorInstalled) {
        this.projectorInstalled = projectorInstalled;
    }

    public int getRoomOccupancy() {
        return roomOccupancy;
    }

    public void setRoomOccupancy(int roomOccupancy) {
        this.roomOccupancy = roomOccupancy;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }


}
