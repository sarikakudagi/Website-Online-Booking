<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update</title>
</head>
<body>
<center>
<form name="cancel" action="Controller" method="post">
<table>
<tr><b>Enter the Ticket-Number you want to update</b>:<input type="text" name="update"/><br/><br/></tr>
<tr><b>Enter the new Destination:</b><input type="text" name="to"/></tr><br/>
<input type="submit" value="Submit"/>
<input type="reset" value="Reset"/>
<input type="hidden" value="update" name="hidden"/>
</center>
</table>
</form>
</body>
</html>