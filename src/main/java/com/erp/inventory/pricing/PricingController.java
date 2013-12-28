package com.erp.inventory.pricing;

import com.erp.inventory.items.model.Category;
import com.erp.inventory.pricing.purchases.model.Prices;
import com.erp.inventory.pricing.purchases.service.PriceService;
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
 * Date: 12/26/13
 * Time: 11:55 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/pricing/")
public class PricingController {

    @Autowired
    private PriceService priceService;

    @RequestMapping(method= RequestMethod.GET, value="createPrice")
    public ModelAndView createPrice(){
        HashMap<String, Object> pricingModel = new HashMap<String, Object>();
        pricingModel.put("PageTitle", "Pricing");
        pricingModel.put("PageLink", "Pricing");
        pricingModel.put("Title", "Pricing");
        pricingModel.put("templateType", "Pricing");
        pricingModel.put("companyCopyRightText", ERPConstants.COMPANY_COPYRIGHT_TEXT);
        pricingModel.put("company", ERPConstants.COMPANY);

        return new ModelAndView("inventory/create_price", pricingModel);
    }

    @RequestMapping(method= RequestMethod.POST, value="savePrice")
    public ModelAndView savePrice(@RequestParam("price") double price){
        System.out.println("price = " + price);
        Prices prices = new Prices();
        prices.setPrice(price);
        priceService.save(prices);

        return new ModelAndView("redirect:createPrice");
    }
}