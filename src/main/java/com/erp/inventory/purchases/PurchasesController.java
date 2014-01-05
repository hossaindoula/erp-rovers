package com.erp.inventory.purchases;

import com.erp.inventory.purchases.model.PurchasesData;
import com.erp.inventory.purchases.model.PurchasesOrderDetails;
import com.erp.inventory.purchases.model.Supplier;
import com.erp.inventory.purchases.service.PurchasesService;
import com.erp.util.ERPConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
@RequestMapping("/purchases/")
public class PurchasesController {

    @Autowired
    private PurchasesService purchasesService;

    @RequestMapping(method= RequestMethod.GET, value="createPurchasesData")
    public ModelAndView createPurchasesData(){
        HashMap<String, Object> purchasesDataModel = new HashMap<String, Object>();
        purchasesDataModel.put("PageTitle", "PurchasesData");
        purchasesDataModel.put("PageLink", "PurchasesData");
        purchasesDataModel.put("Title", "PurchasesData");
        purchasesDataModel.put("templateType", "PurchasesData");
        purchasesDataModel.put("companyCopyRightText", ERPConstants.COMPANY_COPYRIGHT_TEXT);
        purchasesDataModel.put("company", ERPConstants.COMPANY);

        return new ModelAndView("inventory/create_purchasesData", purchasesDataModel);
    }

    @RequestMapping(method= RequestMethod.POST, value="savePurchasesData")
    public ModelAndView savePurchasesData(@RequestParam("price") double price){
        PurchasesData purchasesData = new PurchasesData();
        purchasesData.setPrice(price);
        purchasesService.save(purchasesData);

        return new ModelAndView("redirect:createPurchasesData");
    }


    @Autowired

    @RequestMapping(method= RequestMethod.GET, value="createPurchasesOrderDetails")
    public ModelAndView createPurchasesOrderDetails(){
        HashMap<String, Object> purchasesOrderDetailsModel = new HashMap<String, Object>();
        purchasesOrderDetailsModel.put("PageTitle", "PurchasesOrderDetails");
        purchasesOrderDetailsModel.put("PageLink", "PurchasesOrderDetails");
        purchasesOrderDetailsModel.put("Title", "PurchasesOrderDetails");
        purchasesOrderDetailsModel.put("templateType", "PurchasesOrderDetails");
        purchasesOrderDetailsModel.put("companyCopyRightText", ERPConstants.COMPANY_COPYRIGHT_TEXT);
        purchasesOrderDetailsModel.put("company", ERPConstants.COMPANY);

        return new ModelAndView("inventory/create_PurchasesOrderDetails", purchasesOrderDetailsModel);
    }

    @RequestMapping(method= RequestMethod.POST, value="savePurchasesOrderDetails")
    public ModelAndView savePurchasesOrderDetails(@RequestParam("description") String description){
        PurchasesOrderDetails purchasesOrderDetails = new PurchasesOrderDetails();
        purchasesOrderDetails.setDescription(description);
        purchasesService.save(purchasesOrderDetails);

        return new ModelAndView("redirect:createPurchasesOrderDetails");


    }
    @Autowired

    @RequestMapping(method= RequestMethod.GET, value="createSupplier")
    public ModelAndView createSupplier(){
        HashMap<String, Object> supplierModel = new HashMap<String, Object>();
        supplierModel.put("PageTitle", "Supplier");
        supplierModel.put("PageLink", "Supplier");
        supplierModel.put("Title", "Supplier");
        supplierModel.put("templateType", "Supplier");
        supplierModel.put("companyCopyRightText", ERPConstants.COMPANY_COPYRIGHT_TEXT);
        supplierModel.put("company", ERPConstants.COMPANY);

        return new ModelAndView("inventory/create_supplier", supplierModel);
    }

    @RequestMapping(method= RequestMethod.POST, value="saveSupplier")
    public ModelAndView saveSupplier(@RequestParam("firstName") String firstName){
        Supplier supplier = new Supplier();
        supplier.setFirstName(firstName);
        purchasesService.save(supplier);

        return new ModelAndView("redirect:createSupplier");



    }
}