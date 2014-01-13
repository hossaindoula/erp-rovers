package com.erp.util.calendar.model;

import com.erp.security.model.User;
import org.hibernate.event.PreInsertEvent;
import org.hibernate.event.PreUpdateEvent;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 1/8/14
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class CalendarEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User author;

    @ManyToOne
    private CalendarType calendarType = null;
    private String subject;
    private String description;
    private String repeatType;
    private Date startTime = new Date();
    private Date endTime = new Date();
    private Date creationDate = new Date();
    private Date updateDate = new Date();
    private boolean locked = false;

    boolean onPreInsert(PreInsertEvent event){
        creationDate = new Date();
        updateDate = new Date();
        return true;
    }

    boolean onPreUpdate(PreUpdateEvent event){
        updateDate = new Date();
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public CalendarType getCalendarType() {
        return calendarType;
    }

    public void setCalendarType(CalendarType calendarType) {
        this.calendarType = calendarType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRepeatType() {
        return repeatType;
    }

    public void setRepeatType(String repeatType) {
        this.repeatType = repeatType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
