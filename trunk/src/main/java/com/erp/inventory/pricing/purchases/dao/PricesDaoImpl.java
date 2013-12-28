package com.erp.inventory.pricing.purchases.dao;

import com.erp.inventory.pricing.purchases.model.Prices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/26/13
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository

public class PricesDaoImpl implements PricesDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public boolean save(Prices prices) {
        try {
            hibernateTemplate.persist(prices);
            return true;

        }   catch (Exception ex){
            ex.printStackTrace();
        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }


    @Override
    public boolean delete(Prices prices) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }


    @Override
    public List<Prices> findAllPriceses() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


    @Override
    public Prices get(int id) {
        return hibernateTemplate.get(Prices.class,id);
        //To change body of implemented methods use File | Settings | File Templates.
    }


    @Override
    public Prices get(double price) {
        return hibernateTemplate.get(Prices.class,price);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
