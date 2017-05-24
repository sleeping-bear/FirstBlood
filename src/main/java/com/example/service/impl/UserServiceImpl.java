package com.example.service.impl;

import com.example.mapper.UserMapper;
import com.example.model.User;
import com.example.model.UserExample;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yijinsheng on 2017/5/4.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(String userName, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(userName).andPassWordEqualTo(password);
        List<User> user = userMapper.selectByExample(userExample);
        return user.size() > 0 ? user.get(0) : null;
    }
}
