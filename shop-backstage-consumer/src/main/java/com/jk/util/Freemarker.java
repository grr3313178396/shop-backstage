/*
package com.jk.util;

import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.core.Environment;
import freemarker.template.ObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

@Component("indexLinkTag")
public class IndexLinkTag implements TemplateDirectiveModel {

    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;
    @Autowired
    private UserService userService;
     */
/*
     *@param env 系统环境变量，通常用它来输出相关内容，如Writer out = env.getOut();
     *@param loopVars  循环替代变量
     *@param body 用于处理自定义标签中的内容，如<@myDirective>将要被处理的内容</@myDirective>；当标签是<@myDirective />格式时，body=null
     *//*

    @Override
    public void execute(Environment env, Map params, TemplateModel[] loopVars,
            TemplateDirectiveBody body) throws TemplateException, IOException {
        try {
            String countval = String.valueOf(params.get("userId"));
            int userId = Integer.parseInt(countval);
            User user =userService.findByKey(userId);
            ArrayList<String> list = new ArrayList<String>();
            list.add(user.getUserName());
            if (body != null) {
                TemplateModel sourceVariable = env.getVariable("indexLinkTagList");
                env.setVariable("indexLinkTagList", ObjectWrapper.BEANS_WRAPPER.wrap(list));

                body.render(env.getOut());
                env.setVariable("indexLinkTagList", sourceVariable);
            } 

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}*/
