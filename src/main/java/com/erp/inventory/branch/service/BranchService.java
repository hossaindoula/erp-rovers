package com.erp.inventory.branch.service;

import com.erp.inventory.branch.model.Branch;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/23/13
 * Time: 12:11 AM
 * To change this template use File | Settings | File Templates.
 */
public interface BranchService {

    public boolean save(Branch branch);

    public boolean update(Branch branch);

    public boolean delete(Branch branch);

    public List<Branch>findAllBranches();

    public Branch get(int id);

    public Branch get(Branch branch);

    public Branch get(String branchName);

    public int count();

}
