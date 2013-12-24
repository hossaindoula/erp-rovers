package com.erp.inventory.items;

import com.erp.inventory.items.model.Category;
import com.erp.inventory.items.model.Product;
import com.erp.inventory.items.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/22/13
 * Time: 12:05 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/item/")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(method= RequestMethod.GET, value="createCategory")
    public ModelAndView createCategory(){
        return new ModelAndView("inventory/create_category");
    }

    @RequestMapping(method= RequestMethod.POST, value="saveCategory")
    public ModelAndView saveCategory(@RequestParam("categoryName") String categoryName){
        System.out.println("categoryName = " + categoryName);
        Category category = new Category();
        category.setCategoryName(categoryName);
        itemService.save(category);





        return new ModelAndView("redirect:/createCategory");
    }



    @Autowired
   // private ItemService itemService;

    @RequestMapping(method= RequestMethod.GET, value="createProduct")
    public ModelAndView createProduct(){
        return new ModelAndView("inventory/create_product");
    }

    @RequestMapping(method= RequestMethod.POST, value="saveProduct")
    public ModelAndView saveProduct(@RequestParam("productName") String productName){
        System.out.println("productName = " + productName);
        Product product = new Product();
        product.setProductName(productName);
        itemService.save(product);

        return new ModelAndView("redirect:/createProduct");
    }


}
