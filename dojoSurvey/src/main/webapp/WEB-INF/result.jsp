 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
   
    
     <h2>Submitted Info</h2>
	<ul>
		<li>Name: ${name}</li>
		<li>Dojo Location: ${location}</li>
		<li>Favorite Language: ${language}</li>
		<li>Comment: ${comment}</li>
	</ul>
	
	<button><a href="/">Go Back</a></button>
</body>
</html> 

