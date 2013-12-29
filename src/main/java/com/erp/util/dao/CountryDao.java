package com.erp.util.dao;

import com.erp.util.model.Country;
import com.erp.util.model.Region;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 2:53 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CountryDao {

    public boolean save(Country country);

    public boolean update(Country country);

    public boolean delete(Country country);

    public List<Country> findAllCountries();

    public Country get(int id);

    public List<Country> findCountriesByRegion(Region region);

    public int count();
}
