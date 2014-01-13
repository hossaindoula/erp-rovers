package com.erp.util.calendar.service;

import com.erp.util.calendar.model.CalendarEvent;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 1/9/14
 * Time: 1:28 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CalendarEventReminderService {

    public Object getReminder(CalendarEvent event);

    public boolean cleanCreate(CalendarEvent event, int alertEarlyTime, String alertType);

    public boolean create(CalendarEvent event, int alertEarlyTime, String alertType, String alertTimeUnit);

}
