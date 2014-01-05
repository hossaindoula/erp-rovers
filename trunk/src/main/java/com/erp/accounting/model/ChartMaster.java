package com.erp.accounting.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/1/14
 * Time: 12:03 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class ChartMaster implements Serializable {
    @Id
    private String accountCode;
    private String accountCode2;
    private  String accountName;
    private  int accountType;
    private int taxCode;

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountCode2() {
        return accountCode2;
    }

    public void setAccountCode2(String accountCode2) {
        this.accountCode2 = accountCode2;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public int getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(int taxCode) {
        this.taxCode = taxCode;
    }
}
