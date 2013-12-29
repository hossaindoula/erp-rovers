package com.erp.util.dao;

import com.erp.util.model.City;
import com.erp.util.model.Country;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CityDao {

    public boolean save(City city);

    public boolean update(City city);

    public boolean delete(City city);

    public List<City> findAllCities();

    public City get(int id);

    public List<City> findAddressByCountry(Country country);

    public int count();
}
