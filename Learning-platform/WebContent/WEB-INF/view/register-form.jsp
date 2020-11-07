<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<style>  
.error{color:red}  
</style>
</head>
<body>
<div align="center">
<h2>Registration</h2>
<br><br>
<form:form action="save" modelAttribute="regUser" method="post">

	<table>
	
		<tr><td><label>First name</label></td></tr>
		<tr>
			<td><form:input path="fname"/>
					<div><form:errors path="fname" cssClass="error"/></div><br>
			</td>
		</tr>
		
		<tr><td><label>Last name</label></td></tr>
		<tr>
			<td><form:input path="lname"/>
				<div><form:errors path="lname" cssClass="error"/></div><br>
			</td>
		</tr>
		
		<tr><td><label>E-mail</label></td></tr>
		<tr>
			<td><form:input path="email"/>
				<div><form:errors path="email" cssClass="error"/></div><br>
			</td>
		</tr>
		
		<tr><td><label>Username</label></td></tr>
		<tr>
			<td><form:input path="uname"/>
				<div><form:errors path="uname" cssClass="error"/></div><br>
			</td>
		</tr>
		
		<tr><td><label>Password</label></td></tr>
		<tr>
			<td><form:input type="password" path="psw"/>
				<div><form:errors path="psw" cssClass="error"/></div><br>
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center"><input type="submit" value="Register"/></td>
		</tr>
	</table>

</form:form>
</div>
</body>
</html>