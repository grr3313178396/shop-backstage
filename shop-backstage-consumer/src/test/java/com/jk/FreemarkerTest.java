package com.jk;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2018/4/10.
 */
public class FreemarkerTest {
    public static void main(String[] args) throws IOException, TemplateException {
        //创建free marker实例
        Configuration cfg=new Configuration();
        cfg.setDirectoryForTemplateLoading(new File("F:\\ideaworkspace\\shop-backstage\\shop-backstage-consumer\\src\\main\\resources\\templates"));
        //创建数据模型
        Map root = new HashMap();
        root.put("products", "老高");

        //加载模板文件
        Template t1 = cfg.getTemplate("product.ftl");

        //显示生成的数据,//将合并后的数据打印到控制台
        Writer out = new OutputStreamWriter(System.out);
        t1.process(root, out);
        out.flush();
    }
}
