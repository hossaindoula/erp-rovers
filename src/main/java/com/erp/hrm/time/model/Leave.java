package com.erp.hrm.time.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 11:29 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "hr_leave")
public class Leave {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "leave_type")
    private String leaveType;

    @Column(name = "leave_duration")
    private Integer leaveDuration;

    @Column(name = "leave_notes")
    private String leaveNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public Integer getLeaveDuration() {
        return leaveDuration;
    }

    public void setLeaveDuration(Integer leaveDuration) {
        this.leaveDuration = leaveDuration;
    }

    public String getLeaveNotes() {
        return leaveNotes;
    }

    public void setLeaveNotes(String leaveNotes) {
        this.leaveNotes = leaveNotes;
    }
}