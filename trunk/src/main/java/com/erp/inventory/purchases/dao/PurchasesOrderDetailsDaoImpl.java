package com.erp.inventory.purchases.dao;

import com.erp.inventory.purchases.model.PurchasesOrderDetails;
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
 * Time: 8:24 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PurchasesOrderDetailsDaoImpl implements PurchasesOrderDetailsDao {

    @Autowired
    public HibernateTemplate hibernateTemplate;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean save(PurchasesOrderDetails purchasesOrderDetails) {
        try {
        hibernateTemplate.persist(purchasesOrderDetails);
          return true;
        } catch (Exception Ex){
            Ex.printStackTrace();
        }

        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(PurchasesOrderDetails purchasesOrderDetails) {
        try {
            hibernateTemplate.delete(purchasesOrderDetails);
            return true;
           }catch (Exception Ex){
            Ex.printStackTrace();

        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PurchasesOrderDetails> findAllPurchasesOrderDetails() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesOrderDetails get(int orderNo) {
        return hibernateTemplate.get(PurchasesOrderDetails.class,orderNo);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesOrderDetails get(PurchasesOrderDetails purchasesOrderDetails) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesOrderDetails get(String description) {
        return hibernateTemplate.get(PurchasesOrderDetails.class,description);  //To change body of implemented methods use File | Settings | File Templates.
    }
}

