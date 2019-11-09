package com.ning.dao.impl;

import com.ning.dao.UserDao;
import com.ning.pojo.User;

import java.sql.*;

public class UserDaoImpl implements UserDao {
    //根据用户名和密码查询用户信息
    @Override
    public User checkUserLoginDao(String uname, String pwd) {
        //声明jdbc对象
        Connection coon = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        //声明变量
        User user = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            coon = DriverManager.getConnection("jdbc:mysql://localhost:3306/web","root","123456");
            //创建sql命令
            String sql = "select * from t_user2 where uname = ? and pwd = ?";
            //创建sql命令对象
            ps = coon.prepareStatement(sql);
            //给占位符赋值
            ps.setString(1,uname);
            ps.setString(2,pwd);
            //执行sql
            rs = ps.executeQuery();
            //遍历结果
            while (rs.next()) {
                //给变量赋值
                user = new User();
                user.setUid(rs.getInt("uid"));
                user.setUname(rs.getString("uname"));
                user.setPwd(rs.getString("pwd"));
                user.setSex(rs.getString("sex"));
                user.setAge(rs.getInt("age"));
                user.setBirth(rs.getString("birth"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (ps != null){
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (coon != null){
                    coon.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //返回结果
        return user;
    }
}
