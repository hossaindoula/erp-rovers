package com.erp.home.service;

import com.erp.security.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Rony
 * Date: 12/27/13
 * Time: 9:33 PM
 * To change this template use File | Settings | File Templates.
 */

public interface ProfileService {

    public String save(Moment moment);

    public String save(String momentText);

    public boolean save(Album album);

    public boolean delete(Moment moment);

    public boolean update(Moment moment);

    public Moment getMomentById(int moment);

    public List<Moment> findAllMoments();

    public String findAllMomentsBySessionUser();

    public List<Moment> findAllMomentsByUser(User user);
}
