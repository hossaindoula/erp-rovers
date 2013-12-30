package com.erp.hrm.dao;

import com.erp.hrm.model.Degree;
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
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */

@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DegreeDaoImpl implements DegreeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean save(Degree degree) {
        try{
            hibernateTemplate.persist(degree);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean update(Degree degree) {
        try{
            hibernateTemplate.merge(degree);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean delete(Degree degree) {
        try{
            hibernateTemplate.delete(degree);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Degree> findAllDegrees() {
        return hibernateTemplate.find(" from Degree ");
    }

    @Override
    public Degree get(int id) {
        return hibernateTemplate.get(Degree.class, id);
    }

    @Override
    public Degree get(Degree degree) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int count() {
        Session hibernateSession = hibernateTemplate.getSessionFactory().getCurrentSession();
        int count;
        try{
            count = Integer.parseInt(hibernateSession.
                    createCriteria(Degree.class).
                    setProjection(Projections.rowCount()).
                    uniqueResult().toString());
        }   catch (Exception ex){
            count = 0;
            ex.printStackTrace();
        }

        return count;
    }
}
