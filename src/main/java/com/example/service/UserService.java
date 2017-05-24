package com.example.service;


import com.example.model.User;

/**
 * Created by yijinsheng on 2017/5/4.
 */
public interface UserService {
    User getUser(String userName, String password);
}
