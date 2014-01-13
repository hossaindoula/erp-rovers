package com.erp.util.calendar.model;

import com.erp.security.model.User;
import org.hibernate.event.PreInsertEvent;
import org.hibernate.event.PreUpdateEvent;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 1/9/14
 * Time: 12:21 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class CalendarShare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    User owner;

    @ManyToOne
    User user;

    @ManyToOne
    CalendarType calendarType = null;
    String permit = "all";
    Date creationDate = new Date();
    Date updateDate = new Date();

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

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CalendarType getCalendarType() {
        return calendarType;
    }

    public void setCalendarType(CalendarType calendarType) {
        this.calendarType = calendarType;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
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
}
