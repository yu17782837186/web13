package com.ning.dao;

import com.ning.pojo.User;

public interface UserDao {
    //根据用户名和密码查询用户信息 用户名 密码 返回查询到的用户信息
    User checkUserLoginDao(String uname,String pwd);
}
