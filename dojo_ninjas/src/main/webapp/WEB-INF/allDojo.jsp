<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show All</title>
</head>
<body>
	<h1>All the Dojos:</h1>
	
	

	
	<c:forEach items="${dojos}" var="dojo" varStatus ="loop">
	     
	<a href= "/dojo/${dojo.id}"><c:out value="${dojo.name}"/></a><br>
	  
	</c:forEach><br>
	

	<a href = "/dojo/new">Add a Dojo</a><br><br>
	<a href = "/ninjas/new">Create a New Ninja</a>
</body>
</html>