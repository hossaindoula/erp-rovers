package com.erp.accounting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/2/14
 * Time: 1:29 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class PaymentTerms implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  termsIndicator;     //primary key auto
    private  String terms;
    private int daysBeforeDue;
    private int  dayInFollowingMonth;

    public int getTermsIndicator() {
        return termsIndicator;
    }

    public void setTermsIndicator(int termsIndicator) {
        this.termsIndicator = termsIndicator;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public int getDaysBeforeDue() {
        return daysBeforeDue;
    }

    public void setDaysBeforeDue(int daysBeforeDue) {
        this.daysBeforeDue = daysBeforeDue;
    }

    public int getDayInFollowingMonth() {
        return dayInFollowingMonth;
    }

    public void setDayInFollowingMonth(int dayInFollowingMonth) {
        this.dayInFollowingMonth = dayInFollowingMonth;
    }
}
