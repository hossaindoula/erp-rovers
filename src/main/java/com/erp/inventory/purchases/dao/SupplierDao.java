package com.erp.inventory.purchases.dao;

import com.erp.inventory.purchases.model.Supplier;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/4/14
 * Time: 2:09 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SupplierDao {

    public boolean save(Supplier supplier);

    public boolean delete(Supplier supplier);

    public List<Supplier> findAllSuppliers();

    public Supplier  get(int id);

    public Supplier get(Supplier supplier);

    public  Supplier get(String firstName);
    //public Supplier get(String contactAddress);
}
