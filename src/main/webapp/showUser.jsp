<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
  function toregister() {
    $.ajax({
      url : 'http://127.0.0.1:8080/usercontroller/toregister.json',
      type : 'get',
      contentType : 'application/json; charset=utf-8',
      dataType : 'json',
    });
  }
</script>
<body>${user.name} 你好！！！

<input type="button" id="reg" value="注册" onclick="toregister()"
       style="height: 40px; height: 30px;">

</body>
</html>