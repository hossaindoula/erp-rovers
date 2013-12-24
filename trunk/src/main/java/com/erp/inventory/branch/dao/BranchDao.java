package com.erp.inventory.branch.dao;

import com.erp.inventory.branch.model.Branch;
import com.erp.inventory.items.model.Category;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/22/13
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BranchDao {

    public boolean save(Branch branch);

    public boolean delete(Branch branch);

    public List<Branch>findAllBranch();

    public Branch get(int id);

    public Branch get(Branch branch);

    public Branch get(String branchName);

}
