package com.erp.util.service;

import com.erp.util.model.Address;
import com.erp.util.model.City;
import com.erp.util.model.Country;
import com.erp.util.model.Region;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UtilService {

    public boolean save(Address address);

    public boolean save(City city);

    public boolean save(Country country);

    public boolean save(Region region);

    public boolean update(Address address);

    public boolean update(Country country);

    public boolean update(City city);

    public boolean update(Region region);

    public boolean delete(Address address);

    public boolean delete(City city);

    public boolean delete(Country country);

    public boolean delete(Region region);

    public List<Address> findAllAddresses();

    public Address getAddress(int id);

    public List<Address> findAddressesByAddressLineFirstAndAddressLineSecond(String firstAddress, String secondAddress);

    public int countAddress();

    public List<City> findAllCities();

    public City getCity(int id);

    public List<City> findAddressByCountry(Country country);

    public int countCity();

    public List<Country> findAllCountries();

    public Country getCountry(int id);

    public List<Country> findCountriesByRegion(Region region);

    public int countCountry();

    public List<Region> findAllRegions();

    public Region getRegion(int id);

    public int countRegion();

}
