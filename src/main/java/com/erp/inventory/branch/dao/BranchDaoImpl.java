package com.erp.inventory.branch.dao;

import com.erp.inventory.branch.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

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
public class BranchDaoImpl implements BranchDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
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
        List<Branch> branches = new ArrayList<Branch>();
        branches = hibernateTemplate.find(" from Branch");

        return  branches;
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
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
