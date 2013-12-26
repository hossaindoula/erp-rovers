package com.erp.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.security.dao.SecurityDao;
import com.erp.security.model.Feature;
import com.erp.security.model.Authority;
import com.erp.security.model.AuthorizedGroups;
import com.erp.security.model.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	private SecurityDao securityDao;
	
	@Override
	public List<Authority> findAllAuthorities(
			List<AuthorizedGroups> authorizedGroups) {
		return securityDao.findAllAuthorities(authorizedGroups);
	}

	@Override
	public List<Feature> findAllFeatures(List<Authority> authorities) {
		return securityDao.findAllFeatures(authorities);
	}

    @Override
    public Component getComponentById(Long componentId){
        return securityDao.getComponentById(componentId);
    }
    @Override
    public Component getComponentByName(String componentName){
       return securityDao.getComponentByName(componentName);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean save(AuthorizedGroups authorizedGroups) {
        return securityDao.save(authorizedGroups);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public boolean save(Feature feature) {
		return securityDao.save(feature);
	}
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Feature findFeatureByOperation(String operation){
      return securityDao.findFeatureByOperation(operation);
    }

	@Override
	public List<Feature> findAllFeatures() {
		return securityDao.findAllFeatures();
	}

	@Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public boolean delete(Feature feature) {
		return securityDao.delete(feature);
	}

	@Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public boolean save(Authority authority) {
		return securityDao.save(authority);
	}

	@Override
	public List<Authority> findAllAuthorities() {
		return securityDao.findAllAuthorities();
	}

	@Override
	public Authority findByAuthorityName(String authorityName) {
		return securityDao.findByAuthorityName(authorityName);
	}

	@Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public boolean delete(Authority authority) {
		return securityDao.delete(authority);
	}

	@Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public boolean save(Component component) {
		return securityDao.save(component);
	}

	@Override
	public List<Component> findAllComponents() {
		return securityDao.findAllComponents();
	}

	@Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public boolean delete(Component component) {
		return securityDao.delete(component);
	}
    @Override
    public List<AuthorizedGroups> findAllAuthorizedGroup(){
        return securityDao.findAllAuthorizedGroup();
    }

}
