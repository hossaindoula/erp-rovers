package com.erp.hrm.time.model;

import com.erp.hrm.model.Employee;
import com.erp.security.model.User;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 11:33 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "leave_waiver")
public class LeaveWaiver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Employee waiverEmployee;

    @Temporal(TemporalType.DATE)
    @Column(name = "waiver_date")
    private Date waiverDate;

    @Temporal(TemporalType.TIME)
    @Column(name = "waiver_time")
    private Date waiverTime;

    @Temporal(TemporalType.DATE)
    @Column(name = "application_date")
    private Date applicationDate;

    @ManyToOne
    private User approvedBy;
    private String reason;

    @Column(name = "approved_disapproved_reason")
    private String approvedDisapprovedReason;

    @Column(name = "waiver_status")
    private int waiverStatus;//0 = disapproved, 1 = approved, 2 = pending

    @Column(name = "waiver_type")
    private int waiverType; // 0 = Late, 1 = Advance

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getWaiverEmployee() {
        return waiverEmployee;
    }

    public void setWaiverEmployee(Employee waiverEmployee) {
        this.waiverEmployee = waiverEmployee;
    }

    public Date getWaiverDate() {
        return waiverDate;
    }

    public void setWaiverDate(Date waiverDate) {
        this.waiverDate = waiverDate;
    }

    public Date getWaiverTime() {
        return waiverTime;
    }

    public void setWaiverTime(Date waiverTime) {
        this.waiverTime = waiverTime;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public User getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(User approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getApprovedDisapprovedReason() {
        return approvedDisapprovedReason;
    }

    public void setApprovedDisapprovedReason(String approvedDisapprovedReason) {
        this.approvedDisapprovedReason = approvedDisapprovedReason;
    }

    public int getWaiverStatus() {
        return waiverStatus;
    }

    public void setWaiverStatus(int waiverStatus) {
        this.waiverStatus = waiverStatus;
    }

    public int getWaiverType() {
        return waiverType;
    }

    public void setWaiverType(int waiverType) {
        this.waiverType = waiverType;
    }
}
