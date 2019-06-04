<%--
  Created by IntelliJ IDEA.
  User: dengcl
  Date: 2017/6/22
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生信息</title>
</head>
<body>
<%--<h1>学生信息</h1>--%>
<table width="100%">
    <caption>所有学生信息</caption>
    <thead>
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>手机</th>
        <th>地址</th>
        <th>入学时间</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${requestScope.students}" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.stuName}</td>
            <td>${stu.stuAge}</td>
            <td>${stu.mobile}</td>
            <td>${stu.address}</td>
            <td>${stu.entranceTime}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>