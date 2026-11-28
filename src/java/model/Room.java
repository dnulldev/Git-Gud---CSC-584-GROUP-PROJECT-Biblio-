package model;

import java.io.Serializable;

public class Room implements Serializable {

    private String roomID;
    private String staffID;
    private String roomName;
    private int capacity;
    private String roomType;
    private String status;

    public Room() {
    }

    public Room(String roomID, String staffID, String roomName, int capacity, String roomType, String status) {
        this.roomID = roomID;
        this.staffID = staffID;
        this.roomName = roomName;
        this.capacity = capacity;
        this.roomType = roomType;
        this.status = status;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}