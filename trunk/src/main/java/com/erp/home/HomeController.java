package com.erp.home;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET, value="/home")
	public ModelAndView home(){
		HashMap<String, Object> homeModel = new HashMap<String, Object>();
		homeModel.put("PageTitle", "ERP - Home");
		homeModel.put("PageLink", "home");
		homeModel.put("templateType", "home");
		
		return new ModelAndView("/home/index", homeModel);
	}

}
