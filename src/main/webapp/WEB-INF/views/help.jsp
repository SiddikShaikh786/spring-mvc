<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
<h1>Help Page</h1>
<%
String name=(String) request.getAttribute("name");
Integer id=(Integer) request.getAttribute("ID");
/* LocalDateTime time= (LocalDateTime) request.getAttribute("time");
 */
 %>
<table border="1">
<tr>
<th>Name</th>
<th>ID</th>

</tr>
<tr>
<td><%=name %> </td>
<td><%=id %> </td>
</tr>
</table>
</body>
</html>