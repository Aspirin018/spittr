<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liyu
  Date: 2017/7/27
  Time: 下午4:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>
</head>
<body>
    <h1>Welcome to Spittr</h1>
    <a href="<c:url value="/spittles"/> ">Spittles</a>
    <a href="<c:url value="/spitter/register"/> ">Register</a>
</body>
</html>
