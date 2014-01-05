package com.erp.util.dao;

import com.erp.util.model.Region;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 2:54 PM
 * To change this template use File | Settings | File Templates.
 */

@Repository
public class RegionDaoImpl implements RegionDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public boolean save(Region region) {
        try{
            hibernateTemplate.persist(region);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Region region) {
        try{
            hibernateTemplate.merge(region);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Region region) {
        try{
            hibernateTemplate.delete(region);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Region> findAllRegions() {
        return hibernateTemplate.find(" from Region ");
    }

    @Override
    public Region get(int id) {
        return hibernateTemplate.get(Region.class, id);
    }

    @Override
    public int count() {
        Session hibernateSession = hibernateTemplate.getSessionFactory().getCurrentSession();
        int count;
        try{
            count = Integer.parseInt(hibernateSession.
                    createCriteria(Region.class).
                    setProjection(Projections.rowCount()).
                    uniqueResult().toString());
        }   catch (Exception ex){
            count = 0;
            ex.printStackTrace();
        }

        return count;
    }
}
