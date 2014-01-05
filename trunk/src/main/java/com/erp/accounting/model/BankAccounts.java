package com.erp.accounting.model;

import com.erp.util.model.Address;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/31/13
 * Time: 9:03 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class BankAccounts implements Serializable{

    @Id
    private String accountCode;
    private int accountType;
    private String bankAccountName;
    private String bankAccountNumber;
    private String bankName;

    @ManyToOne
    private Address bankAddress;
    private String currCode;

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Address getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(Address bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }




}
