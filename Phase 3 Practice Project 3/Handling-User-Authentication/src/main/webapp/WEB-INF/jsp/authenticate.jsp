<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentication Page</title>
</head>
<h2>Login Page</h2>
<body>
<h4>Welcome to the authentication page</h4>

<form:form action="Auth" method="post" commandName="login">
	Enter the username: <input name="username" id="username" type="text"  required/> <br><br>
	Enter the password: <input name="password" id="password" type="password"  required/> <br><br>
	<input type="submit" name="Submit"/>
</form:form>
</body>
</html>