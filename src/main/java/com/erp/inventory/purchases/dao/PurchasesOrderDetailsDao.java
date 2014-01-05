package com.erp.inventory.purchases.dao;

import com.erp.inventory.purchases.model.PurchasesOrderDetails;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/4/14
 * Time: 8:24 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PurchasesOrderDetailsDao {
    public  boolean save(PurchasesOrderDetails purchasesOrderDetails );
    public  boolean delete(PurchasesOrderDetails purchasesOrderDetails);
    public List<PurchasesOrderDetails> findAllPurchasesOrderDetails();
    public PurchasesOrderDetails get(int orderNo);
    public PurchasesOrderDetails get(PurchasesOrderDetails purchasesOrderDetails);
    public PurchasesOrderDetails get(String description);



}
