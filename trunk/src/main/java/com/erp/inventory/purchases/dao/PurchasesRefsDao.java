package com.erp.inventory.purchases.dao;

import com.erp.inventory.purchases.model.PurchasesRefs;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/6/14
 * Time: 9:29 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PurchasesRefsDao {
    public  boolean save(PurchasesRefs purchasesRefs);
    public boolean delete(PurchasesRefs purchasesRefs);
    public List<PurchasesRefs> findAllPurchasesRefs();
    public  PurchasesRefs  get(int id);
    public PurchasesRefs get(String reference);


}
