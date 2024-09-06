<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="<c:url value="/templates/css/style.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
	<form action="login" method="post">
		<h2><b>Tạo tài khoản mới</b></h2>
		<c:if test="${alert !=null}">
			<h3 class="alert alertdanger">${alert}</h3>
		</c:if>
		<section>
			<label class="input login-input">
				<div class="input-group">
					<span class="input-group-addon"><i class="fafa-user"></i></span>
					<input type="text" 
						placeholder="Tên Tài Khoản" 
						name="username" 
						class="form-control"
						required>
					<input type ="password"
						placeholder="Mật khẩu"
						name="password"
						class="form-control"
						required>
				</div>
			</label>
		</section>
	</form>
</body>
</html>