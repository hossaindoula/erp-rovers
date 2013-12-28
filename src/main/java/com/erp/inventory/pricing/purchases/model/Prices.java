package com.erp.inventory.pricing.purchases.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/26/13
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Prices implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int stockId;
    private String salesTypeId;
    private String currAbbrev;
    private double price;

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getSalesTypeId() {
        return salesTypeId;
    }

    public void setSalesTypeId(String salesTypeId) {
        this.salesTypeId = salesTypeId;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrAbbrev() {
        return currAbbrev;
    }

    public void setCurrAbbrev(String currAbbrev) {
        this.currAbbrev = currAbbrev;
    }
}
