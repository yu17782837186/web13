package com.ning.servlet;

import com.ning.pojo.User;
import com.ning.service.UserService;
import com.ning.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求编码格式
        request.setCharacterEncoding("utf-8");
        //设置响应编码格式
        response.setContentType("text/html;charset=utf-8");
        //获取操作符
        String oper = request.getParameter("oper");
        if ("login".equals(oper)){
            //调用登录处理方法
            checkUserLogin(request,response);
        }else if ("req".equals(oper)){
            //调用注册功能
        }else {
            System.out.println("没有找到对应的操作符："+oper);
        }
    }

    //处理登录
    private void checkUserLogin(HttpServletRequest request, HttpServletResponse response) {
        //获取请求信息
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        System.out.println(uname+":"+pwd);
        //处理请求信息
        //获取service层对象
        UserService us = new UserServiceImpl();
        //校验
        User user = us.checkUserLoginService(uname,pwd);
        System.out.println(user);
        //响应处理结果
        //直接响应
        //请求转发
        ///重定向
    }
}
