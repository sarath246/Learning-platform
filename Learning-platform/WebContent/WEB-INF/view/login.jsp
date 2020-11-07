<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>  
.error{color:red}  
</style>
</head>
<body>
<div align="center">
<h2>Login Now</h2>
<br><br>
${message }
<form:form action="loginAction" modelAttribute="login" method="post">


<form:errors path="email" cssClass="error"></form:errors>
	<table>
	
			
			<tr>
				<td><label>E-mail</label></td>
			</tr>
			<tr>
				<td><form:input path="email" />
					<div><form:errors path="email" cssClass="error"></form:errors></div>
				</td>
				
			</tr>
			
			
				<tr><td><label>Password</label></td></tr>
				<tr>
					<td>
					<form:input path="psw" />
					<div><form:errors path="psw" cssClass="error"></form:errors></div>
					</td>
				</tr>
				
				<tr>
				<td colspan="2" align="center"><input type="submit" value="Login"/></td>
				</tr>
				
</table>
</form:form>
</div>
</body>
</html>