package com.erp.inventory.sales.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/3/14
 * Time: 3:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class WorkOrderIssues implements Serializable {
    @Id

    private int id;
    private int issue_no;//pk
    private int workOrderId;// pk
    private String reference;
    private Date issueDate;
    private String locCode;
    private  int workCentreId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIssue_no() {
        return issue_no;
    }

    public void setIssue_no(int issue_no) {
        this.issue_no = issue_no;
    }

    public int getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(int workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getLocCode() {
        return locCode;
    }

    public void setLocCode(String locCode) {
        this.locCode = locCode;
    }

    public int getWorkCentreId() {
        return workCentreId;
    }

    public void setWorkCentreId(int workCentreId) {
        this.workCentreId = workCentreId;
    }
}
