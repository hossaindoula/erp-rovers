package com.erp.inventory.purchases.dao;

import com.erp.inventory.purchases.model.PurchasesData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/29/13
 * Time: 12:39 AM
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PurchasesDataDaoImpl implements PurchasesDataDao {

    @Autowired
    private HibernateTemplate  hibernateTemplate;
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)

    public boolean save(PurchasesData purchasesData) {
        try {
            hibernateTemplate.persist(purchasesData);
        return true;

        }  catch (Exception ex){
            ex.printStackTrace();

        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean delete(PurchasesData purchasesData) {
        try {
            hibernateTemplate.delete(purchasesData);
            return true;

        }catch (Exception ex){
            ex.printStackTrace();

        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PurchasesData> findAllPurchasesData() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesData get(int id) {
        return hibernateTemplate.get(PurchasesData.class,id);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesData get(PurchasesData purchasesData) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesData get(double price) {
        return hibernateTemplate.get(PurchasesData.class,price);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
