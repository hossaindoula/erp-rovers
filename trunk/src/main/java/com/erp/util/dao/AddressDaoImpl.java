package com.erp.util.dao;

import com.erp.util.model.Address;
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
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */

@Repository
public class AddressDaoImpl implements AddressDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public boolean save(Address address) {
        try{
            hibernateTemplate.persist(address);
            return true;
        } catch (Exception ex){
            return false;
        }
    }

    @Override
    public boolean update(Address address) {
        try{
            hibernateTemplate.merge(address);
            return true;
        } catch (Exception ex){
            return false;
        }
    }

    @Override
    public boolean delete(Address address) {
        try{
            hibernateTemplate.delete(address);
            return true;
        } catch (Exception ex){
            return false;
        }
    }

    @Override
    public List<Address> findAllAddresses() {
        return hibernateTemplate.find(" from Address ");
    }

    @Override
    public Address get(int id) {
        return hibernateTemplate.get(Address.class, id);
    }

    @Override
    public List<Address> findAddressesByAddressLineFirstAndAddressLineSecond(String firstAddress, String secondAddress) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int count() {
        Session hibernateSession = hibernateTemplate.getSessionFactory().getCurrentSession();
        int count;
        try{
            count = Integer.parseInt(hibernateSession.
                    createCriteria(Address.class).
                    setProjection(Projections.rowCount()).
                    uniqueResult().toString());
        }   catch (Exception ex){
            count = 0;
            ex.printStackTrace();
        }

        return count;
    }
}
