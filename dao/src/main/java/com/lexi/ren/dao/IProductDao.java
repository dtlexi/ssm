package com.lexi.ren.dao;

import com.lexi.ren.model.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {
    @Select("select * from product")
    List<Product> findAll();
}
