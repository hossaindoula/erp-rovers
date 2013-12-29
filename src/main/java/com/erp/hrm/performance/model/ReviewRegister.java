package com.erp.hrm.performance.model;

import com.erp.hrm.model.Department;
import com.erp.hrm.model.Employee;
import com.erp.hrm.model.Employee;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 9:50 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class ReviewRegister implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Employee reviewee;

    @ManyToOne
    private Employee reviewer;

    @ManyToOne
    private Department department;

    @Temporal(TemporalType.DATE)
    @Column(name = "review_from")
    private Date reviewFrom;

    @Temporal(TemporalType.DATE)
    @Column(name = "review_to")
    private Date reviewTo;

    @Temporal(TemporalType.DATE)
    private Date dueDate;

    @Lob
    private String notes;
    private Integer status; //Being Reviewed(1), Scheduled(2),Reviewed Granted(3),Reviewed Rejected(4),

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getReviewee() {
        return reviewee;
    }

    public void setReviewee(Employee reviewee) {
        this.reviewee = reviewee;
    }

    public Employee getReviewer() {
        return reviewer;
    }

    public void setReviewer(Employee reviewer) {
        this.reviewer = reviewer;
    }

    public Date getReviewFrom() {
        return reviewFrom;
    }

    public void setReviewFrom(Date reviewFrom) {
        this.reviewFrom = reviewFrom;
    }

    public Date getReviewTo() {
        return reviewTo;
    }

    public void setReviewTo(Date reviewTo) {
        this.reviewTo = reviewTo;
    }

}
