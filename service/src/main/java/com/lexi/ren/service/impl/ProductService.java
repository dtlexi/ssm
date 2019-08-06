package com.lexi.ren.service.impl;

import com.lexi.ren.dao.IProductDao;
import com.lexi.ren.model.Product;
import com.lexi.ren.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService implements IProductService {

    @Autowired
    private IProductDao dao;

    public List<Product> findAll(int page, int size) {
        int start = (page - 1) * size + 1;
        return dao.findAll(start, size);
    }

    public int save(Product product) {
        return dao.save(product);
    }
}
