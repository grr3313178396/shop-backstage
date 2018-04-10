package com.jk.controller;

import com.jk.model.Product;
import com.jk.service.ProductService;
import org.opensaml.xmlsec.encryption.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by admin on 2018/4/9.
 */
@Controller
@RequestMapping("/productController")
public class ProductController extends BaseController{
    @Autowired
    private ProductService productService;

    @RequestMapping("/productList")
    public String toproductList(Product product,ModelMap map){
        List<Product> products = productService.productList(product);
        map.put("products",products);
        return "productList";
    }

}
