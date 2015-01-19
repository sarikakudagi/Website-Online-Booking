<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cancel vehicle</title>
</head>
<body>
<center>
<form name="add" action="Controller" method="post">
<h2><u>Cancel Vehicle </u></h2><br/><br/><br/>

<b>Enter the Vehicle Number to be cancelled:</b><input type="text" name="vno"/><br/><br/>
<input type="submit" value="Submit"/>
<input type="reset" value="Reset"/>
<input type="hidden" value="cancelVeh" name="hidden"/>
</form>
</center>
</body>
</html>