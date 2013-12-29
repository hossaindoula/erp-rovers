package com.erp.hrm.payroll.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 7:41 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "incentive")
public abstract class Incentive {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "incentive_name")
    private String incentiveName;

    @Column(name = "incentive_amount")
    private Double incentiveAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIncentiveName() {
        return incentiveName;
    }

    public void setIncentiveName(String incentiveName) {
        this.incentiveName = incentiveName;
    }

    public Double getIncentiveAmount() {
        return incentiveAmount;
    }

    public void setIncentiveAmount(Double incentiveAmount) {
        this.incentiveAmount = incentiveAmount;
    }
}
