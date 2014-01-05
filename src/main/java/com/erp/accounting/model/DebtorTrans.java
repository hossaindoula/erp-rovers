package com.erp.accounting.model;

import com.erp.inventory.branch.model.Branch;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/1/14
 * Time: 12:45 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class DebtorTrans implements Serializable {
    @Id

    private int id;
    private int   transNo;
    private int  type;
    private int debtorNo;
    @ManyToOne
    private Branch branchCode;
    private Date tranDate;
    private Date dueDate;
    private String reference;
    private int tpe;
    private  int order;
    private double ovAmount;
    private double ovGst;
    private  double ovFreight;
    private double ovDiscount;
    private  double alloc;
    private double rate;
    private int shipVia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getDebtorNo() {
        return debtorNo;
    }

    public void setDebtorNo(int debtorNo) {
        this.debtorNo = debtorNo;
    }

    public Branch getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Branch branchCode) {
        this.branchCode = branchCode;
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getTpe() {
        return tpe;
    }

    public void setTpe(int tpe) {
        this.tpe = tpe;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public double getOvAmount() {
        return ovAmount;
    }

    public void setOvAmount(double ovAmount) {
        this.ovAmount = ovAmount;
    }

    public double getOvGst() {
        return ovGst;
    }

    public void setOvGst(double ovGst) {
        this.ovGst = ovGst;
    }

    public double getOvFreight() {
        return ovFreight;
    }

    public void setOvFreight(double ovFreight) {
        this.ovFreight = ovFreight;
    }

    public double getOvDiscount() {
        return ovDiscount;
    }

    public void setOvDiscount(double ovDiscount) {
        this.ovDiscount = ovDiscount;
    }

    public double getAlloc() {
        return alloc;
    }

    public void setAlloc(double alloc) {
        this.alloc = alloc;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getShipVia() {
        return shipVia;
    }

    public void setShipVia(int shipVia) {
        this.shipVia = shipVia;
    }
}
