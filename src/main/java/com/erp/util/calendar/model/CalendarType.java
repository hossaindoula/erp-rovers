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
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class CalendarType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne
    private User author;
    private String description = null;
    private String color = "blue";
    private boolean hide = false;

    private Date creationDate = new Date();
    private Date updateDate = new Date();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
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

    boolean onPreInsert(PreInsertEvent event){
        creationDate = new Date();
        updateDate = new Date();
        return true;
    }

    boolean onPreUpdate(PreUpdateEvent event){
        updateDate = new Date();
        return true;
    }

}
