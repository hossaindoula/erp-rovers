package com.erp.inventory.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/2/14
 * Time: 2:31 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class StockCategory implements Serializable{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int categoryId;  //pk auto
    private  String description;
    private String stockAct;
    private  String cogsAct;
    private String adjGlAct;
    private  String purchPriceVarAct;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStockAct() {
        return stockAct;
    }

    public void setStockAct(String stockAct) {
        this.stockAct = stockAct;
    }

    public String getCogsAct() {
        return cogsAct;
    }

    public void setCogsAct(String cogsAct) {
        this.cogsAct = cogsAct;
    }

    public String getAdjGlAct() {
        return adjGlAct;
    }

    public void setAdjGlAct(String adjGlAct) {
        this.adjGlAct = adjGlAct;
    }

    public String getPurchPriceVarAct() {
        return purchPriceVarAct;
    }

    public void setPurchPriceVarAct(String purchPriceVarAct) {
        this.purchPriceVarAct = purchPriceVarAct;
    }
}
