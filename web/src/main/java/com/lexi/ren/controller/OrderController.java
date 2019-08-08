package com.lexi.ren.controller;

import com.github.pagehelper.PageInfo;
import com.lexi.ren.model.Orders;
import com.lexi.ren.service.IOrdersService;
import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController extends BaseController {
    @Autowired
    private IOrdersService service;

    @RequestMapping("/find/{page}/{size}.do")
    public ModelAndView findAll(@PathVariable("page") int page,@PathVariable("size") int size) {
        PageInfo<Orders> list=service.findAll(page,size);
        MV.addObject("pageInfo",list);
        MV.setViewName("orders-list");
        return MV;
    }
    @RequestMapping("/find/{orderId}.do")
    public ModelAndView findOneById(@PathVariable("orderId") int orderId)
    {
        MV.addObject("orders",service.findOneById(orderId));
        MV.setViewName("orders-show");
        return MV;
    }
}
