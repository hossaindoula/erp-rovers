package com.erp.hrm.payroll.model;

import com.erp.hrm.model.Employee;
import com.erp.hrm.model.Employer;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 7:52 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "provident_fund")
public class ProvidentFund implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Employer contributor;
    private Double percentage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employer getContributor() {
        return contributor;
    }

    public void setContributor(Employer contributor) {
        this.contributor = contributor;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}