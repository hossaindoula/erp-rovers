package com.erp.hrm.model;

import com.erp.hrm.payroll.model.OccasionalIncentive;
import com.erp.hrm.payroll.model.RegularIncentive;
import com.erp.security.model.User;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 6:10 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@DiscriminatorValue("employee")
public class Employee extends User {

    private static final long serialVersionUID = 1L;

    @ManyToMany(mappedBy = "employees")
    private List<RegularIncentive> regularIncentives;

    @ManyToMany(mappedBy = "employees")
    private List<OccasionalIncentive> occasionalIncentives;


    @ManyToMany(mappedBy = "employees")
    private List<Department> department;

    public List<RegularIncentive> getRegularIncentives() {
        return regularIncentives;
    }

    public void setRegularIncentives(List<RegularIncentive> regularIncentives) {
        this.regularIncentives = regularIncentives;
    }

    public List<OccasionalIncentive> getOccasionalIncentives() {
        return occasionalIncentives;
    }

    public void setOccasionalIncentives(List<OccasionalIncentive> occasionalIncentives) {
        this.occasionalIncentives = occasionalIncentives;
    }

    public List<Department> getDepartment() {
        return department;
    }

    public void setDepartment(List<Department> department) {
        this.department = department;
    }
}
