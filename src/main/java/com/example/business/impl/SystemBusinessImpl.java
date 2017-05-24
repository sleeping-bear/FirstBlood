package com.example.business.impl;

import com.example.business.SystemBusiness;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by yijinsheng on 2017/5/24.
 */
@Component
public class SystemBusinessImpl implements SystemBusiness {
    @Autowired
    private UserService userService;

    public User getUser(String userName, String passWord) {
        return userService.getUser(userName, passWord);
    }
}
