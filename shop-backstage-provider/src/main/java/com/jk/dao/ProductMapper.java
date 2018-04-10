package com.jk.dao;

import com.jk.model.Product;
import java.math.BigDecimal;
import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Product record);

    int insertSelective(Product record);

  /*  Product selectByPrimaryKey(BigDecimal id);*/

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKeyWithBLOBs(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> productList(Product product);
}