<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<h1>This is Home page</h1>
<h1>Called by Home controller</h1>
<h1>url  /home </h1>
<% String name= (String) request.getAttribute("name"); 
Integer number=(Integer) request.getAttribute("roll");
Boolean isTrue= (Boolean)request.getAttribute("isTrue");
out.println(name);
out.println("Roll number is "+number);

%>
<h1>Name is <%=name%></h1>
<h1> isFalse <%=isTrue %></h1>
</body>
</html>