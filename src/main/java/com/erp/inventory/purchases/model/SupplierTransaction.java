package com.erp.inventory.purchases.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/3/14
 * Time: 2:58 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class SupplierTransaction implements Serializable {
    @Id

    private  int transNo;   //pk
    private int type;
    private int supplierId ;    //pk
    private String reference;
    private String supp_reference;
    private Date tranDate;
    private  Date dueDate;
    private double ovAmount;
    private  double ovDiscount;
    private  double ovGst;
    private double rate;
    private double alloc;

    public int getTransNo() {
        return transNo;
    }

    public void setTransNo(int transNo) {
        this.transNo = transNo;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getSupp_reference() {
        return supp_reference;
    }

    public void setSupp_reference(String supp_reference) {
        this.supp_reference = supp_reference;
    }

    public Date getTranDate() {
        return tranDate;
    }

    public void setTranDate(Date tranDate) {
        this.tranDate = tranDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getOvAmount() {
        return ovAmount;
    }

    public void setOvAmount(double ovAmount) {
        this.ovAmount = ovAmount;
    }

    public double getOvDiscount() {
        return ovDiscount;
    }

    public void setOvDiscount(double ovDiscount) {
        this.ovDiscount = ovDiscount;
    }

    public double getOvGst() {
        return ovGst;
    }

    public void setOvGst(double ovGst) {
        this.ovGst = ovGst;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getAlloc() {
        return alloc;
    }

    public void setAlloc(double alloc) {
        this.alloc = alloc;
    }
}
