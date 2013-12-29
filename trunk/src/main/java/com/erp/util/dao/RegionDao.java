package com.erp.util.dao;

import com.erp.util.model.Region;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 2:54 PM
 * To change this template use File | Settings | File Templates.
 */
public interface RegionDao {

    public boolean save(Region region);

    public boolean update(Region region);

    public boolean delete(Region region);

    public List<Region> findAllRegions();

    public Region get(int id);

    public int count();

}
