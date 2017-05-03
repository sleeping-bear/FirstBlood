package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yijinsheng on 2017/5/3.
 */
@RequestMapping("/test")
@Controller
public class IndexController {
    @RequestMapping("/index")
    public ModelAndView login(){
        return new ModelAndView("index");
    }
}
