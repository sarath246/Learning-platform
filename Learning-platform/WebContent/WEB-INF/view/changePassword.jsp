<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
<style type="text/css">
.error{color: red}
</style>
</head>
<body>
<div align="center">
<h2>Change Password</h2>
<br><br>

<form:form action="changed" modelAttribute="changePsw" method="post">

	
	<div>
			<div>
			<label>Current Password</label>
			<form:input path="psw"/>
			</div>
			<div><form:errors path="psw" cssClass="error"></form:errors></div>
			<br><br>
			
			<div>
			<label>New Password</label>
			<form:input path="newPsw"/>			
			</div>
			<div><form:errors path="newPsw" cssClass="error"></form:errors></div>
			<br><br>
			
			<div>
			<label>Confirm Password</label>
			<form:input path="confirmPsw"/>
			</div>
			<form:errors path="confirmPsw" cssClass="error"></form:errors>
			<br><br>
			
			<input type="submit" value="Change">
	</div>

</form:form>

</div>
</body>
</html>