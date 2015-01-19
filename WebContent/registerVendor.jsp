<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>vendor registration form  </title>
</head>
<body>
<center>
<form name="regven" action="Controller" method="post">
<h2>Vendor Registration Form</h2>
<b>Company Name</b>:<input type="text" name="cname"><br/><br/>
<b>Username</b>:<input type="text" name="name"><br/><br/>

<b>Vehicle Type</b>:<input type="text" name="vtype"><br/><br/>
<b>Email-id</b>:&nbsp&nbsp&nbsp<input type="text" name="email"><br/><br/>
<b>Phone-no</b>:&nbsp&nbsp&nbsp<input type="text" name="pno"><br/><br/>
<input type="hidden" value="venRegister" name="hidden"/>
<input type="submit" value="Submit"/>
<input type="reset" value="Reset"/>

</form>
</center>
</body>
</html>