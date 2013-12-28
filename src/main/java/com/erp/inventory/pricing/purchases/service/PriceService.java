package com.erp.inventory.pricing.purchases.service;

import com.erp.inventory.pricing.purchases.model.Prices;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/26/13
 * Time: 11:57 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PriceService {
    boolean save(Prices price);

    List<Prices> findAllCategories();

    List<Prices> findAllProducts();

    Prices get(int id);

    boolean delete(Prices price);

    List<Prices> findAllPriceses();

    Prices get(double price);
}
