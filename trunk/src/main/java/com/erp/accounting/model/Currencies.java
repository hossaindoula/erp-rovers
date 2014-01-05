package com.erp.accounting.model;

import com.erp.util.model.Country;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/1/14
 * Time: 12:27 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Currencies implements Serializable {
    @Id

    private int id;
    private String currency;
    private  String abbrev;
    private String currSymbol;
    private Country country;
    private String hundredsName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getCurrSymbol() {
        return currSymbol;
    }

    public void setCurrSymbol(String currSymbol) {
        this.currSymbol = currSymbol;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getHundredsName() {
        return hundredsName;
    }

    public void setHundredsName(String hundredsName) {
        this.hundredsName = hundredsName;
    }
}
