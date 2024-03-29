package com.erp.security;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.erp.security.model.User;
import com.erp.security.model.Token;
import com.erp.security.model.Feature;
import com.erp.security.model.Component;
import com.erp.security.model.AuthorizedGroups;
import com.erp.security.model.Authority;

import com.erp.util.ERPConstants;
import com.erp.util.JSONView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.erp.security.service.AuthenticationAndAuthorizationService;
import com.erp.security.service.SecurityService;
import com.erp.security.service.UserDetailsService;


@Controller
@RequestMapping("/security/")
public class SecurityController {
	
	@Autowired
    private UserDetailsService userDetailsService;
	
	@Autowired
	private SecurityService securityService;
	
	@Autowired
	private AuthenticationAndAuthorizationService authorizationService;
	private HttpSession userSession;
    
	@RequestMapping(method=RequestMethod.GET, value="/home")
    public ModelAndView index() throws Exception {
        Map<String,String> indexMap = new HashMap<String,String>();
        return new ModelAndView("/security/index", indexMap);
    }
    
	@RequestMapping(method=RequestMethod.GET, value="/passwordRequest")
    public ModelAndView passwordRequest(){
    	Map<String,String> passwordRequestMap = new HashMap<String,String>();
		passwordRequestMap.put("success", "");

    	return new ModelAndView("/security/password_request", passwordRequestMap);
    }
	
	@RequestMapping(method=RequestMethod.GET, value="/userSummary")
	public ModelAndView userSummary(){
		return new ModelAndView("/security/user_list");
    }
	
	@RequestMapping(method=RequestMethod.GET, value="/logout")
	public ModelAndView logout(){
		userSession = SessionUtil.getSession();
		userSession.removeAttribute(ERPConstants.SESSION_USER);
		userSession.removeAttribute(ERPConstants.SESSION_USER_FEATURES);
		userSession.invalidate();

        return new ModelAndView("redirect:/");
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/userAuthorizedGroupAssignment")
	public ModelAndView userAuthorizedGroupAssignment(){
		System.out.println("assignment !!! ");
		return new ModelAndView("/security/user_list");
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/userList")
	public ModelAndView userList(){
		System.out.println("userList");
        Map<String,String> userListMap = new HashMap<String, String>();
        userListMap.put("PageTitle","User List");
		return new ModelAndView("/security/user_list",userListMap);
	}

    @RequestMapping(method=RequestMethod.GET, value="/userJsonData")
    public ModelAndView userJsonData(){
        int start =  0;
        int limit = 15;
        Map<String,Object> userListMap = null;
        Map<String,Object> userMap = new HashMap<String, Object>();
        List<User> users = userDetailsService.getAllUsers();
        List<Map<String,Object>> userMapList = new ArrayList<Map<String, Object>>();
        for (User user : users) {
            userListMap = new HashMap<String, Object>();
            userListMap.put("id", user.getAuthorizeId());
            userListMap.put("username", user.getToken().getUsername());
            userListMap.put("password", user.getToken().getPassword());
            userListMap.put("active", true);

            userMapList.add(userListMap);
        }

        userMap.put( "userList",  userMapList.subList(start, start + limit > userMapList.size() ?
                userMapList.size() : start + limit));
        userMap.put( "totalCount",  userMapList.size());

        return new ModelAndView(new JSONView(), userMap);
    }

    @RequestMapping(method=RequestMethod.GET, value="/featureList")
    public ModelAndView featureList(){
        System.out.println("userList");
        Map<String,String> featureListMap = new HashMap<String, String>();
        featureListMap.put("PageTitle","Feature List");
        return new ModelAndView("/security/feature_list",featureListMap);
    }

    @RequestMapping(method=RequestMethod.GET, value="/featureJsonData")
    public ModelAndView featureJsonData(){
        int start = 0;
        int limit = 15;
        Map<String,Object> featureListMap = null;
        List<Feature> features = securityService.findAllFeatures();
        List<Map<String,Object>> featureMapList = new ArrayList<Map<String, Object>>();
        for(Feature feature:features){
            featureListMap = new HashMap<String, Object>();
            featureListMap.put("id",feature.getFeatureId());
            featureListMap.put("description",feature.getDescription());
            featureListMap.put("operation",feature.getOperation());
            featureListMap.put("componentId",feature.getComponent());

            featureMapList.add(featureListMap);

        }

        featureListMap = new HashMap<String, Object>();
        featureListMap.put("featureList",featureMapList.subList(start,start+limit>featureMapList.size()?
            featureMapList.size():start+limit));
        return new ModelAndView(new JSONView(),featureListMap);


    }
  




    @RequestMapping(method=RequestMethod.GET, value="/componentList")
    public  ModelAndView componentList(){

        Map<String,String> componentListMap=new HashMap<String, String>();
        componentListMap.put("PageTitle","Component List");
        return  new ModelAndView("/security/component_list",componentListMap);

    }
    @RequestMapping(method=RequestMethod.GET, value="/componentJsonData")
    public ModelAndView componentJsonData(){
        int start =  0;
        int limit = 15;
        Map<String,Object> componentListMap = null;
        Map<String,Object> componentMap = new HashMap<String, Object>();
        List<Component> components = securityService.findAllComponents();
        List<Map<String,Object>> componentMapList = new ArrayList<Map<String, Object>>();
        for (Component component : components) {
            componentListMap = new HashMap<String, Object>();
            componentListMap.put("componentId",component.getComponentId());
            componentListMap.put("componentName",component.getComponentName());
            componentListMap.put("description",component.getDescription());
            componentMapList.add(componentListMap);

        }

        componentMap.put( "componentList",  componentMapList.subList(start, start + limit > componentMapList.size() ?
                componentMapList.size() : start + limit));
        componentMap.put( "totalCount",  componentMapList.size());

        return new ModelAndView(new JSONView(), componentMap);
    }





    @RequestMapping(method=RequestMethod.GET, value="/createUser")
    public ModelAndView createUser(){
        Map<String,String> saveUserMap = new HashMap<String,String>();
        saveUserMap.put("PageTitle", "Create User");
        saveUserMap.put("DashboardLink", ERPConstants.DASHBOARD_LINK);

        return new ModelAndView("/security/user_create", saveUserMap);

    }

	@RequestMapping(method=RequestMethod.POST, value="/saveUser")
	public ModelAndView saveUser(@RequestParam("username") String username,
			@RequestParam("password") String password,
			@RequestParam("confirmPassword") String confirmPassword){
		Map<String,String> saveUserMap = new HashMap<String,String>();
        User userDuplicate = userDetailsService.findUserByUserCode(username);
        if (userDuplicate != null){
        	saveUserMap.put("result", "User already exists");
            System.out.println("userDuplicate.getToken() = " + userDuplicate.getToken().getUsername());
            saveUserMap.put("PageTitle", "User Create");
            return new ModelAndView("redirect:/security/createUser", saveUserMap);
        } else{
            if ( password.equals(confirmPassword) ){
            	Token userToken = new Token();
            	userToken.setUsername(username);
            	userToken.setPassword(password);
                
                userDetailsService.saveUser(userToken);
                System.out.println("userDuplicate.getToken() second case = " + userToken.getUsername());
                saveUserMap.put("PageTitle", "User Create");

                return new ModelAndView("redirect:/security/createUser", saveUserMap);
            }
            else {
            	saveUserMap.put("result", "Password doesn't match");
                saveUserMap.put("PageTitle", "User Create");
                System.out.println("last  case = " );

                return new ModelAndView("redirect:/security/createUser", saveUserMap);
            }

        }

	}


    @RequestMapping(method=RequestMethod.GET, value="/createFeature")
    public ModelAndView createFeature(){
        Map<String,String> saveFeatureMap = new HashMap<String,String>();
        saveFeatureMap.put("PageTitle", "Create Feature");
        saveFeatureMap.put("DashboardLink", ERPConstants.DASHBOARD_LINK);

        return new ModelAndView("/security/feature_create", saveFeatureMap);

    }

    @RequestMapping(method=RequestMethod.POST, value="/saveFeature")
    public ModelAndView saveFeature(@RequestParam("description") String description,
                                    @RequestParam("operation") String operation,
                                    @RequestParam("componentId") String componentId){
        Map<String,String> saveFeatureMap = new HashMap<String,String>();
        Feature featureOperationDuplicate = securityService.findFeatureByOperation(operation);
        if(featureOperationDuplicate!= null ){

            saveFeatureMap.put("result","User already exists");
            saveFeatureMap.put("PageTitle","Feature Create");
            return  new ModelAndView("redirect:/security/createFeature", saveFeatureMap);

        }
        else {
            Long componentIdNumber = Long.valueOf(componentId);
            Component component = securityService.getComponentById(componentIdNumber);
            Feature feature = new Feature();
            feature.setDescription(description);
            feature.setOperation(operation);
            feature.setComponent(component);

            securityService.save(feature);
            saveFeatureMap.put("PageTitle", "Feature Create");

            return new ModelAndView("redirect:/security/createFeature", saveFeatureMap);

        }
    }
    @RequestMapping(method = RequestMethod.GET,value = "/createComponent")
    public ModelAndView createComponent(){
        Map<String,String> createComponentMap = new HashMap<String,String>();
        createComponentMap.put("PageTitle", "Create Component");
        createComponentMap.put("DashboardLink", ERPConstants.DASHBOARD_LINK);

        return new ModelAndView("/security/create_component", createComponentMap);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/saveComponent")
    public ModelAndView saveComponent(@RequestParam("componentName") String componentName,@RequestParam("description") String description){
        Map<String,String> saveComponentMap = new HashMap<String, String>();
        Component componentDuplicate = securityService.getComponentByName(componentName);
        if(componentDuplicate != null){
            saveComponentMap.put("result","Component already exists");
            saveComponentMap.put("PageTitle","Component Create");
            return  new ModelAndView("redirect:/security/createComponent", saveComponentMap);
        }
        else {
            Component component =new Component();
            component.setComponentName(componentName);
            component.setDescription(description);
            securityService.save(component);
            saveComponentMap.put("PageTitle", "Create Component");

            return new ModelAndView("redirect:/security/createComponent", saveComponentMap);

        }

    }
	
	@RequestMapping(method=RequestMethod.POST, value="/saveAuthorizedGroups")
	public ModelAndView saveAuthorizedGroups(@RequestParam("authorizationName") String authorizationName,
			@RequestParam("authorizationDescription") String authorizationDescription){
		
		Map<String,String> saveAuthorizedGroupsMap = new HashMap<String,String>();
		AuthorizedGroups authorizedGroupsDuplicate = userDetailsService.findByAuthorizedGroupsName(authorizationName);
		
		if(authorizedGroupsDuplicate != null){
			saveAuthorizedGroupsMap.put("result", "Group already exists!!!");
			
			return new ModelAndView("/security/user_group_create", saveAuthorizedGroupsMap);
		} else {
			AuthorizedGroups authorizedGroups = new AuthorizedGroups();
			authorizedGroups.setAuthorizationName(authorizationName);
			authorizedGroups.setAuthorizationDescription(authorizationDescription);
			
			userDetailsService.saveAuthorizedGroups(authorizedGroups);
			
			saveAuthorizedGroupsMap.put("result", "Authorized Group is saved successfully!!!");
			
			return new ModelAndView("/security/user_group_create", saveAuthorizedGroupsMap);
		}
	}

    @RequestMapping(method = RequestMethod.GET,value = "/createAuthority")
    public ModelAndView createAuthority(){
        Map<String,String> createAuthorityMap=new HashMap<String, String>();
        createAuthorityMap.put("PageTitle", "Create Authority");
        createAuthorityMap.put("DashboardLink", "../home");
        return new ModelAndView("/security/create_authority",createAuthorityMap);
    }
    
	@RequestMapping(method=RequestMethod.POST,value = "/saveAuthority")
	public ModelAndView saveAuthority(@RequestParam("authorityName") String authorityName,
			@RequestParam("authorityDescription") String authorityDescription){
		Map<String,String> saveAuthorityMap = new HashMap<String,String>();
		Authority authorityDuplicate = securityService.findByAuthorityName(authorityName);
		
		if(authorityDuplicate != null){
			saveAuthorityMap.put("result", "Authority already exists!!!");
            saveAuthorityMap.put("PageTitle","Create Authority");
			return new ModelAndView("redirect:/security/createAuthority", saveAuthorityMap);
		} else {
			Authority authority = new Authority();
			authority.setAuthorityName(authorityName);
			authority.setAuthorityDescription(authorityDescription);
			
			securityService.save(authority);
			saveAuthorityMap.put("PageTitle","Create Authority");
			return new ModelAndView("redirect:/security/createAuthority", saveAuthorityMap);
		}
	}

    @RequestMapping(method=RequestMethod.GET, value="/authorityList")
    public ModelAndView authorityList(){
        Map<String,String> authorityListMap = new HashMap<String, String>();
        authorityListMap.put("PageTitle","Authority List");

        return new ModelAndView("/security/authority_list",authorityListMap);
    }

    @RequestMapping(method=RequestMethod.GET, value="/authorityJsonData")
    public ModelAndView authorityJsonData(){
        int start =  0;
        int limit = 15;
        Map<String,Object> authorityListMap = null;
        Map<String,Object> authorityMap = new HashMap<String, Object>();
        List<Authority> authorities = securityService.findAllAuthorities();
        List<Map<String,Object>> authorityMapList = new ArrayList<Map<String, Object>>();

        for (Authority authority : authorities) {
            authorityListMap = new HashMap<String, Object>();
            authorityListMap.put("id", authority.getAuthorityId());
            authorityListMap.put("authorityName", authority.getAuthorityName());
            authorityListMap.put("authorityDescription", authority.getAuthorityDescription());

            authorityMapList.add(authorityListMap);
        }

        authorityMap.put( "authorityList",  authorityMapList.subList(start, start + limit > authorityMapList.size() ?
                authorityMapList.size() : start + limit));
        authorityMap.put( "totalCount",  authorityMapList.size());

        return new ModelAndView(new JSONView(), authorityMap);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/userGroupList")
    public ModelAndView userGroupList(){
        Map<String,String> userGroupListMap=new HashMap<String, String>();
        userGroupListMap.put("PageTitle","User Group List");

        return new ModelAndView("/security/user_group_list",userGroupListMap);
    }
    @RequestMapping(method = RequestMethod.GET,value = "userGroupJsonData")
    public ModelAndView userGroupJsonData(){
        int start=0;
        int limit=15;
        Map<String,Object> userGroupJsonMap = null;
        List<Map<String,Object>> userGroupJsonMapList = new ArrayList<Map<String, Object>>();
        List<AuthorizedGroups> authorizedGroupses = securityService.findAllAuthorizedGroup();
        if(authorizedGroupses != null){

            for(AuthorizedGroups authorizedGroups : authorizedGroupses){
                userGroupJsonMap.put("id",authorizedGroups.getAuthorizedId());
                userGroupJsonMap.put("authorizationName",authorizedGroups.getAuthorizationName());
                userGroupJsonMap.put("authorizationDescription",authorizedGroups.getAuthorizationDescription());
                userGroupJsonMapList.add(userGroupJsonMap);
            }
            userGroupJsonMap=new HashMap<String, Object>();
            userGroupJsonMap.put("authorizedUserGroupList",userGroupJsonMapList.subList(start,start+limit > userGroupJsonMapList.size()?
                    userGroupJsonMapList.size() : start+limit ));
            return new ModelAndView(new JSONView(),userGroupJsonMap);
        }
        else {
           return null;
        }

    }
	
	
	
    
 }