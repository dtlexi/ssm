package com.lexi.ren.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    public PageInfo<Product> findAll(int page, int size) {
        //获取第1页，10条内容，默认查询总数count
        PageHelper.startPage(page, size);
        //紧跟着的第一个select方法会被分页
        List<Product> list= dao.findAll();
        //初始化一个PageInfo对象，并且传入list,这样就直接分页了
        return new PageInfo<Product>(list);
    }

    public int save(Product product) {
        return dao.save(product);
    }
}
