<%@page language="java" contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Json Test</title>
</head>
<body>
	<h2>在 JavaScript 中创建 JSON 对象</h2>
	<p>
		Name: <span id="jname"></span><br /> Age: <span id="jage"></span><br />
		Address: <span id="jstreet"></span><br /> Phone: <span id="jphone"></span><br />
	</p>

	<script type="text/javascript">
		var JsonObject = [ {
			'Name' : '张三',
			'Age' : '20',
			'Address' : '西二旗',
			'Phone' : '123456'
		}, {
			'Name' : '李四',
			'Age' : '25',
			'Address' : '西三旗',
			'Phone' : '654321'
		} ]
		document.getElementById('jname').innerHTML = JsonObject[0].Name;
		document.getElementById('jage').innerHTML = JsonObject[0].Age;
		document.getElementById('jstreet').innerHTML = JsonObject[1].Address;
		document.getElementById('jphone').innerHTML = JsonObject[1].Phone;
	</script>
</body>
</html>
<!-- 
JSON 语法是 JavaScript 对象表示法语法的子集。

    数据在名称/值对中
    数据由逗号分隔
    花括号保存对象
    方括号保存数组
 -->