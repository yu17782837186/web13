<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2019/11/5
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>欢迎登录图书馆后台信息管理系统界面</title>
  <link href="css/style.css" rel="stylesheet" type="text/css" />
  <script language="JavaScript" src="js/jquery.js"></script>
  <script src="js/cloud.js" type="text/javascript"></script>

  <script language="javascript">
      $(function(){
          $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
          $(window).resize(function(){
              $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
          })
      });
  </script>

</head>

<body style="background-color:#df7611; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">



<div id="mainBody">
  <div id="cloud1" class="cloud"></div>
  <div id="cloud2" class="cloud"></div>
</div>


<div class="logintop">
  <span>欢迎登录图书馆后台信息管理系统界面</span>
</div>

<div class="loginbody">

  <span class="systemlogo"></span>

  <div class="loginbox loginbox2">
    <form action="user" method="post">
      <input type="hidden" name="oper" value="login"/>
    <ul>
      <li><input name="uname" type="text" placeholder="用户名" class="loginuser" /></li>
      <li><input name="pwd" type="text" placeholder="密码" class="loginpwd" /></li>
      <li class="yzm">
        <span><input name="" type="text" value="验证码" onclick="JavaScript:this.value=''"/></span><cite>X3D5S</cite>
      </li>
      <li><input name="" type="submit" class="loginbtn" value="登录"  onclick="javascript:window.location='main.html'"  /><label><input name="" type="checkbox" value="" checked="checked" />记住密码</label><label><a href="#">忘记密码？</a></label></li>
    </ul>
    </form>
  </div>
</div>

</body>
</html>