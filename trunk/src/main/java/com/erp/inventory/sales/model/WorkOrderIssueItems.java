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
 * Time: 3:29 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class WorkOrderIssueItems implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;      //pk auto
    private int stockId;
    private int issueId;
    private double qtyIssued;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public double getQtyIssued() {
        return qtyIssued;
    }

    public void setQtyIssued(double qtyIssued) {
        this.qtyIssued = qtyIssued;
    }
}
