package com.erp.inventory.purchases.dao;

import com.erp.inventory.purchases.model.PurchasesRefs;
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
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PurchasesRefsDaoImpl implements PurchasesRefsDao {

    @Autowired
    public HibernateTemplate hibernateTemplate;
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean save(PurchasesRefs purchasesRefs) {
        try{
        hibernateTemplate.persist(purchasesRefs);  //To change body of implemented methods use File | Settings | File Templates.
         return true;
        }catch (Exception Ex){
        Ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(PurchasesRefs purchasesRefs) {
        try {
            hibernateTemplate.delete(purchasesRefs);
        return  true;
        } catch (Exception Ex){
            Ex.printStackTrace();
        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PurchasesRefs> findAllPurchasesRefs() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesRefs get(int id) {
        return hibernateTemplate.get(PurchasesRefs.class,id);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesRefs get(String reference) {
        return hibernateTemplate.get(PurchasesRefs.class,reference);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
