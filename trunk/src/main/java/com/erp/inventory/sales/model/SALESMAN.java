package com.erp.inventory.sales.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/2/14
 * Time: 2:20 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class SALESMAN implements Serializable{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  int   salesmanCode;
   private String salesmanName;
   private String salesmanPhone;
   private  String salesmanFax;
   private  String salesmanEmail;

    public int getSalesmanCode() {
        return salesmanCode;
    }

    public void setSalesmanCode(int salesmanCode) {
        this.salesmanCode = salesmanCode;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public String getSalesmanPhone() {
        return salesmanPhone;
    }

    public void setSalesmanPhone(String salesmanPhone) {
        this.salesmanPhone = salesmanPhone;
    }

    public String getSalesmanFax() {
        return salesmanFax;
    }

    public void setSalesmanFax(String salesmanFax) {
        this.salesmanFax = salesmanFax;
    }

    public String getSalesmanEmail() {
        return salesmanEmail;
    }

    public void setSalesmanEmail(String salesmanEmail) {
        this.salesmanEmail = salesmanEmail;
    }
}
