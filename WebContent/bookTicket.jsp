<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>book ticket</title>
</head>
<body>
<center>
<form name="book" action="Controller" method="post">
<h2>Book tickets</h2>
<b>Vehicle type:</b><select name="vtype">:<option>Bus</option>
<option >Train</option>
<option>Airline</option></select><br/><br/>

<b>From:</b><select name="from">:<option>Bangalore</option>
<option >Hyderabad</option>
<option >NewYork</option></select><br/><br/>

<b>To:</b><select name="to">:<option >Hyderabad</option>
<option >Chennai</option>
<option >Hubli</option></select><br/><br/>

<b>Seat</b><select name="seat">:<option >Window seat</option>
<option >Middle seat</option>
<option >Aisle seat</option></select><br/><br/>

<input type="submit" value="Submit"/>
<input type="reset" value="Reset"/>
<input type="hidden" value="book" name="hidden"/>

</form>
</center>
</body>
</html>