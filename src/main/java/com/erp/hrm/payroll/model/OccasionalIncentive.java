package com.erp.hrm.payroll.model;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 7:43 PM
 * To change this template use File | Settings | File Templates.
 */
import com.erp.hrm.model.Employee;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@DiscriminatorValue("irregular")
public class OccasionalIncentive extends Incentive {

    @ManyToMany
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
