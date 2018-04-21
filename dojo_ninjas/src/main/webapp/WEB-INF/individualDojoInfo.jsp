<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	    <h1><c:out value="${dojo.name}"/> Ninjas:</h1>
	    <ul>
	    		<c:forEach items="${dojo.ninjas}" var="ninja" varStatus ="loop">
	    		<li>${ninja.firstName} ${ninja.lastName} ${ninja.age}</li>
	    		</c:forEach>
	    </ul>
	    
	    
	    
	    <a href = "/dojo">Show all Dojos</a><br>
	    
	    
	    


</body>
</html>