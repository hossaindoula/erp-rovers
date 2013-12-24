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
    public  boolean save(Branch branch )  ;
    public boolean delete(Branch branch);
    public List<Branch> findAllBranches();

    public Branch get(int branchCode) ;
    public Branch  get(String branchName);
    //public Branch get(String contactName);
  //  public  Branch  get(String contactName);




  //  public Category get(int id);

   // public Category get(Category category);

    //public Category get(String categoryName);



    //findAllCategories();

}
