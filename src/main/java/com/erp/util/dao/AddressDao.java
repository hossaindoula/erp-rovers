package com.erp.util.dao;

import com.erp.util.model.Address;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */
public interface AddressDao {

    public boolean save(Address address);

    public boolean update(Address address);

    public boolean delete(Address address);

    public List<Address> findAllAddresses();

    public Address get(int id);

    public List<Address> findAddressesByAddressLineFirstAndAddressLineSecond(String firstAddress, String secondAddress);

    public int count();

}
