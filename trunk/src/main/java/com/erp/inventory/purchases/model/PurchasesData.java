package com.erp.inventory.purchases.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/28/13
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class PurchasesData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int supplierId;
    private int stockId ;
    private  double price;
    private String suppliersUom;
    private  double conversionFactor;
    @Lob
    private String supplierDescription;

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSuppliersUom() {
        return suppliersUom;
    }

    public void setSuppliersUom(String suppliersUom) {
        this.suppliersUom = suppliersUom;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public String getSupplierDescription() {
        return supplierDescription;
    }

    public void setSupplierDescription(String supplierDescription) {
        this.supplierDescription = supplierDescription;
    }


}
