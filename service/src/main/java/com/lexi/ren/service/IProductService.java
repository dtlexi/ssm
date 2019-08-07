package com.lexi.ren.service;

import com.github.pagehelper.PageInfo;
import com.lexi.ren.model.Product;

import java.util.List;

public interface IProductService {
    PageInfo<Product> findAll(int page, int size);
    int save(Product product);
}
