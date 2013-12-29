package com.erp.hrm.recruitment.model;

import com.erp.hrm.model.Department;
import com.erp.hrm.model.JobTitle;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 10:22 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class JobPosting implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private JobTitle jobTitle;

    @ManyToOne
    private Department department;


    /*number of employees for this post*/
    @Column(name = "expected_employees")
    private int expectedEmployees;

    @Column(name = "state_of_recruitment")
    private int stateOfRecruitment;// 0 = inactive, 1 = active

    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getExpectedEmployees() {
        return expectedEmployees;
    }

    public void setExpectedEmployees(int expectedEmployees) {
        this.expectedEmployees = expectedEmployees;
    }

    public int getStateOfRecruitment() {
        return stateOfRecruitment;
    }

    public void setStateOfRecruitment(int stateOfRecruitment) {
        this.stateOfRecruitment = stateOfRecruitment;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
