package com.erp.inventory.purchases.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/3/14
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class SuppInvoiceTaxItems implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int id;  //pk auto
    private  int suppTransNo;
    private  int suppTransType;
    private int taxTypeId;
    private int taxTypeName;
    private double rate;
    private int includedInPrice;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSuppTransNo() {
        return suppTransNo;
    }

    public void setSuppTransNo(int suppTransNo) {
        this.suppTransNo = suppTransNo;
    }

    public int getSuppTransType() {
        return suppTransType;
    }

    public void setSuppTransType(int suppTransType) {
        this.suppTransType = suppTransType;
    }

    public int getTaxTypeId() {
        return taxTypeId;
    }

    public void setTaxTypeId(int taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    public int getTaxTypeName() {
        return taxTypeName;
    }

    public void setTaxTypeName(int taxTypeName) {
        this.taxTypeName = taxTypeName;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getIncludedInPrice() {
        return includedInPrice;
    }

    public void setIncludedInPrice(int includedInPrice) {
        this.includedInPrice = includedInPrice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}





