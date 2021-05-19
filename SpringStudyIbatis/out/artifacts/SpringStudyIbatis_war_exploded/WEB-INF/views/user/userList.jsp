<%--
  Created by IntelliJ IDEA.
  User: Jaee
  Date: 2021-05-19
  Time: 오후 1:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>유저리스트</h1>
    <br>
    <c:forEach items="${list}" var="item">
        <div>${item.i_user}</div>
        <div>${item.user_id}</div>
        <div>${item.user_pw}</div>
    </c:forEach>
</body>
</html>
