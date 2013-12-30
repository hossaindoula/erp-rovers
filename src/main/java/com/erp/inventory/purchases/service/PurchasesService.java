package com.erp.inventory.purchases.service;

import com.erp.inventory.purchases.model.PurchasesData;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/29/13
 * Time: 1:09 AM
 * To change this template use File | Settings | File Templates.
 */
public interface PurchasesService {

    boolean save(PurchasesData price);

    List<PurchasesData> findAllPurchasesDataList();

    //List<PurchasesData> findAllProducts();

    PurchasesData get(int id);

    boolean delete(PurchasesData price);

    //List<PurchasesData> findAllPurchasesDataList();

    PurchasesData get(double price);

}
