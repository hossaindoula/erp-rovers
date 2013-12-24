package com.erp.inventory.branch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/22/13
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Branch implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int branchCode;
    private  String branchName ;
    private  String contactName;


    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

}
