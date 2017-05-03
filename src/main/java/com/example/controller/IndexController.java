package com.example.controller;

import com.example.mapper.TestMapper;
import com.sun.istack.internal.Interned;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yijinsheng on 2017/5/3.
 */
@RequestMapping("/test")
@Controller
public class IndexController {
    private static final Logger log = Logger.getLogger(IndexController.class);
    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/index")
    public ModelAndView login() {
        log.info("asdfasdf");
        log.info(testMapper.selectByPrimaryKey(1) + "hello");
        return new ModelAndView("index");
    }
}