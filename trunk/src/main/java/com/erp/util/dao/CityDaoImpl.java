package com.erp.util.dao;

import com.erp.util.model.City;
import com.erp.util.model.Country;
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
 * Time: 2:53 PM
 * To change this template use File | Settings | File Templates.
 */

@Repository
public class CityDaoImpl implements CityDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public boolean save(City city) {
        try{
            hibernateTemplate.persist(city);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(City city) {
        try{
            hibernateTemplate.merge(city);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(City city) {
        try{
            hibernateTemplate.delete(city);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<City> findAllCities() {
        return hibernateTemplate.find(" from City ");
    }

    @Override
    public City get(int id) {
        return hibernateTemplate.get(City.class, id);
    }

    @Override
    public List<City> findAddressByCountry(Country country) {
        Object[] paramArr = new Object[2];
        paramArr[0] = country;
        List< City > cities = hibernateTemplate.find(" from City where country.id =? ", paramArr);
        return cities;
    }

    @Override
    public int count() {
        Session hibernateSession = hibernateTemplate.getSessionFactory().getCurrentSession();
        int count;
        try{
            count = Integer.parseInt(hibernateSession.
                    createCriteria(City.class).
                    setProjection(Projections.rowCount()).
                    uniqueResult().toString());
        }   catch (Exception ex){
            count = 0;
            ex.printStackTrace();
        }

        return count;
    }
}
