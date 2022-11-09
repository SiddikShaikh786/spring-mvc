<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
<h1>Help Page</h1>
<%
/* String name=(String) request.getAttribute("name");
Integer id=(Integer) request.getAttribute("ID");
 LocalDateTime time= (LocalDateTime) request.getAttribute("time");
  */
 %>
<table>
<tr>
<th>Name</th>
<th>ID</th>
<th>time</th>

</tr>
<tr>
<td><%-- <%=name %>  --%> ${name }</td>
<td><%-- <%=id %> --%> ${ID }</td>
<td> <%-- <%= time.toString()%> --%></td>
</tr>
</table>
<hr>
<c:forEach var="item" items="${number }">
 <h1>${item }</h1>
</c:forEach>
</body>
</html>