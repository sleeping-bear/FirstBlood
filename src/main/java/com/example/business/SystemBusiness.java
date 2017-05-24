package com.example.business;

import com.example.model.User;

/**
 * Created by yijinsheng on 2017/5/24.
 */

public interface SystemBusiness {
    User getUser(String userName,String passWord);
}
