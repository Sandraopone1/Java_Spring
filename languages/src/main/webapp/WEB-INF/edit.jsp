<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<h3>Name: <c:out value="${language.name}"/></h3>
	<h3>Creator: <c:out value="${language.creator}"/></h3>
	<h3>Version: <c:out value="${language.version}"/></h3>
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   <form:form method="POST" action="/languages/update/${language.id}" modelAttribute="language">
   <form:hidden path="id"/>
  <%--  <form:hidden path="id"/> --%>
     <form:label path="name">Name
    <form:errors path="name"/>
    <form:input path="name"/></form:label>
    
    <form:label path="creator">Creator
    <form:errors path="creator"/>
    <form:textarea path="creator"/></form:label>
 
    
    <form:label path="version">Version
    <form:errors path="version"/>     
    <form:input type="version" path="version"/></form:label>
    
    <input type="submit" value="Submit"/>
</form:form>
	<a href="/languages">Back</a>
</body>
</html> 