package com.erp.inventory.purchases.dao;

import com.erp.inventory.purchases.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/4/14
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SupplierDaoImpl implements  SupplierDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)

    public boolean save(Supplier supplier) {
        try {
            hibernateTemplate.persist(supplier);
           return true;
        } catch (Exception ex)
        {
          ex.printStackTrace();

        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Supplier supplier) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Supplier> findAllSuppliers() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Supplier get(int id) {
        return hibernateTemplate.get(Supplier.class,id);  //To change body of implemented methods use File | Settings | File Templates.

        }

    @Override
    public Supplier get(Supplier supplier) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Supplier get(String firstName) {
        return hibernateTemplate.get(Supplier.class,firstName);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
