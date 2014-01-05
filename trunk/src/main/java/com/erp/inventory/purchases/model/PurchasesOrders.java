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
 * Date: 1/2/14
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class PurchasesOrders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int orderNo;  //Primarky Key auto
    private int supplierId;
    private  String comments;
    private Date ordDate;    ;
    private String reference;
    private String requisitionNo;
    private String intoStockLocation;
    private  String deliveryAddress;

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(Date ordDate) {
        this.ordDate = ordDate;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getRequisitionNo() {
        return requisitionNo;
    }

    public void setRequisitionNo(String requisitionNo) {
        this.requisitionNo = requisitionNo;
    }

    public String getIntoStockLocation() {
        return intoStockLocation;
    }

    public void setIntoStockLocation(String intoStockLocation) {
        this.intoStockLocation = intoStockLocation;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
