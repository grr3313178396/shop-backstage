package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2018/4/10.
 */
@Controller
public class IndexController {

   @RequestMapping("/")
    public String toIndex(){
       return "product";
   }
}
