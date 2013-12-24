package com.erp.inventory.items.dao;

import com.erp.inventory.items.model.Category;
import com.erp.inventory.items.model.Product;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/22/13
 * Time: 12:53 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ProductDao {
    public boolean save(Product product);
    public boolean delete(Product product);


    public List<Product> findAllProducts();
    public List<Product> findAllProductsByCategory(Category category);

    public Product get(int id);

    public Product get(String productName);

}
