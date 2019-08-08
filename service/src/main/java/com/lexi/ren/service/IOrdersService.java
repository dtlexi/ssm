package com.lexi.ren.service;

import com.github.pagehelper.PageInfo;
import com.lexi.ren.model.Orders;

import java.util.List;

public interface IOrdersService {
    PageInfo<Orders> findAll(int index, int size);
    Orders findOneById(int orderId);
}
