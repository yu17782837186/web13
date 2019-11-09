package com.ning.service;

import com.ning.pojo.User;

public interface UserService {
    //校验用户登录 用户名 密码 返回查询到的用户信息
    User checkUserLoginService(String uname,String pwd);
}
