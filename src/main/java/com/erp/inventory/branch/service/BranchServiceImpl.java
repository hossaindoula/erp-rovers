package com.erp.inventory.branch.service;

import com.erp.inventory.branch.dao.BranchDao;
import com.erp.inventory.branch.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/23/13
 * Time: 12:26 AM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class BranchServiceImpl implements BranchService {
    @Autowired
    private BranchDao branchDao;

    @Override
    public boolean save(Branch branch) {
        return branchDao.save(branch);  //To change body of implemented methods use File | Settings | File Templates.

    }
    @Override
    public boolean delete(Branch branch) {
        return branchDao.delete(branch);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Branch> findAllBranches() {
        return branchDao.findAllBranch();  //To change body of implemented methods use File | Settings | File Templates.

    }

    @Override
    public Branch get(int branchCode) {
        return branchDao.get(branchCode);  //To change body of implemented methods use File | Settings | File Templates.
   //categoryDao.get(id);

    }

    @Override
    public Branch get(String branchName) {
        return branchDao.get(branchName);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
