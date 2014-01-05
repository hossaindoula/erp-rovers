package com.erp.inventory.stock.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/3/14
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class StockMaster implements Serializable {
    @Id

    private  int id;
    private String   stockId;     //pk
    private  int     categoryId;
    private  int taxTypeId;
    private  String description;
    private  String longDescription;
    private  String units;
    private  String mbFlag;
    private  String salesAccount;
    private  String cogsAccount;
    private  String inventoryAccount;
    private  String adjustmentAccount;
    private  String assemblyAccount;
    private  int  dimensionId;
    private  int  dimension2Id;
    private double actualCost;
    private double lastCost;
    private  double materialCost;
    private  double labourCost;
    private  double overheadCost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getTaxTypeId() {
        return taxTypeId;
    }

    public void setTaxTypeId(int taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getMbFlag() {
        return mbFlag;
    }

    public void setMbFlag(String mbFlag) {
        this.mbFlag = mbFlag;
    }

    public String getSalesAccount() {
        return salesAccount;
    }

    public void setSalesAccount(String salesAccount) {
        this.salesAccount = salesAccount;
    }

    public String getCogsAccount() {
        return cogsAccount;
    }

    public void setCogsAccount(String cogsAccount) {
        this.cogsAccount = cogsAccount;
    }

    public String getInventoryAccount() {
        return inventoryAccount;
    }

    public void setInventoryAccount(String inventoryAccount) {
        this.inventoryAccount = inventoryAccount;
    }

    public String getAdjustmentAccount() {
        return adjustmentAccount;
    }

    public void setAdjustmentAccount(String adjustmentAccount) {
        this.adjustmentAccount = adjustmentAccount;
    }

    public String getAssemblyAccount() {
        return assemblyAccount;
    }

    public void setAssemblyAccount(String assemblyAccount) {
        this.assemblyAccount = assemblyAccount;
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

    public double getActualCost() {
        return actualCost;
    }

    public void setActualCost(double actualCost) {
        this.actualCost = actualCost;
    }

    public double getLastCost() {
        return lastCost;
    }

    public void setLastCost(double lastCost) {
        this.lastCost = lastCost;
    }

    public double getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }

    public double getLabourCost() {
        return labourCost;
    }

    public void setLabourCost(double labourCost) {
        this.labourCost = labourCost;
    }

    public double getOverheadCost() {
        return overheadCost;
    }

    public void setOverheadCost(double overheadCost) {
        this.overheadCost = overheadCost;
    }
}
