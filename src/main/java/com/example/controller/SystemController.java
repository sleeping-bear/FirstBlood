package com.example.controller;

import com.example.business.SystemBusiness;
import com.example.common.Constants;
import com.example.common.Response;
import com.example.common.ResultCode;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by yijinsheng on 2017/5/4.
 */
@RequestMapping("system")
@RestController
public class SystemController {
    @Autowired
    private SystemBusiness systemBusiness;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Response<String> login(HttpSession session, @RequestBody User user) {
        User sysUser = systemBusiness.getUser(user.getUserName(), user.getPassWord());
        if (sysUser != null) {
            session.setAttribute(Constants.SESSION_USER, user);
            return new Response<String>(ResultCode.SUCCESS, null);
        } else {
            return new Response<String>(ResultCode.SUCCESS, null);
        }
    }
}
