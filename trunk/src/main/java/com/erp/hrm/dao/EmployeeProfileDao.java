package com.erp.hrm.dao;

import com.erp.hrm.model.EmployeeProfile;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/31/13
 * Time: 3:06 PM
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeProfileDao {

    public boolean save(EmployeeProfile employeeProfile);

    public boolean update(EmployeeProfile employeeProfile);

    public boolean delete(EmployeeProfile employeeProfile);

    public List<EmployeeProfile> findAllEmployeeProfiles();

    public EmployeeProfile get(int id);

    public EmployeeProfile get(EmployeeProfile employeeProfile);

    public int count();
}
