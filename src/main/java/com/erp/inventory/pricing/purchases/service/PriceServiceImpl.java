package com.erp.inventory.pricing.purchases.service;

import com.erp.inventory.items.model.Product;
import com.erp.inventory.pricing.purchases.dao.PricesDao;
import com.erp.inventory.pricing.purchases.model.Prices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/26/13
 * Time: 11:58 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PricesDao pricesDao;

    @Override
    public boolean save(Prices price) {
        return pricesDao.save(price);
    }

    @Override
    public List<Prices> findAllCategories() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Prices> findAllProducts() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Prices price) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Prices> findAllPriceses() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Prices get(int id) {
        return pricesDao.get(id);
    }


    @Override
    public Prices get(double price) {
        return pricesDao.get(price);
    }

}
