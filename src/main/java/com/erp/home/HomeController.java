package com.erp.home;

import java.util.HashMap;

import com.erp.util.ERPConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Dashboard")
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET, value="/")
	public ModelAndView home(){
		HashMap<String, Object> homeModel = new HashMap<String, Object>();
		homeModel.put("PageTitle", "ERP - Home");
		homeModel.put("PageLink", "home");
		homeModel.put("Title", "home");
		homeModel.put("templateType", "home");
		homeModel.put("companyCopyRightText", ERPConstants.COMPANY_COPYRIGHT_TEXT);
		homeModel.put("company", ERPConstants.COMPANY);

		return new ModelAndView("/home/index", homeModel);
	}

}
