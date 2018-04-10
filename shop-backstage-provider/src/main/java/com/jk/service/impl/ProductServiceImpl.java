package com.jk.service.impl;

import com.jk.dao.ProductMapper;
import com.jk.model.Product;
import com.jk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018/4/9.
 */
@Service("productService")
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductMapper productMapper;

    public List<Product> productList(Product product){
        List<Product> products = productMapper.productList(product);
        return products;
    }
}
