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
 * Time: 2:43 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class SuppInvoiceItems implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;       //pk auto
    private int suppTransNo;
    private int supp_trans_type;
    private int glCode;
    private int grnItemId;
    private int poDetailItemId;
    private String stockId;
    private String description;
    private double quantity;
    private double unitPrice;
    private  double unitTax;
    private String memo;

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

    public int getSupp_trans_type() {
        return supp_trans_type;
    }

    public void setSupp_trans_type(int supp_trans_type) {
        this.supp_trans_type = supp_trans_type;
    }

    public int getGlCode() {
        return glCode;
    }

    public void setGlCode(int glCode) {
        this.glCode = glCode;
    }

    public int getGrnItemId() {
        return grnItemId;
    }

    public void setGrnItemId(int grnItemId) {
        this.grnItemId = grnItemId;
    }

    public int getPoDetailItemId() {
        return poDetailItemId;
    }

    public void setPoDetailItemId(int poDetailItemId) {
        this.poDetailItemId = poDetailItemId;
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

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
