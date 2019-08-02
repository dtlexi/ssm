package com.lexi.ren.service.impl;

import com.lexi.ren.dao.IProductDao;
import com.lexi.ren.model.Product;
import com.lexi.ren.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductDao dao;

    public List<Product> findAll() {
        return dao.findAll();
    }
}
