<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration Form</title>
</head>
<body>
<center>
<form name="regcust" action="Controller" method="post">
<h2>Customer Registration Form</h2>
<b>Username</b>:&nbsp&nbsp&nbsp&nbsp<input type="text" name="name"><br/><br/>
<b>Age</b>:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="age"><br/><br/>
<b>Email-id</b>:<input type="text" name="email"><br/><br/>
<b>Phone-no</b>:<input type="text" name="pno"><br/><br/>

<input type="submit" value="Submit"/>
<input type="reset" value="Reset"/>
<input type="hidden" value="custRegister" name="hidden"/>
</form>
</center>
</body>
</html>