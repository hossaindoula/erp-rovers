package com.erp.hrm.model;

import com.erp.util.model.UserProfile;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 8:04 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="EMPLOYEE_PROFILE")
@PrimaryKeyJoinColumn(name="USER_ID")
public class EmployeeProfile extends UserProfile {

    @Column(name = "joining_date")
    private Date joiningDate;

    @Column(name = "hire_date")
    private Date hireDate;

    @Column(name = "employee_status")
    private String employeeStatus;

    @ManyToOne
    private JobTitle jobTitle; //for designation

    private double salary;

    @ManyToOne
    private EmploymentStatus status;

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmploymentStatus getStatus() {
        return status;
    }

    public void setStatus(EmploymentStatus status) {
        this.status = status;
    }
}
