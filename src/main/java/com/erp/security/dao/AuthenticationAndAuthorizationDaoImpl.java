package com.erp.security.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.erp.security.model.Feature;
import com.erp.security.model.Authority;
import com.erp.security.model.AuthorizedGroups;
import com.erp.security.model.User;
import com.erp.security.model.Component;

@Repository
public class AuthenticationAndAuthorizationDaoImpl implements
		AuthenticationAndAuthorizationDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public boolean authorizedGroupsAssignmentToUser(
			User user, List<AuthorizedGroups> authorizedGroups) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean authorityAssignmentToAuthorizedGroups(
			AuthorizedGroups authorizedGroups, List<Authority> authorities) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean featureAssignmentToAuthority(Authority authority,
			List<Feature> features) {
		// TODO Auto-generated method stub
		return false;
	}

}
