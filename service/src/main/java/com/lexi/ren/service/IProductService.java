package com.lexi.ren.service;

import com.lexi.ren.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll(int page,int size);
    int save(Product product);
}
