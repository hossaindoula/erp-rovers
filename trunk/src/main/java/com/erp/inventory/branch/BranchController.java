package com.erp.inventory.branch;

import com.erp.inventory.branch.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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


}
