package com.erp.hrm.dao;

import com.erp.hrm.model.Degree;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/31/13
 * Time: 3:24 PM
 * To change this template use File | Settings | File Templates.
 */
public interface DegreeDao {

    public boolean save(Degree degree);

    public boolean update(Degree degree);

    public boolean delete(Degree degree);

    public List<Degree> findAllDegrees();

    public Degree get(int id);

    public Degree get(Degree degree);

    public int count();

}
