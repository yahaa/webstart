<%@ taglib prefix="st" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zihua
  Date: 16-12-7
  Time: 下午11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PVN</title>
    <link rel="shortcut icon" href="/image/Sniper-Elite-2.ico"/>
</head>
<body>
<p>光伏中心</p>

<form:form method="POST" action="check">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input tyep="text" name="password"/></td>
        </tr>
        <tr >
            <td><button type="button" onclick="location.href='register'">提交</button></td>
        </tr>
    </table>

</form:form>
<p>${message}</p>


</body>
</html>
