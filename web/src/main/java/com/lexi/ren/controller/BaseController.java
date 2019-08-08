package com.lexi.ren.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;

public class BaseController {

    @Autowired
    private HttpServletRequest request;

    protected ModelAndView MV=new ModelAndView();

}
