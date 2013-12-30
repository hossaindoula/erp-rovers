package com.erp.inventory.purchases.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/29/13
 * Time: 12:08 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class PurchasesOrderDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int poDetailItem;
    private int orderNo;
    private String itemCode;
    @Lob
    private String description;
    private Date deliveryDate;
    private  double qtyInvoiced;
    private double unitPrice;
    private double actPrice;
    private  double stdCostUnit;
    private  double quantityOrdered;
    private double quantityReceived;

    public int getPoDetailItem() {
        return poDetailItem;
    }

    public void setPoDetailItem(int poDetailItem) {
        this.poDetailItem = poDetailItem;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public double getQtyInvoiced() {
        return qtyInvoiced;
    }

    public void setQtyInvoiced(double qtyInvoiced) {
        this.qtyInvoiced = qtyInvoiced;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getActPrice() {
        return actPrice;
    }

    public void setActPrice(double actPrice) {
        this.actPrice = actPrice;
    }

    public double getStdCostUnit() {
        return stdCostUnit;
    }

    public void setStdCostUnit(double stdCostUnit) {
        this.stdCostUnit = stdCostUnit;
    }

    public double getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(double quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public double getQuantityReceived() {
        return quantityReceived;
    }

    public void setQuantityReceived(double quantityReceived) {
        this.quantityReceived = quantityReceived;
    }
}
