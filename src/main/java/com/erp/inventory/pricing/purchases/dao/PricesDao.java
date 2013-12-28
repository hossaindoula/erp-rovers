package com.erp.inventory.pricing.purchases.dao;

import com.erp.inventory.pricing.purchases.model.Prices;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/26/13
 * Time: 9:54 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PricesDao {

       public boolean save(Prices prices);
       public boolean  delete(Prices prices);
       public List<Prices>findAllPriceses();
       public Prices get(int id);
       public Prices get(double price );

    }
