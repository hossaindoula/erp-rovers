package com.erp.hrm.time.model;

import com.erp.hrm.model.Employee;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "attendance_register")
public class AttendanceRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "job_date")
    private Date jobDate;
    private String remark;

    @Temporal(TemporalType.TIME)
    @Column(name = "in_time")
    private Date inTime;

    @Temporal(TemporalType.TIME)
    @Column(name = "out_time")
    private Date outTime;

    @ManyToOne
    private Employee attendant;

    @Column(name = "actual_work_hours")
    private Double actualWorkHours;

    @Column(name = "late_minute")
    private Double lateMinute;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getJobDate() {
        return jobDate;
    }

    public void setJobDate(Date jobDate) {
        this.jobDate = jobDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Employee getAttendant() {
        return attendant;
    }

    public void setAttendant(Employee attendant) {
        this.attendant = attendant;
    }

    public Double getActualWorkHours() {
        return actualWorkHours;
    }

    public void setActualWorkHours(Double actualWorkHours) {
        this.actualWorkHours = actualWorkHours;
    }

    public Double getLateMinute() {
        return lateMinute;
    }

    public void setLateMinute(Double lateMinute) {
        this.lateMinute = lateMinute;
    }
}