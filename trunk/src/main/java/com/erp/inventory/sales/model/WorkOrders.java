package com.erp.inventory.sales.model;

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
 * Time: 3:53 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class WorkOrders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String woRef;
    private String locCode;
    private double unitsReqd;
    private String stockId;
    private Date date;
    private int type;
    private Date requiredBy;
    private Date releasedDate;
    private double unitsIssued;
    private int closed;
    private int released;
    private double additionalCosts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWoRef() {
        return woRef;
    }

    public void setWoRef(String woRef) {
        this.woRef = woRef;
    }

    public String getLocCode() {
        return locCode;
    }

    public void setLocCode(String locCode) {
        this.locCode = locCode;
    }

    public double getUnitsReqd() {
        return unitsReqd;
    }

    public void setUnitsReqd(double unitsReqd) {
        this.unitsReqd = unitsReqd;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getRequiredBy() {
        return requiredBy;
    }

    public void setRequiredBy(Date requiredBy) {
        this.requiredBy = requiredBy;
    }

    public Date getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(Date releasedDate) {
        this.releasedDate = releasedDate;
    }

    public double getUnitsIssued() {
        return unitsIssued;
    }

    public void setUnitsIssued(double unitsIssued) {
        this.unitsIssued = unitsIssued;
    }

    public int getClosed() {
        return closed;
    }

    public void setClosed(int closed) {
        this.closed = closed;
    }

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }

    public double getAdditionalCosts() {
        return additionalCosts;
    }

    public void setAdditionalCosts(double additionalCosts) {
        this.additionalCosts = additionalCosts;
    }
}
