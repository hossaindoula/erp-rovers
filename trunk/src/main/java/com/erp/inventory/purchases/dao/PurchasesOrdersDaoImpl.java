package com.erp.inventory.purchases.dao;

import com.erp.inventory.purchases.model.PurchasesOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/6/14
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PurchasesOrdersDaoImpl implements PurchasesOrdersDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean save(PurchasesOrders purchasesOrders) {
        try{
          hibernateTemplate.persist(purchasesOrders);
          return true;
        }catch (Exception Ex){

            Ex.printStackTrace();
        }

        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(PurchasesOrders purchasesOrders) {
        try {
            hibernateTemplate.delete(purchasesOrders);
        return true;

        } catch (Exception ex){
            ex.printStackTrace();
        }

        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PurchasesOrders> findAllPurchasesOrders() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesOrders get(int orderNo) {
        return hibernateTemplate.get(PurchasesOrders.class,orderNo);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesOrders get(PurchasesOrders purchasesOrders) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesOrders get(String comments) {
        return hibernateTemplate.get(PurchasesOrders.class,comments);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
