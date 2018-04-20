
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
   
   
    
 <!--   <table class="table" border= 2px> -->

   
    <p>Name: "${language.name}"/> </p>
     <p>creator: "${language.creator}"/> </p>
     <p>version: "${language.version}"/> </p>
    
   
    
   
<!-- <a href="/languages">Back</a> -->
	<a href="/languages/edit/${language.id}">Edit</a>
	<a href="/languages/${language.id}">Delete</a>
</body>
</html> 