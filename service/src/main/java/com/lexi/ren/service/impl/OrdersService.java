package com.lexi.ren.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lexi.ren.dao.IOrdersDao;
import com.lexi.ren.model.Orders;
import com.lexi.ren.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService implements IOrdersService {
    @Autowired
    private IOrdersDao dao;

    public PageInfo<Orders> findAll(int page,int size) {
        PageHelper.startPage(page, size);
        List<Orders> list= dao.findAll();
        return new PageInfo<Orders>(list);
    }

    public Orders findOneById(int orderId) {
        return dao.findOneById(orderId);
    }
}
