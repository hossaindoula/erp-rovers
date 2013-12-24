package com.erp.inventory.items.service;

import com.erp.inventory.items.model.Category;
import com.erp.inventory.items.model.Product;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/22/13
 * Time: 11:57 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ItemService {

    public boolean save(Category category);
    public boolean save(Product product);

    public boolean delete(Category category);
    public boolean delete(Product product);

    public List<Category> findAllCategories();
    public List<Product> findAllProducts();

    public Category get(int id);

    public Category get(Category category);

    public Category get(String categoryName);



}
