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
 * Time: 12:19 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class CreditStatus implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String reasonDescription;
    private  short disAllowInvoices;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReasonDescription() {
        return reasonDescription;
    }

    public void setReasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
    }

    public short getDisAllowInvoices() {
        return disAllowInvoices;
    }

    public void setDisAllowInvoices(short disAllowInvoices) {
        this.disAllowInvoices = disAllowInvoices;
    }
}
