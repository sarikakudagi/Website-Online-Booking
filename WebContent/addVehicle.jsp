<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add vehicle</title>
</head>
<body>
<center>
<form name="add" action="Controller" method="post">
<h2><u>Vehicle Information</u></h2>
<b>Vehicle type:</b><select name="vtype">:<option>Bus</option>
<option >Train</option>
<option>Airline</option></select><br/><br/>
<b>Vehicle Number:</b><input type="text" name="vno"/>
<input type="submit" value="Submit"/>
<input type="reset" value="Reset"/>
<input type="hidden" value="addVeh" name="hidden"/>
</form>
</center>
</body>
</html>