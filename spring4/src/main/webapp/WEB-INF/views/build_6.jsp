<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zihua
  Date: 16-12-7
  Time: 下午11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PVN</title>
</head>
<body>
<p>第六步 ：低压侧设置</p>
<form:form method="POST" action="build_7">
    <table>
        <tr>
            <td>参数一：</td>
            <td><input type="text"/> </td>
            <td>参数一：</td>
            <td><input type="text"/> </td>
            <td>参数一：</td>
            <td><input type="text"/> </td>
        </tr>

        <tr>
            <td>参数二：</td>
            <td><input type="text"/> </td>
            <td>参数二：</td>
            <td><input type="text"/> </td>
            <td>参数二：</td>
            <td><input type="text"/> </td>
        </tr>

        <tr>
            <td>参数三：</td>
            <td><input type="text"/> </td>
            <td>参数三：</td>
            <td><input type="text"/> </td>
            <td>参数三：</td>
            <td><input type="text"/> </td>
        </tr>


        <tr>
            <td>参数四：</td>
            <td><input type="text"/> </td>
            <td>参数四：</td>
            <td><input type="text"/> </td>
            <td>参数四：</td>
            <td><input type="text"/> </td>
        </tr>

        <tr>
            <td colspan="4"><input type="submit" value="next"></td>
        </tr>

    </table>
</form:form>

</body>
</html>
