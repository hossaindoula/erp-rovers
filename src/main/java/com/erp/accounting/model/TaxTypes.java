package com.erp.accounting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/3/14
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class TaxTypes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id; //pk auto
    private double rate;
    private String salesGlCode;
    private String purchasingGlCode;
    private  String name;
    private int out;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getSalesGlCode() {
        return salesGlCode;
    }

    public void setSalesGlCode(String salesGlCode) {
        this.salesGlCode = salesGlCode;
    }

    public String getPurchasingGlCode() {
        return purchasingGlCode;
    }

    public void setPurchasingGlCode(String purchasingGlCode) {
        this.purchasingGlCode = purchasingGlCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }
}
