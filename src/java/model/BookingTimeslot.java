package model;

import java.io.Serializable;

public class BookingTimeslot implements Serializable {

    private String bookingID;
    private String timeSlotID;

    public BookingTimeslot() {
    }

    public BookingTimeslot(String bookingID, String timeSlotID) {
        this.bookingID = bookingID;
        this.timeSlotID = timeSlotID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(String timeSlotID) {
        this.timeSlotID = timeSlotID;
    }
}