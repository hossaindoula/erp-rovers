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
 * Date: 1/2/14
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class SalesOrders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  orderNo; //pk auto
    private int debtorNo;
    private int branchCode;
    private String customerRef;
    private String comments;
    private Date ordDate;
    private int orderType;
    private int shipVia;
    private String deliveryAddress;
    private String contactPhone;
    private String contactEmail;
    private String deliverTo;
    private double freightCost;
    private String fromStkLoc;
    private Date deliveryDate;

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public int getDebtorNo() {
        return debtorNo;
    }

    public void setDebtorNo(int debtorNo) {
        this.debtorNo = debtorNo;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public String getCustomerRef() {
        return customerRef;
    }

    public void setCustomerRef(String customerRef) {
        this.customerRef = customerRef;
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

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public int getShipVia() {
        return shipVia;
    }

    public void setShipVia(int shipVia) {
        this.shipVia = shipVia;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getDeliverTo() {
        return deliverTo;
    }

    public void setDeliverTo(String deliverTo) {
        this.deliverTo = deliverTo;
    }

    public double getFreightCost() {
        return freightCost;
    }

    public void setFreightCost(double freightCost) {
        this.freightCost = freightCost;
    }

    public String getFromStkLoc() {
        return fromStkLoc;
    }

    public void setFromStkLoc(String fromStkLoc) {
        this.fromStkLoc = fromStkLoc;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}









