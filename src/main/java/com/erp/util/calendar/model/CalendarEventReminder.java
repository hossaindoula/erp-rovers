package com.erp.util.calendar.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 1/8/14
 * Time: 8:59 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class CalendarEventReminder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private CalendarEvent event;

    // in this case, it will be email, pop message
    // will add more in the future
    private String alertType;

    // will be in min
    private int alertEarlyTime = 0;

    // min, hour, day etc..
    private String timeUnit;
    private String alerted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CalendarEvent getEvent() {
        return event;
    }

    public void setEvent(CalendarEvent event) {
        this.event = event;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public int getAlertEarlyTime() {
        return alertEarlyTime;
    }

    public void setAlertEarlyTime(int alertEarlyTime) {
        this.alertEarlyTime = alertEarlyTime;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    public String getAlerted() {
        return alerted;
    }

    public void setAlerted(String alerted) {
        this.alerted = alerted;
    }
}
