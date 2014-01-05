package com.erp.inventory.sales.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/3/14
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class WorkOrderRequirements implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int workOrderId;
    private int stockId;
    private String workCentre;
    private double unitsReq;
    private  double stdCost;
    private double locCode;
    private  double unitsIssued;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(int workOrderId) {
        this.workOrderId = workOrderId;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getWorkCentre() {
        return workCentre;
    }

    public void setWorkCentre(String workCentre) {
        this.workCentre = workCentre;
    }

    public double getUnitsReq() {
        return unitsReq;
    }

    public void setUnitsReq(double unitsReq) {
        this.unitsReq = unitsReq;
    }

    public double getStdCost() {
        return stdCost;
    }

    public void setStdCost(double stdCost) {
        this.stdCost = stdCost;
    }

    public double getLocCode() {
        return locCode;
    }

    public void setLocCode(double locCode) {
        this.locCode = locCode;
    }

    public double getUnitsIssued() {
        return unitsIssued;
    }

    public void setUnitsIssued(double unitsIssued) {
        this.unitsIssued = unitsIssued;
    }
}
