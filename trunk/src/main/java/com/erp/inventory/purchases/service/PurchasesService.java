package com.erp.inventory.purchases.service;

import com.erp.inventory.purchases.model.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/29/13
 * Time: 1:09 AM
 * To change this template use File | Settings | File Templates.
 */
public interface PurchasesService {

    public  boolean save(PurchasesRefs reference);
    public  boolean delete(PurchasesRefs purchasesRefs);
    public  PurchasesRefs getPurchasesRefs(String reference);
    public PurchasesRefs getPurchasesRefs(int id);
    public  List<PurchasesRefs>findAllPurchasesRefs();

    public boolean save(PurchasesData price);

    public  boolean save(PurchasesOrderDetails orderNo);

    public  boolean save(PurchasesOrders orderNo);
    public  boolean delete(PurchasesOrders purchasesOrders);
    public  List<PurchasesOrders>findAllPurchasesOrders();

    public PurchasesOrders getPurchasesOrders(String comments);

    public PurchasesOrders getPurchasesOrders(int orderNo);

    public boolean save(Supplier supplier);

    public boolean delete(Supplier supplier);

    public List<Supplier> findAllSuppliers();

    public Supplier  getSupplier(int id);

    public Supplier getSupplier(Supplier supplier);

    public  Supplier getSupplier(String firstName);

    public boolean delete(PurchasesData price);

    public  boolean delete(PurchasesOrderDetails description);

    public List<PurchasesData> findAllPurchasesData();

    List<PurchasesData> findAllPurchasesDataList();

    public List<PurchasesOrderDetails> findAllPurchasesOrderDetails();

    public PurchasesData getPurchase(double price);

    public PurchasesData getPurchase(int id);

    public  PurchasesOrderDetails getPurchaseOrderDetails(String description);

    public PurchasesOrderDetails getPurchaseOrderDetails(int orderNo);




}
