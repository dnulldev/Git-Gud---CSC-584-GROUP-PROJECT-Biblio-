package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;

public class Timeslot implements Serializable {

    private String timeSlotID;
    private Time startTime;
    private Time endTime;
    private BigDecimal durationHours;

    public Timeslot() {
    }

    public Timeslot(String timeSlotID, Time startTime, Time endTime, BigDecimal durationHours) {
        this.timeSlotID = timeSlotID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.durationHours = durationHours;
    }

    public String getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(String timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(BigDecimal durationHours) {
        this.durationHours = durationHours;
    }
}