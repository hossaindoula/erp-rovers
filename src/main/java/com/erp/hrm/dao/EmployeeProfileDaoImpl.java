package com.erp.hrm.dao;

import com.erp.hrm.model.EmployeeProfile;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/31/13
 * Time: 3:11 PM
 * To change this template use File | Settings | File Templates.
 */

@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeProfileDaoImpl implements EmployeeProfileDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;


    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean save(EmployeeProfile employeeProfile) {
        try{
            hibernateTemplate.persist(employeeProfile);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean update(EmployeeProfile employeeProfile) {
        try{
            hibernateTemplate.merge(employeeProfile);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean delete(EmployeeProfile employeeProfile) {
        try{
            hibernateTemplate.delete(employeeProfile);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<EmployeeProfile> findAllEmployeeProfiles() {
        return hibernateTemplate.find(" from EmployeeProfile ");
    }

    @Override
    public EmployeeProfile get(int id) {
        return hibernateTemplate.get(EmployeeProfile.class, id);
    }

    @Override
    public EmployeeProfile get(EmployeeProfile employeeProfile) {
        return null;
    }

    @Override
    public int count() {
        Session hibernateSession = hibernateTemplate.getSessionFactory().getCurrentSession();
        int count;
        try{
            count = Integer.parseInt(hibernateSession.
                    createCriteria(EmployeeProfile.class).
                    setProjection(Projections.rowCount()).
                    uniqueResult().toString());
        }   catch (Exception ex){
            count = 0;
            ex.printStackTrace();
        }

        return count;
    }
}
