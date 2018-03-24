<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html >
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>登录用户</title>
</head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>


<body>
<form action="${pageContext.request.contextPath}/user/login.json" method="post">
  用户名：<input type="text" name="name"/> <br><br>
  密码：<input type="password" name="pwd"/> <br><br>
  <input type="submit" value="登录"/>
</form>
</body>
</html>