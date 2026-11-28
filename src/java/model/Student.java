package model;

import java.io.Serializable;

public class Student implements Serializable {

    private String studID;
    private String name;
    private String phoneNum;
    private String email;
    private String password;
    private String course;

    public Student() {
    }

    public Student(String studID, String name, String phoneNum, String email, String password, String course) {
        this.studID = studID;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.password = password;
        this.course = course;
    }

    public String getStudID() {
        return studID;
    }

    public void setStudID(String studID) {
        this.studID = studID;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}