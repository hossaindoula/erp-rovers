package com.erp.inventory.items.service;

import com.erp.inventory.items.dao.CategoryDao;
import com.erp.inventory.items.dao.ProductDao;
import com.erp.inventory.items.model.Category;
import com.erp.inventory.items.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/22/13
 * Time: 12:00 PM
 * To change this template use File | Settings | File Templates.
 */

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ItemServiceImpl implements ItemService {

    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private ProductDao productDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean save(Category category) {
        return categoryDao.save(category);
}

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean save(Product product) {
        return productDao.save(product);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean delete(Category category) {
        return categoryDao.delete(category);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean delete(Product product) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Category> findAllCategories() {
        return categoryDao.findAllCategories();
    }

    @Override
    public List<Product> findAllProducts() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Category get(int id) {
        return categoryDao.get(id);
    }

    @Override
    public Category get(Category category) {
        return categoryDao.get(category);
    }

    @Override
    public Category get(String categoryName) {
        return categoryDao.get(categoryName);
    }
}
