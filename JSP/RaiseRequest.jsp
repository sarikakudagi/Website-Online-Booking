<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Raise New Vacancy Request</title>
</head>
<body>
<form action="/ERecruitment/employeecontroller" method="post">
<table>
<tr>

<td>Number of Positions</td><td><input type="text" name="npositions"></input></td></tr>
<tr><td>Business Domain</td><td><input type="text" name="bdomain"></input></td></tr>
<tr>
<td>Skills</td>
<td><label>Java<input type="radio" name="skill" value="java"></input></label>
<label>.Net<input type="radio" name="skill" value=".net"></input></label>
<label>C++<input type="radio" name="skill" value="c++"></input></label>
<label>Python<input type="radio" name="skill" value="python"></input></label></td></tr>
<td>Location</td><td><input type="location" name="location"></input></td>
<td>Required by Date</td><td><input type="date" name="date"></input></td>
<td>Experience in years</td><td><input type="text" name="experience"></input></td>
<td><input type="hidden" name="form" value="raise"></input></td>

</table>

<input type="submit" value="submit"></input>
</form>
</body>
</html>