<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name= (String) session.getAttribute("user");
out.print("hello " + name + " this is user section");  
%>
<a href="logout">LOG OUT</a>
</body>
</html>