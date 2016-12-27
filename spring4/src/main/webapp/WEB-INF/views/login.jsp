<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zihua
  Date: 16-12-22
  Time: 下午9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>这是登录界面</h1>
<form:form method="POST" ACTION="/person/check">
    <table>
        <tr>
            <td>id :</td>
            <td><input type="text" name="id"/></td>
        </tr>
        <tr>
            <td>name :</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td><input type="submit"/></td>
        </tr>
    </table>
</form:form>
<a href="/">返回主页</a>
</body>
</html>
