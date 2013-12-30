package com.erp.inventory.purchases.dao;

import com.erp.inventory.purchases.model.PurchasesData;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/29/13
 * Time: 12:24 AM
 * To change this template use File | Settings | File Templates.
 */
public interface PurchasesDataDao {
    public boolean save(PurchasesData purchasesData);
    public  boolean delete(PurchasesData purchasesData);
    public List<PurchasesData> findAllPurchasesData();
    public  PurchasesData get(int id);
    public   PurchasesData get(PurchasesData purchasesData);
    public PurchasesData get(double price);




}
