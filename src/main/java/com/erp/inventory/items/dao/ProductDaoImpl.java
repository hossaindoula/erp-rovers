package com.erp.inventory.items.dao;

import com.erp.inventory.items.model.Category;
import com.erp.inventory.items.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/22/13
 * Time: 12:59 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean save(Product product) {
        try {
            hibernateTemplate.persist(product);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }


        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean delete(Product product) {
        try {
            hibernateTemplate.delete(product);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }



        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Product> findAllProducts() {
        List<Product> products= new ArrayList<Product>();
        products=hibernateTemplate.find(" from Product");
        return products;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Product> findAllProductsByCategory(Category category) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Product get(int id) {

        return hibernateTemplate.get(Product.class,id);
          //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Product get(String productName) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
