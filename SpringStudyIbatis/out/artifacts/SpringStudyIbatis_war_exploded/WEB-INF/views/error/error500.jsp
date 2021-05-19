<%--
  Created by IntelliJ IDEA.
  User: Jaee
  Date: 2021-05-17
  Time: 오후 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    500 에러 페이지
    <button type="button" onclick="moveToLogin()">로그인창으로 가기</button>

<script>
    function moveToLogin() {
        location.href="/user/login.do";
    }
</script>
</body>
</html>
