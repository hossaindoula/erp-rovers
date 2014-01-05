package com.erp.accounting.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/31/13
 * Time: 11:11 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class ChartClass implements Serializable {
    @Id
    private  int cId;
    private String className;
    private  short balanceSheet;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public short getBalanceSheet() {
        return balanceSheet;
    }

    public void setBalanceSheet(short balanceSheet) {
        this.balanceSheet = balanceSheet;
    }

}
