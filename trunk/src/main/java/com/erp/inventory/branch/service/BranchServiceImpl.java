package com.erp.inventory.branch.service;

import com.erp.inventory.branch.dao.BranchDao;
import com.erp.inventory.branch.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/23/13
 * Time: 12:26 AM
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BranchServiceImpl implements BranchService {
    @Autowired
    private BranchDao branchDao;

    @Override
    public boolean save(Branch branch) {
        return branchDao.save(branch);
    }

    @Override
    public boolean update(Branch branch) {
        return branchDao.update(branch);
    }

    @Override
    public boolean delete(Branch branch) {
        return branchDao.delete(branch);
    }

    @Override
    public List<Branch> findAllBranches() {
        return branchDao.findAllBranch();

    }

    @Override
    public Branch get(int branchCode) {
        return branchDao.get(branchCode);

    }

    @Override
    public Branch get(Branch branch) {
        return branchDao.get(branch);
    }

    @Override
    public Branch get(String branchName) {
        return branchDao.get(branchName);
    }

    @Override
    public int count() {
        return branchDao.count();
    }
}
