/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.security.service;

import com.erp.security.dao.UserDao;


import com.erp.security.model.AuthorizedGroups;
import com.erp.security.model.Token;
import com.erp.security.model.User;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ronnie
 */

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserDao userDao;

	@Override
    public User getUser(int userID) {
		return userDao.get(userID);
    }

    @Override
    public User getUserByEmail(String emailAddress) {
    	return userDao.getUserByEmail(emailAddress);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean saveUser(Token token) {
        userDao.save(token);
        User user = new User();
        user.setToken(token);
        user.setActive(true);
        userDao.save(user);

        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean saveUser(User user) {
        return userDao.save(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean updateToken(Token token) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean updateToken(User user) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public User findByUserCodeAndPassword(String username, String password) {
    	return userDao.get(username, password);
    }

    @Override
    public List<User> getAllUsers() {
    	return userDao.getAllUsers();
    }

	@Override
	public User findUserByUserCode(String userCode) {
		return userDao.get(userCode);
	}

	@Override
	public AuthorizedGroups findByAuthorizedGroupsName(
			String authorizedGroupsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveAuthorizedGroups(AuthorizedGroups authorizedGroups) {
		// TODO Auto-generated method stub
		return false;
	}

    @Override
    public int count(){
        return userDao.count();
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return userDao.get(username,password);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.get(username);
    }


}
