package com.erp.hrm.model;

import com.erp.util.model.UserProfile;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 8:04 PM
 * To change this template use File | Settings | File Templates.
 */
@Table
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

}
