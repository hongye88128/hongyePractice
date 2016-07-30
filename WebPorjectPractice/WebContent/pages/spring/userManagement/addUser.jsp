<%@page language="java" contentType="text/html; charset=utf-8"%>

<html>
<head>
<title>Add User</title>

</head>
<body>
	<form action="../userManagement/addUser" method="post">
		姓名：<input type="text" id="name" name="name"><br>
		年龄：<input type="text" id="age" name="age"><br>
		性别：<input type="text" id="sex" name="sex"><br>
		住址：<input type="text" id="address" name="address"><br>
		<input type="submit" value="添加用户"> 
	</form>
</body>
</html>