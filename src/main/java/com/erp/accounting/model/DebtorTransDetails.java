package com.erp.accounting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/1/14
 * Time: 1:12 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class DebtorTransDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int debtorTransNo;
    private int debtorTransType;
    private String  stockId;
    private String description;
    private double  unitPrice;
    private double unitTax;
    private double quantity;
    private double  discountPercent;
    private double standardCost;

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

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitTax() {
        return unitTax;
    }

    public void setUnitTax(double unitTax) {
        this.unitTax = unitTax;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(double standardCost) {
        this.standardCost = standardCost;
    }
}
