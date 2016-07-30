<%@page language="java" contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Form Page</title>

</head>
<body>
<form action="../../form.do"  method="get">
	<table>
		<tr>
			<td>Name:</td>
			<td><input type="text" id="name" name="name"> </td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" id="password" name="password"> </td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" ></td>
		</tr>
	</table>
</form>
</body>
</html>