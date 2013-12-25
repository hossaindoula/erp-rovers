package com.erp.security.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.erp.security.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.security.AuthorizationFilter;
import com.erp.security.dao.UserDao;
import com.erp.security.model.Feature;
import com.erp.security.model.Authority;
import com.erp.security.model.AuthorizedGroups;
import com.erp.security.model.User;

@Service
public class AuthenticationAndAuthorizationServiceImpl implements
		AuthenticationAndAuthorizationService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean authenticate(String username, String password) {
		// call dao method to retrieve the user object
		User user = userDao.get(username, password);
		
		if(user instanceof User){
			// call authenticationfilter
			AuthorizationFilter.setAuthorization(user);
			
			return true;
		}		
		return false;
	}

	@Override
	public boolean checkAuthorization(List<Feature> features, String controller, String operation) {
        boolean isAllowed = false;
        for(Feature feature : SessionUtil.getSessionUserFeatures()){
            System.out.println("controller " + controller + " feature.getComponent().getComponentName()" + feature.getComponent().getComponentName());
            if(feature.getComponent().getComponentName().equals(controller)
                    && feature.getOperation().equals(operation)){
                isAllowed = true;
                break;
            }
        }
		return isAllowed;
	}

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
	public boolean aspectAssignmentToAuthority(Authority authority,
			List<Feature> features) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
