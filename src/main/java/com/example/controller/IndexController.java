package com.example.controller;

import org.apache.log4j.Logger;
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

    @RequestMapping("/index")
    public ModelAndView login() {

        log.info("asdfasdf");
        return new ModelAndView("index");
    }

    public static void main(String[] args) {
        System.out.println(111);
    }
}
