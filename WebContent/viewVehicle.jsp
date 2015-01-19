<%@ page import="com.ilp.util.*, com.ilp.bean.*,java.sql.*"language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view all vehicles</title>
</head>
<body>
<center>
<form name="viewVeh" method="post" action="Controller">
Select the vehicle Number:<select name="vno">
<%
 Connection con=DBConnection.createConnection();
PreparedStatement ps;
ResultSet rs;
ps=con.prepareStatement("select vno from VEHICLE_671389");
rs=ps.executeQuery();
while(rs.next())
{
	%>
<option><%=rs.getString("vno") %>
<%} %>
<input type="submit" value="Submit"/>
<input type="reset" value="Reset"/>
<input type="hidden" value="viewVeh" name="hidden"/>



</option></select>
</form>
</center>
</body>
</html>