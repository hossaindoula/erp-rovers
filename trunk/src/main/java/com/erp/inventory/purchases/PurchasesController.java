package com.erp.inventory.purchases;

import com.erp.inventory.purchases.model.PurchasesData;
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

    private PurchasesService purchasesService ;
    @RequestMapping(method= RequestMethod.GET, value="createPurchaseData")

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


        public ModelAndView savePurchasesData(@RequestParam("PurchasesData") double price){
            System.out.println("price = " + price);
            PurchasesData purchasesData = new PurchasesData();
            ///PurchasesData.setPrice(purchasesData);
            purchasesService.save(purchasesData);

            return new ModelAndView("redirect:createPurchasesData");

    }
    }


