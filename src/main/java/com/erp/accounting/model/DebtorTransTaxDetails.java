package com.erp.accounting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/1/14
 * Time: 1:20 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class DebtorTransTaxDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int debtorTransNo;
    private int debtorTransType;
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

    public int getDebtorTransNo() {
        return debtorTransNo;
    }

    public void setDebtorTransNo(int debtorTransNo) {
        this.debtorTransNo = debtorTransNo;
    }

    public int getDebtorTransType() {
        return debtorTransType;
    }

    public void setDebtorTransType(int debtorTransType) {
        this.debtorTransType = debtorTransType;
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
