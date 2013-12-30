package com.erp.hrm.service;

import com.erp.hrm.model.Employee;
import com.erp.hrm.model.JobTitle;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/31/13
 * Time: 2:09 PM
 * To change this template use File | Settings | File Templates.
 */
public interface HRMService {

    public boolean save(Employee employee);

    public boolean save(JobTitle jobTitle);

    public boolean update(Employee employee);

    public List<Employee> findAllEmployees();

    public Employee getEmployee(Long employeeId);

    public boolean delete(Employee employee);


}
