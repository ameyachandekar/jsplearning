<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
		body{margin: 0;}
		.footer{height:80px; background-color:gray;}
		.header{height:80px; background-color:gray;}
		.menu{height:50px;background-color: gold;}
		.content{height: 500px; background-color: white}
		#browser{width: 79%;height:500px;float:right;border: 1px solid black;}
		#editor{width: 20%;height:500px;float: left;border: 1px solid black;}
	    #bt{float:right;}
	     #bt1{width:100%; height:10%;}
	</style>
</head>
<body>
<div class="main">
	<div class="header">
<%
String name= (String) session.getAttribute("user");
out.print("<h4>Hello " + name + " This is user section</h4>");  
%>
<a href="logout"><button id="bt">LOG OUT</button></a></div>
	
	<div class="content">
	   <div id="editor">
	   <a href ="showdetails"><button id="bt1">show personel details</button></a><br>
	   <a href ="sed"><button id="bt1">show educational details</button></a> 
	   </div>
		
		<div id="browser"></div>
		
	</div>
	<div class="footer"></div>
	
</div>
</body>
</html>