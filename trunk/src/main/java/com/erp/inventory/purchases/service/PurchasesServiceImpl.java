package com.erp.inventory.purchases.service;

import com.erp.inventory.purchases.dao.*;
import com.erp.inventory.purchases.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/29/13
 * Time: 1:15 AM
 * To change this template use File | Settings | File Templates.
 */

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PurchasesServiceImpl implements PurchasesService {

    @Autowired
    private PurchasesDataDao purchasesDataDao;

    @Autowired
    private PurchasesOrderDetailsDao purchasesOrderDetailsDao;

    @Autowired
    private SupplierDao supplierDao;

    @Autowired
    private PurchasesOrdersDao purchasesOrdersDao;

    @Autowired
    private PurchasesRefsDao purchasesRefsDao;

    @Override
    public boolean save(PurchasesData price) {
        return purchasesDataDao.save(price);
    }

    @Override
    public boolean save(PurchasesOrderDetails orderNo) {
        return purchasesOrderDetailsDao.save(orderNo);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean save(Supplier supplier) {
        return supplierDao.save(supplier);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Supplier supplier) {
        return supplierDao.delete(supplier);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Supplier> findAllSuppliers() {
        return supplierDao.findAllSuppliers();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Supplier getSupplier(int id) {
        return supplierDao.get(id);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Supplier getSupplier(Supplier supplier) {
        return supplierDao.get(supplier);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Supplier getSupplier(String firstName) {
        return supplierDao.get(firstName);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(PurchasesData price) {
        return purchasesDataDao.delete(price);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(PurchasesOrderDetails description) {
        return purchasesOrderDetailsDao.delete(description);  //To change body of implemented methods use File | Settings | File Templates.
    }


    @Override
    public List<PurchasesData> findAllPurchasesData() {
        return purchasesDataDao.findAllPurchasesData();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PurchasesData> findAllPurchasesDataList() {
        return purchasesDataDao.findAllPurchasesData();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PurchasesOrderDetails> findAllPurchasesOrderDetails() {
        return purchasesOrderDetailsDao.findAllPurchasesOrderDetails();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesData getPurchase(double price) {
        return purchasesDataDao.get(price);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesData getPurchase(int id) {
        return purchasesDataDao.get(id);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesOrderDetails getPurchaseOrderDetails(String description) {
        return purchasesOrderDetailsDao.get(description);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean save(PurchasesOrders orderNo) {
        return purchasesOrdersDao.save(orderNo);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(PurchasesOrders purchasesOrders) {
        return purchasesOrdersDao.delete(purchasesOrders);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PurchasesOrders> findAllPurchasesOrders() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesOrders getPurchasesOrders(String comments) {
        return purchasesOrdersDao.get(comments);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesOrders getPurchasesOrders(int orderNo) {
        return purchasesOrdersDao.get(orderNo);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesOrderDetails getPurchaseOrderDetails(int orderNo) {
        return purchasesOrderDetailsDao.get(orderNo);  //To change body of implemented methods use File | Settings | File Templates.

    }

    @Override
    public boolean save(PurchasesRefs reference) {
        return purchasesRefsDao.save(reference);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(PurchasesRefs purchasesRefs) {
        return purchasesRefsDao.delete(purchasesRefs);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesRefs getPurchasesRefs(String reference) {
        return purchasesRefsDao.get(reference);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesRefs getPurchasesRefs(int id) {
        return purchasesRefsDao.get(id);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PurchasesRefs> findAllPurchasesRefs() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
