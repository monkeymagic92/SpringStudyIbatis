<%--
  Created by IntelliJ IDEA.
  User: Jaee
Date: 2021-05-16
Time: 오후 2:05
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${list}" var="item">
    <div>${item.i_user}</div>
    <div>${item.user_id}</div>
    <div>${item.user_pw}</div>
</c:forEach>


<button type="button" onclick="moveToJoin()">회원가입</button>

<script>
    function moveToJoin() {
        location.href="/user/join.do";
    }
</script>
</body>
</html>
