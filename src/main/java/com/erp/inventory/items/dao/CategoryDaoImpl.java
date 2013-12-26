package com.erp.inventory.items.dao;

import com.erp.inventory.items.model.Category;
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
 * Time: 11:48 AM
 * To change this template use File | Settings | File Templates.
 */

@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean save(Category category) {
        try{
            hibernateTemplate.persist(category);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean delete(Category category) {
        try{
            hibernateTemplate.delete(category);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Category> findAllCategories() {
        List<Category> categories = new ArrayList<Category>();
        categories = hibernateTemplate.find(" from Category ");
        return categories;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Category get(int id) {
        return hibernateTemplate.get(Category.class, id);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Category get(Category category) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Category get(String categoryName) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
