package com.erp.inventory.branch.dao;

import com.erp.inventory.branch.model.Branch;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Projections;
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
 * Time: 11:02 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BranchDaoImpl implements BranchDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean save(Branch branch) {
        try{
            hibernateTemplate.persist(branch);
            return true;
        }catch (Exception ex){
             ex.printStackTrace();
        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean update(Branch branch) {
        try{
            hibernateTemplate.merge(branch);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean delete(Branch branch) {
        try{
            hibernateTemplate.delete(branch);
            return  true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Branch> findAllBranch() {
        return (List<Branch>)hibernateTemplate.find(" from Branch");
    }

    @Override
    public Branch get(int id) {
        return hibernateTemplate.get(Branch.class,id);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Branch get(Branch branch) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Branch get(String branchName) {
        Object[] paramArr = new Object[1];
        Branch branch = null;
        paramArr[0] = branchName;

        try{
            branch = (Branch) hibernateTemplate.find("from Branch where branchName=?", paramArr).get(0);
        } catch (IndexOutOfBoundsException ex) {
            branch = null;
        }

        return branch;
    }

    @Override
    public int count(){
        Session hibernateSession = hibernateTemplate.getSessionFactory().getCurrentSession();
        int count;
        try{
            count = Integer.parseInt(hibernateSession.
                    createCriteria(Branch.class).
                    setProjection(Projections.rowCount()).
                    uniqueResult().toString());
        }   catch (Exception ex){
            count = 0;
        }

        return count;
    }
}
