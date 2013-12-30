package com.erp.hrm.dao;

import com.erp.hrm.model.Employee;
import com.erp.util.model.Name;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 11:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeDao {

    public boolean save(Employee employee);

    public boolean update(Employee employee);

    public boolean delete(Employee employee);

    public List<Employee> findAllEmployees();

    public Employee get(int id);

    public Employee get(Employee employee);

    public int count();

}
