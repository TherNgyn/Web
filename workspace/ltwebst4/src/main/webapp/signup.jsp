<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body>
	<form action ="signupAction.jsp" method="POST" >
		<div><input type ="text" name="name"></div>
		<div><input type =ư5"email" name="email"></div>
		<div><input type = "number" name="phone"></div>
		<div><input type ="password" name="password"></div> 
		<input type = "submit" value="Đăng ký">
	</form>
	<div>
		<a href="login.jsp">Đăng nhập</a>
	</div>
</body>
</html>