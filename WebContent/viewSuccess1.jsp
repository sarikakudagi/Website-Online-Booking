<%@ page import="com.ilp.util.*,com.ilp.bean.*,java.util.*,java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view all vehicle</title>
</head>
<body>
<center>
<form name="view" method="post" action="">
<h2>The details of vehicle are:</h2>
<% 
ArrayList<vehBean> list=new ArrayList<vehBean>(); 
list=(ArrayList<vehBean>)(request.getAttribute("veh"));

%>
<table border=1>
<tr>
<th>Vehicle-type</th>
<th>vno</th>
</tr>
<%
Iterator<vehBean> it=list.iterator();
while(it.hasNext())
{
	vehBean v=it.next();
	%>
	<tr>
	<td><%=v.getVehice_type() %></td>
	<td><%=v.getVno() %></td></tr>
<%} %>



</table>

</form>
</center>
</body>
</html>