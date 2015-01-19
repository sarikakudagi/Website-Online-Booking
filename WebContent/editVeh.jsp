<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit vehicle info</title>
</head>
<body>
<form name="edit" method="post" action="Controller">
<center>
<h2>Edit vehicle information</h2>
Enter the vehicle number:<input type="text" name="vno"/><br/><br/>
Enter the new vehicle_type:<select name="vtype"><option>Train</option>
<option>Aeroplane</option>
<option>Bus</option></select>


<input type="submit" value="submit"/>
<input type="hidden" value="editVeh" name="hidden"/>

"
</center>



</form>
</body>
</html>