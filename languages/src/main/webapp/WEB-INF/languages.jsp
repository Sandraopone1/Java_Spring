
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
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
    
  
   <h1>Languages:</h1>
	 <table class="table" border= 2px>
		<tr align="left">
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</tr>
   
<c:forEach items="${languages}" var="i">
<tr>    
    		    <td><a href="/languages/${i.id}">${i.name}</a></td>
		    <td><c:out value="${i.creator}"/></td>
		    <td><c:out value="${i.version}"/></td>
		    <td> <a href="/languages/delete/${i.id}">delete</a> <a href="/languages/edit/${i.id}">edit</a>

    </tr>
</c:forEach> 
</table>

<br>
<br>

   <form:form method="POST" action="/languages" modelAttribute="language">
     <form:label path="name">Name
    <form:errors path="name"/>
   <form:input type="text" path="name"/>
   </form:label>
    
    <form:label path="creator">Creator
    <form:errors path="creator"/>
   <form:input type="text" path="creator"/></form:label>
 
    
    <form:label path="version">Version
    <form:errors path="version"/>     
    <form:input type="number" path="version"/></form:label>
    
    <input type="submit" value="Submit"/>
</form:form>
	
<%-- <c:forEach items="${languages}" var="language">
<tr>    
    <td><c:out value="${language.name}"/></td>
    <td><c:out value="${language.creator}"/></td>
    <td><c:out value="${language.version}"/></td>
    
    </tr>
</c:forEach>  --%>

  

	
</body>
</html> 