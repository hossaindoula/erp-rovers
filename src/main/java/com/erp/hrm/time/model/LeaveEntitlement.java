package com.erp.hrm.time.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 11:31 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "leave_entitlement")
public class LeaveEntitlement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Leave leave;

//    @ManyToOne
//    private JobCategory ;

    @Column(name = "number_of_days")
    private Integer numberOfDays;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Leave getLeave() {
        return leave;
    }

    public void setLeave(Leave leave) {
        this.leave = leave;
    }

//    public JobCategory getJobCategory() {
//        return jobCategory;
//    }

//    public void setJobCategory(JobCategory jobCategory) {
//        this.jobCategory = jobCategory;
//    }

    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}