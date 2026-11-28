package model;

import java.io.Serializable;
import java.sql.Date;

public class Booking implements Serializable {

    private String bookingID;
    private String studID;
    private String roomID;
    private Date bookDate;
    private String status;

    public Booking() {
    }

    public Booking(String bookingID, String studID, String roomID, Date bookDate, String status) {
        this.bookingID = bookingID;
        this.studID = studID;
        this.roomID = roomID;
        this.bookDate = bookDate;
        this.status = status;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getStudID() {
        return studID;
    }

    public void setStudID(String studID) {
        this.studID = studID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}