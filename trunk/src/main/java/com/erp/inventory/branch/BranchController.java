package com.erp.inventory.branch;

import com.erp.inventory.branch.model.Branch;
import com.erp.inventory.branch.service.BranchService;
import com.erp.util.ERPConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/23/13
 * Time: 12:39 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/branch/")
public class BranchController {
    @Autowired
    private BranchService  branchService;

    @RequestMapping(method= RequestMethod.GET, value="createBranch")
    public ModelAndView createBranch(){
        HashMap<String, Object> branchModel = new HashMap<String, Object>();
        branchModel.put("PageTitle", "Branch");
        branchModel.put("PageLink", "Branch");
        branchModel.put("Title", "Branch");
        branchModel.put("templateType", "Branch");
        branchModel.put("companyCopyRightText", ERPConstants.COMPANY_COPYRIGHT_TEXT);
        branchModel.put("company", ERPConstants.COMPANY);

        return new ModelAndView("inventory/create_branch", branchModel);
    }

    @RequestMapping(method= RequestMethod.POST, value="saveBranch")
    public ModelAndView saveCategory(@RequestParam("branchName") String branchName){
        System.out.println("branchName = " + branchName);
        Branch branch = new Branch();
        branch.setBranchName(branchName);
        branchService.save(branch);

        return new ModelAndView("redirect:createBranch");
    }


}
