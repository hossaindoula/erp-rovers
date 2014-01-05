package com.erp.accounting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/31/13
 * Time: 9:13 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class BankTrans implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private short type;
    private int transNo;
    private String bankAct;
    private  String ref;
    private Date transDate;
    private int bankTransType;
    private double amount;
    private int dimensionId;
    private int dimension2Id;
    private int personTypeId;
    private short personId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public int getTransNo() {
        return transNo;
    }

    public void setTransNo(int transNo) {
        this.transNo = transNo;
    }

    public String getBankAct() {
        return bankAct;
    }

    public void setBankAct(String bankAct) {
        this.bankAct = bankAct;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public int getBankTransType() {
        return bankTransType;
    }

    public void setBankTransType(int bankTransType) {
        this.bankTransType = bankTransType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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

    public int getPersonTypeId() {
        return personTypeId;
    }

    public void setPersonTypeId(int personTypeId) {
        this.personTypeId = personTypeId;
    }

    public short getPersonId() {
        return personId;
    }

    public void setPersonId(short personId) {
        this.personId = personId;
    }
}
