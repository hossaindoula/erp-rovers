package com.erp.util.calendar.model;

import com.erp.security.model.User;
import org.hibernate.event.PreInsertEvent;
import org.hibernate.event.PreUpdateEvent;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 1/9/14
 * Time: 12:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class CalendarSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User author;
    private String hourFormat = "24";
    private String dayFormat = "l M d Y";
    private String weekFormat = "m/d(D)";
    private String monthFormat = "m/d";
    private String fromtoFormat = "m/d/Y";
    private String language = "en";
    private String activeStartTime = "09:00";
    private String activeEndTime = "19:00";
    private String intervalSlot = "30";
    private String startDay = "1";
    private boolean createByDblclick = false;
    private boolean hideInactiveRow = false;
    private boolean singleDay = false;
    private boolean readOnly = false;
    private int initialView = 1;

    private Date creationDate = new Date();
    private Date updateDate = new Date();

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

    public String getHourFormat() {
        return hourFormat;
    }

    public void setHourFormat(String hourFormat) {
        this.hourFormat = hourFormat;
    }

    public String getDayFormat() {
        return dayFormat;
    }

    public void setDayFormat(String dayFormat) {
        this.dayFormat = dayFormat;
    }

    public String getWeekFormat() {
        return weekFormat;
    }

    public void setWeekFormat(String weekFormat) {
        this.weekFormat = weekFormat;
    }

    public String getMonthFormat() {
        return monthFormat;
    }

    public void setMonthFormat(String monthFormat) {
        this.monthFormat = monthFormat;
    }

    public String getFromtoFormat() {
        return fromtoFormat;
    }

    public void setFromtoFormat(String fromtoFormat) {
        this.fromtoFormat = fromtoFormat;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getActiveStartTime() {
        return activeStartTime;
    }

    public void setActiveStartTime(String activeStartTime) {
        this.activeStartTime = activeStartTime;
    }

    public String getActiveEndTime() {
        return activeEndTime;
    }

    public void setActiveEndTime(String activeEndTime) {
        this.activeEndTime = activeEndTime;
    }

    public String getIntervalSlot() {
        return intervalSlot;
    }

    public void setIntervalSlot(String intervalSlot) {
        this.intervalSlot = intervalSlot;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public boolean isCreateByDblclick() {
        return createByDblclick;
    }

    public void setCreateByDblclick(boolean createByDblclick) {
        this.createByDblclick = createByDblclick;
    }

    public boolean isHideInactiveRow() {
        return hideInactiveRow;
    }

    public void setHideInactiveRow(boolean hideInactiveRow) {
        this.hideInactiveRow = hideInactiveRow;
    }

    public boolean isSingleDay() {
        return singleDay;
    }

    public void setSingleDay(boolean singleDay) {
        this.singleDay = singleDay;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public int getInitialView() {
        return initialView;
    }

    public void setInitialView(int initialView) {
        this.initialView = initialView;
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
