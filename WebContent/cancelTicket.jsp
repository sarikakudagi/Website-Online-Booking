<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cancellation</title>
</head>
<body>
<center>
<form name="cancel" action="Controller" method="post">
Enter the Ticket-Number you want to cancel:<input type="text" name="cancel"/>
<input type="submit" value="Submit"/>
<input type="reset" value="Reset"/>
<input type="hidden" value="cancel" name="hidden"/>
</center>
</form>
</body>
</html>