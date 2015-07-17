<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">


<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container" align="center" border-style="solid">
		<div class="jumbotron">
			<h1>MTaaS - using Openstack</h1>
		</div>		
		<form action="LoginController" method="post" align="center">
			<b>Enter username</b> : <input type="text" name="username"> <BR>
			<br>
			<b>Enter password</b> : <input type="password" name="password"> <BR>
			<br>
			<br>
			<button type="submit" class="btn btn-info">Login To Test</button>
		</form>
	</div>
</body>
</html>