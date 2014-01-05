package com.erp.accounting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/1/14
 * Time: 12:36 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class CustAllocations implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private double amt;
    private Date dateAlloc;
    private  int transNoFrom;
    private int  transNoTo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public Date getDateAlloc() {
        return dateAlloc;
    }

    public void setDateAlloc(Date dateAlloc) {
        this.dateAlloc = dateAlloc;
    }

    public int getTransNoFrom() {
        return transNoFrom;
    }

    public void setTransNoFrom(int transNoFrom) {
        this.transNoFrom = transNoFrom;
    }

    public int getTransNoTo() {
        return transNoTo;
    }

    public void setTransNoTo(int transNoTo) {
        this.transNoTo = transNoTo;
    }
}
