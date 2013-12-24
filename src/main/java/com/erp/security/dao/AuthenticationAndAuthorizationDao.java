package com.erp.security.dao;

import java.util.List;

import com.erp.security.model.Feature;
import com.erp.security.model.Authority;
import com.erp.security.model.AuthorizedGroups;
import com.erp.security.model.User;
import com.erp.security.model.Component;

public interface AuthenticationAndAuthorizationDao {

	public boolean authorizedGroupsAssignmentToUser(User user, List<AuthorizedGroups> authorizedGroups);
	
	public boolean authorityAssignmentToAuthorizedGroups(AuthorizedGroups authorizedGroups, List<Authority> authorities);
	
	public boolean featureAssignmentToAuthority(Authority authority, List<Feature> features);

}
