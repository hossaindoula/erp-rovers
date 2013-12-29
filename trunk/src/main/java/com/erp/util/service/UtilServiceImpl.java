package com.erp.util.service;

import com.erp.util.dao.AddressDao;
import com.erp.util.dao.CityDao;
import com.erp.util.dao.CountryDao;
import com.erp.util.dao.RegionDao;
import com.erp.util.model.Address;
import com.erp.util.model.City;
import com.erp.util.model.Country;
import com.erp.util.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */

@Service
public class UtilServiceImpl implements UtilService {

    @Autowired
    private AddressDao addressDao;

    @Autowired
    private CityDao cityDao;

    @Autowired
    private CountryDao countryDao;

    @Autowired
    private RegionDao regionDao;

    @Override
    public boolean save(Address address) {
        return addressDao.save(address);
    }

    @Override
    public boolean save(City city) {
        return cityDao.save(city);
    }

    @Override
    public boolean save(Country country) {
        return countryDao.save(country);
    }

    @Override
    public boolean save(Region region) {
        return regionDao.save(region);
    }

    @Override
    public boolean update(Address address) {
        return addressDao.update(address);
    }

    @Override
    public boolean update(Country country) {
        return countryDao.update(country);
    }

    @Override
    public boolean update(City city) {
        return cityDao.update(city);
    }

    @Override
    public boolean update(Region region) {
        return regionDao.update(region);
    }

    @Override
    public boolean delete(Address address) {
        return addressDao.delete(address);
    }

    @Override
    public boolean delete(City city) {
        return cityDao.delete(city);
    }

    @Override
    public boolean delete(Country country) {
        return countryDao.delete(country);
    }

    @Override
    public boolean delete(Region region) {
        return regionDao.delete(region);
    }

    @Override
    public List<Address> findAllAddresses() {
        return addressDao.findAllAddresses();
    }

    @Override
    public Address getAddress(int id) {
        return addressDao.get(id);
    }

    @Override
    public List<Address> findAddressesByAddressLineFirstAndAddressLineSecond(String firstAddress,
                                                                             String secondAddress) {
        return addressDao.findAddressesByAddressLineFirstAndAddressLineSecond(firstAddress,secondAddress);
    }

    @Override
    public int countAddress() {
        return addressDao.count();
    }

    @Override
    public List<City> findAllCities() {
        return cityDao.findAllCities();
    }

    @Override
    public City getCity(int id) {
        return cityDao.get(id);
    }

    @Override
    public List<City> findAddressByCountry(Country country) {
        return cityDao.findAddressByCountry(country);
    }

    @Override
    public int countCity() {
        return cityDao.count();
    }

    @Override
    public List<Country> findAllCountries() {
        return countryDao.findAllCountries();
    }

    @Override
    public Country getCountry(int id) {
        return countryDao.get(id);
    }

    @Override
    public List<Country> findCountriesByRegion(Region region) {
        return countryDao.findCountriesByRegion(region);
    }

    @Override
    public int countCountry() {
        return countryDao.count();
    }

    @Override
    public List<Region> findAllRegions() {
        return regionDao.findAllRegions();
    }

    @Override
    public Region getRegion(int id) {
        return regionDao.get(id);
    }

    @Override
    public int countRegion() {
        return regionDao.count();
    }
}
