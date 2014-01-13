package com.erp.inventory.sales;

import com.erp.util.ERPConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 1/9/14
 * Time: 1:56 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class SalesController {

    @RequestMapping(method= RequestMethod.GET, value="salesOrderEntry")
    public ModelAndView salesOrderEntry(){
        HashMap<String, Object> salesOrderEntryModel = new HashMap<String, Object>();
        salesOrderEntryModel.put("PageTitle", "ERP - Sales Order Entry");
        salesOrderEntryModel.put("PageLink", "SalesOrderEntry");
        salesOrderEntryModel.put("Title", "SalesOrderEntry");
        salesOrderEntryModel.put("templateType", "SalesOrderEntry");
        salesOrderEntryModel.put("companyCopyRightText", ERPConstants.COMPANY_COPYRIGHT_TEXT);
        salesOrderEntryModel.put("company", ERPConstants.COMPANY);

        return new ModelAndView("inventory/create_sales_order_entry", salesOrderEntryModel);
    }
}
