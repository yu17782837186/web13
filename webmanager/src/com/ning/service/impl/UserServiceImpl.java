package com.ning.service.impl;

import com.ning.dao.UserDao;
import com.ning.dao.impl.UserDaoImpl;
import com.ning.pojo.User;
import com.ning.service.UserService;

public class UserServiceImpl implements UserService {
    //声明dao层对象
    UserDao ud = new UserDaoImpl();
    //用户登录
    @Override
    public User checkUserLoginService(String uname, String pwd) {
        return ud.checkUserLoginDao(uname,pwd);
    }
}
