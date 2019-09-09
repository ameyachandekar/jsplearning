<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*,java.util.*"%>


<%
String nm=request.getParameter("name");
String email=request.getParameter("eid");
String unm=request.getParameter("uname");
String pass=request.getParameter("pass");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "root");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into registration(name,email,username,password)values('"+nm+"','"+email+"','"+unm+"','"+pass+"')");
out.println("Data is successfully inserted!");

}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
System.out.println("mysql not connected");
}
%>
</body>
</html>