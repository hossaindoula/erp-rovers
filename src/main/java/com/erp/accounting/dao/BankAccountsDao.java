package com.erp.accounting.dao;

import com.erp.accounting.model.BankAccounts;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/1/14
 * Time: 7:24 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BankAccountsDao {
    public boolean save( BankAccounts bankAccounts);
    public boolean update(BankAccounts bankAccounts);
    public boolean delete(BankAccounts bankAccounts);
    public List<BankAccounts> findAllBanksAccounts();
    public  BankAccounts get(int id);
    public BankAccounts get(BankAccounts bankAccounts);
    public BankAccounts  get(String bankAccountName ) ;




}
