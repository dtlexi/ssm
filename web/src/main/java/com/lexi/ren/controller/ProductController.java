package com.lexi.ren.controller;

import com.github.pagehelper.PageInfo;
import com.lexi.ren.model.Product;
import com.lexi.ren.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @RequestMapping("/find/{page}/{size}.do")
    public ModelAndView findAll(@PathVariable(value = "page",required = true) Integer page, @PathVariable("size") Integer size)
    {
        ModelAndView mv = new ModelAndView();
        PageInfo<Product> pageInfo = productService.findAll(page,size);

        System.out.println(pageInfo.getPageNum());

        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("product-list");
        return mv;
    }

    @RequestMapping("/add.do")
    public ModelAndView add()
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("product-add");
        return mv;
    }

    @RequestMapping("/save.do")
    public String save(Product product) {
        productService.save(product);
        return "redirect:find/1/2.do";
    }
}
