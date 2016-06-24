<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function callservlet() {
		document.getElementsByName('fetchdata').submit();
		alert("Entered Sucessfully!");
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/HelloWorld" method="POST">
		<h1>Enter your details</h1>
		Name: <input type="text" name="name"><br> Age : <input
			type="text" name="age"><br> Experience:<input
			type="text" name="exp"><br>
		<button type="submit" name="fetchdata" value="click to get data"
			onclick="callservlet()">Submit</button>
	</form>
</body>
</html>