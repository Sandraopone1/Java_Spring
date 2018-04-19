
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
   
    
    <form action="/process" method="post" >
		Your name: <input type="text" name="name"><br>
		Dojo Location:
		<select name="location">
			<option value="dc">DC</option>
			<option value="california">California</option>
			<option value="Washington">Washington</option>
		</select><br>
		Favorite Language: 
		<select name="language">
			<option value="java">Java</option>
			<option value="python">Python</option>
			<option value="javascript">Javascript</option>
		</select><br>
		Comment (optional):<br>
		<textarea rows="4" cols="50" name="comment">
		</textarea><br><br>
		<input type="submit">
	
	
	</form>
</body>
</html> 