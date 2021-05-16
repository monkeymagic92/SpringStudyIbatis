<%--
  Created by IntelliJ IDEA.
  User: Jaee
  Date: 2021-05-16
  Time: 오후 7:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${path}/css/user/userJoin.css">
</head>
<body>
<div class="container">
    <form id="frm" action ="/user/join.do" method="post">
        <div class="frmContainer">
            <input type="text" id="joinId" name="user_id" placeholder="Id 입력"><br>
            <input type="password" id="joinPw1" name="user_pw" placeholder="password 입력"><br>
            <input type="password" id="joinPw2" name="user_pw2" placeholder="password 재입력"><br>
            <select id="com_dcd" name="com_dcd">
                <option value="A">A</option>
                <option value="B">B</option>
                <option value="C">C</option>
                <option value="M">M</option>
            </select>
            <br>
            <input type="submit" id="submitBtn" value="확인">
        </div>
    </form>
</div>

<script>



</script>
</body>
</html>
