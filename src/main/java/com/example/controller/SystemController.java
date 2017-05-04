package com.example.controller;

import com.example.common.Response;
import com.example.common.ResultCode;
import com.example.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yijinsheng on 2017/5/4.
 */
@RequestMapping("system")
@RestController
public class SystemController {
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public Response<String> login(@RequestBody User user) {
        return new Response<String>(ResultCode.SUCCESS, null);
    }
}
