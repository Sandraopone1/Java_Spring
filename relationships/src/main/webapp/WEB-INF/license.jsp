<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New License</title>
</head>
<body>
<h1>New License:</h1>
<form:form action = "/license/new" method = "POST" modelAttribute = "license">
	<form:label path = "person" > Person:
	<form:select path = "person">
			<c:forEach items = "${persons}" var = "per">
			<form:option value="${per.id}"> ${per.firstName} ${per.lastName}</form:option>
			</c:forEach>
		</form:select><br><br>
		 </form:label>
	
		<form:label path="state">State
		    <form:errors path="state"/>
		    <form:input path="state"/>
		     </form:label><br><br>
	 <form:input type="date" path="expiration_date"></form:input>
	
	<input type = "submit" value = "Create">
</form:form> 
 
</body>
</html>