<%@page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>User List</title>

</head>
<body>
	<table>
		<tr>
			<td>姓名</td>
			<td>年龄</td>
			<td>性别</td>
			<td>住址</td>
		</tr>
		<c:forEach items="${userList}"  var="everyuser">
			<tr>
				<td>${everyuser.name}</td>
				<td>${everyuser.age}</td>
				<td>${everyuser.sex}</td>
				<td>${everyuser.address}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="../userManagement/addUser">添加用户</a>
</body>
</html>