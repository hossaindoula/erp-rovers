package com.erp.util.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 1:06 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String addressLineFirst;
    private String addressLineSecond;
    private String zipCode;

    @ManyToOne
    private City city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressLineFirst() {
        return addressLineFirst;
    }

    public void setAddressLineFirst(String addressLineFirst) {
        this.addressLineFirst = addressLineFirst;
    }

    public String getAddressLineSecond() {
        return addressLineSecond;
    }

    public void setAddressLineSecond(String addressLineSecond) {
        this.addressLineSecond = addressLineSecond;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
