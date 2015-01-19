<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer login</title>
</head>
<body>
<center>
<h1 align="center">Welcome to H74 Online Ticket Booking</h1>
<h2>Customer Login</h2>
<form name="cust" action="Controller" method="post">
Username:<input type="text" name="uname"><br/>
Password:<input type="password" name="password"><br/><br/>
<a href="registerCust.jsp">New User?Register here!</a><br/><br/>
<input type="submit" value="Submit"/>
<input type="reset" value="Reset"/>
<input type="hidden" value="login" name="hidden"/>

</center>
</form>
</body>
</html>