<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  
  <link rel="stylesheet" href="../css/styles.css" type="text/css"/>
  	
<title>Login</title>

</head>
<body>
<div align="center">
<h2>Login Now</h2>
<br><br>
${message }



	<br><br><br><br>
	
	
	<div class="container">
  
  		<form:form action="loginAction" modelAttribute="login" method="post">
    
    
    		<div class="form-group">  
      			<div style="width: 250px;" align="left"><label for="email">Email:</label></div>
     			<div style="width: 250px;"><form:input path="email" class="form-control" placeholder="Enter email"/></div>
     			<div style="width: 250px; text-align: left;"><form:errors path="email" cssClass="error"></form:errors></div>
    		</div>
    		
    		<div class="form-group">
      			<div style="width: 250px;" align="left"><label for="pwd">Password:</label></div>
      			<div style="width: 250px;"><form:input path="psw" class="form-control" placeholder="Enter password"/></div>
      			<div style="width: 250px; text-align: left;"><form:errors path="psw" type="password" cssClass="error"></form:errors></div>
    		</div>
    		
    		<button type="submit" style="width: 250px;" class="btn btn-primary">Login</button>
    		
  		</form:form>
  
	</div>


</div>
</body>
</html>