package com.jk.controller;

import com.jk.model.Tree;
import com.jk.service.ITreeService;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2018/4/8.
 */
@Controller
@RequestMapping("tree")
public class TreeController extends BaseController{

    @Autowired
    private ITreeService treeService;

    @RequestMapping("/queryTreeList")
    @ResponseBody
    public void queryTreeList(HttpServletResponse response){
        List<Tree> treeList = treeService.queryTreeList();
        super.writeJson(treeList,response);
    }

/*  静态化测试
    @RequestMapping("/toindex")
    public String toindex(){
        return "product";
    }
*/
}
