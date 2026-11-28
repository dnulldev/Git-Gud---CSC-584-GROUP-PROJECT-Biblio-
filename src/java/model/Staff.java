package model;

import java.io.Serializable;

public class Staff implements Serializable {

    private String staffID;
    private String name;
    private String phoneNum;
    private String email;
    private String password;
    private String role;

    public Staff() {
    }

    public Staff(String staffID, String name, String phoneNum, String email, String password, String role) {
        this.staffID = staffID;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}