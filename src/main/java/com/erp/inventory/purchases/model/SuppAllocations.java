package com.erp.inventory.purchases.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/3/14
 * Time: 2:36 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class SuppAllocations implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)


    private int id;//pk auto
    private double amt;
    private Date dateAlloc;
    private int transNoTo;
    private  int transTypeFrom ;
    private int transNoFrom;
    private int transTypeTo;

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

    public int getTransNoTo() {
        return transNoTo;
    }

    public void setTransNoTo(int transNoTo) {
        this.transNoTo = transNoTo;
    }

    public int getTransTypeFrom() {
        return transTypeFrom;
    }

    public void setTransTypeFrom(int transTypeFrom) {
        this.transTypeFrom = transTypeFrom;
    }

    public int getTransNoFrom() {
        return transNoFrom;
    }

    public void setTransNoFrom(int transNoFrom) {
        this.transNoFrom = transNoFrom;
    }

    public int getTransTypeTo() {
        return transTypeTo;
    }

    public void setTransTypeTo(int transTypeTo) {
        this.transTypeTo = transTypeTo;
    }
}
