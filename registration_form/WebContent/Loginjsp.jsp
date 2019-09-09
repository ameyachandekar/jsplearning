<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import= "java.sql.*,java.util.*" %>
<% 
String unm=request.getParameter("usr");
String pass=request.getParameter("password");
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register" ,"root","root");
Statement s=con.createStatement();

ResultSet rs =s.executeQuery("select * from registration where username='"+unm+"' && password='"+pass+"'");
try
{
rs.next();
if(rs.getString("password").equals(pass)&&rs.getString("username").equals(unm))
{
out.println("welcome   "+unm);
session.setAttribute("user",unm);
response.sendRedirect("user_section.jsp"); 
}
else
{out.println("invalid username or password");}
}
catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>