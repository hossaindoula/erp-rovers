package com.erp.util.dao;

import com.erp.util.model.Country;
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
public class CountryDaoImpl implements CountryDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public boolean save(Country country) {
        try{
            hibernateTemplate.persist(country);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Country country) {
        try{
            hibernateTemplate.merge(country);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Country country) {
        try{
            hibernateTemplate.delete(country);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Country> findAllCountries() {
        return hibernateTemplate.find(" from Country ");
    }

    @Override
    public Country get(int id) {
        return hibernateTemplate.get(Country.class,id);
    }

    @Override
    public List<Country> findCountriesByRegion(Region region) {
        Object[] paramArr = new Object[2];
        paramArr[0] = region;
        List<Country> countries = hibernateTemplate.find(" from Region where region.id =? ", paramArr);

        return countries;
    }

    @Override
    public int count() {
        Session hibernateSession = hibernateTemplate.getSessionFactory().getCurrentSession();
        int count;
        try{
            count = Integer.parseInt(hibernateSession.
                    createCriteria(Country.class).
                    setProjection(Projections.rowCount()).
                    uniqueResult().toString());
        }   catch (Exception ex){
            count = 0;
            ex.printStackTrace();
        }

        return count;
    }
}
