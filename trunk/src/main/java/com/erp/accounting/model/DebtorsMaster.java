package com.erp.accounting.model;


import com.erp.util.model.Address;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/1/14
 * Time: 1:28 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class DebtorsMaster implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int debtorNo;
    private String name;
    @ManyToOne
    private Address address;
    @ManyToOne
    private Email email;
    private  String taxId;
    private  String currCode;
    private int salesType;
    private int dimensionId;
    private int dimension2Id;
    private  int creditStatus;
    private int paymentTerms;
    private  double discount;
    private double pymtDiscount;
    private float creditLimit;

    public int getDebtorNo() {
        return debtorNo;
    }

    public void setDebtorNo(int debtorNo) {
        this.debtorNo = debtorNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public int getSalesType() {
        return salesType;
    }

    public void setSalesType(int salesType) {
        this.salesType = salesType;
    }

    public int getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(int dimensionId) {
        this.dimensionId = dimensionId;
    }

    public int getDimension2Id() {
        return dimension2Id;
    }

    public void setDimension2Id(int dimension2Id) {
        this.dimension2Id = dimension2Id;
    }

    public int getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(int creditStatus) {
        this.creditStatus = creditStatus;
    }

    public int getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(int paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPymtDiscount() {
        return pymtDiscount;
    }

    public void setPymtDiscount(double pymtDiscount) {
        this.pymtDiscount = pymtDiscount;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }
}
