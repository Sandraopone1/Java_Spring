<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Ninja</title>
</head>
<body>
<h1>New Ninja:</h1>
<form:form action = "/ninjas/new"  method = "POST" modelAttribute = "ninja">

	<form:label path = "dojo"> Dojo :
		<form:select path = "dojo">
			<c:forEach items = "${dojo}" var= "dojo">
			<form:option value="${dojo.id}">${dojo.name}</form:option>
			</c:forEach>
		</form:select>
		
	</form:label>
	
	<form:label path = "firstName" > First Name:
		<form:errors path = "firstName"></form:errors>
		<form:input path = "firstName"></form:input>
	</form:label>
	<form:label path = "lastName" > Last Name:
		<form:errors path = "lastName"></form:errors>
		<form:input path = "lastName"></form:input>
	</form:label>
	<form:label path = "age" > Age:
		<form:errors path = "age"></form:errors>
		<form:input path = "age"></form:input>
	</form:label>
	<input type = "submit" value = "Create Ninja">
</form:form> 
 
</body>
</html>