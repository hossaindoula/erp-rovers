package com.erp.hrm.time.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 11:32 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "leave_register")
public class LeaveRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;

    @Column(name = "apply_date")
    private Date applyDate;

    @Column(name = "leave_days")
    private Integer leaveDays;

    @Column(name = "leave_purpose")
    private String leavePurpose;
    private String remark;

    @ManyToOne
    private Leave leaveType;

    @Column(name = "leave_status")
    private int leaveStatus;  //0=disapproved, 1=approved, 2=pending

    @Column(name = "approved_reject_reason")
    private String approvedDisapprovedReason;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Integer getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(Integer leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getLeavePurpose() {
        return leavePurpose;
    }

    public void setLeavePurpose(String leavePurpose) {
        this.leavePurpose = leavePurpose;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Leave getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(Leave leaveType) {
        this.leaveType = leaveType;
    }

    public int getLeaveStatus() {
        return leaveStatus;
    }

    public void setLeaveStatus(int leaveStatus) {
        this.leaveStatus = leaveStatus;
    }

    public String getApprovedDisapprovedReason() {
        return approvedDisapprovedReason;
    }

    public void setApprovedDisapprovedReason(String approvedDisapprovedReason) {
        this.approvedDisapprovedReason = approvedDisapprovedReason;
    }
}