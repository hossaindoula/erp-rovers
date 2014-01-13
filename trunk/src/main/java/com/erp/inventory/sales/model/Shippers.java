package com.erp.inventory.sales.model;

import com.erp.util.model.Address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/2/14
 * Time: 2:26 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Shippers implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  shipperId;    //pk auto
    private String shipperName;
    private String phone;
    private String contact;
    private Address address;

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
