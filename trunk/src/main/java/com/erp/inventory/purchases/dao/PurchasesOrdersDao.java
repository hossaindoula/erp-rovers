package com.erp.inventory.purchases.dao;

import com.erp.inventory.purchases.model.PurchasesOrders;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/6/14
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PurchasesOrdersDao {
    public boolean save(PurchasesOrders purchasesOrders);
    public  boolean delete(PurchasesOrders purchasesOrders);
    public List<PurchasesOrders> findAllPurchasesOrders();
    public PurchasesOrders get(int orderNo);
    public  PurchasesOrders get(PurchasesOrders purchasesOrders);
    public PurchasesOrders get(String comments);



}
