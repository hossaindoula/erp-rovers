package com.erp.accounting.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/3/14
 * Time: 3:10 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class TaxGroupItems implements Serializable {
    @Id

    private int tax_group_id;  //pk
    private  int tax_type_id;      //pk
    private  double rate;
    private  int included_in_price;

    public int getTax_group_id() {
        return tax_group_id;
    }

    public void setTax_group_id(int tax_group_id) {
        this.tax_group_id = tax_group_id;
    }

    public int getTax_type_id() {
        return tax_type_id;
    }

    public void setTax_type_id(int tax_type_id) {
        this.tax_type_id = tax_type_id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getIncluded_in_price() {
        return included_in_price;
    }

    public void setIncluded_in_price(int included_in_price) {
        this.included_in_price = included_in_price;
    }
}
