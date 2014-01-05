package com.erp.inventory.purchases.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/2/14
 * Time: 1:45 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class PurchasesRefs implements Serializable {
   @Id

    private  int id;     //Primary key
    private int type;   //key
    private  String reference;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
