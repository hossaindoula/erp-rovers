package com.erp.inventory.items.dao;

import com.erp.inventory.items.model.Category;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/22/13
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public interface CategoryDao {

    public boolean save(Category category);

    public boolean delete(Category category);

    public List<Category> findAllCategories();

    public Category get(int id);

    public Category get(Category category);

    public Category get(String categoryName);

}
