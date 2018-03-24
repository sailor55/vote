<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script>
  function register() {
    var name = $("#username").val();
    var pwd = $("#password").val();
    var user = {"name":name,"pwd":pwd};
    $.ajax({
      url : 'http://127.0.0.1:8080/usercontroller/register.json?time=' + new Date().getTime(),
      type : 'POST',
      data : JSON.stringify(user),
      contentType : 'application/json',
      dataType : 'json',
      success: function (result) {
        alert(11);
      }

    });
  }
</script>

<body>

<input type="text" id="username"
       style="width: 100px; height: 30px; font-size: 20px; font-weight: bold;">
<input type="password" id="password"
       style="width: 100px; height: 30px; font-size: 20px; font-weight: bold;">
<input type="button" id="reg" value="注册" onclick="register()" style="height: 40px; height: 30px;">

</body>
</html>