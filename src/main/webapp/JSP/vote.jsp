<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html >
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<%--<script>--%>
<%--function vote() {--%>
<%--var userName = $("#username").val();--%>
<%--var fightTime = $("#fightTime").val();--%>
<%--var vote = {"userName": userName, "fightTime": fightTime};--%>
<%--$.ajax({--%>
<%--url: 'http://127.0.0.1:8080/vote/submit.json?time=' + new Date().getTime(),--%>
<%--type : 'POST',--%>
<%--data: JSON.stringify(vote),--%>
<%--contentType : 'application/json',--%>
<%--dataType : 'json',--%>
<%--success: function (result) {--%>
<%--alert('投票成功');--%>
<%--}--%>

<%--});--%>
<%--}--%>
<%--</script>--%>

<body>

<form action="${pageContext.request.contextPath}/vote/submit.json" method="post">
  姓名：<input type="text" name="userName"/> <br><br>
  战斗时间：<input type="text" name="fightTime"/> <br><br>
  日期1<input type="date" name="1" id="1"/>
  日期2<<input type="datetime-local" name="2" id="2">
  <input type="submit" value="提交"/>
</form>
<table border="1" cellpadding="10" cellspacing="0">
  <tr>
    <th>姓名</th>
    <th>战斗时间</th>
    <th>投票时间</th>
  </tr>

  <c:forEach items="${voteList}" var="vote">
    <tr>
      <td>${vote.userName}</td>
      <td>${vote.fightTime}</td>
      <td>${vote.createTime}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>