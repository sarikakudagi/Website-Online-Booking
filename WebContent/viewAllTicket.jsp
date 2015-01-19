<%@ page import=" com.ilp.bean.*,
com.ilp.util.*,java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View all booked ticket</title>
</head>
<body>
<form name="view" method="post" action="Controller">
Select the ticket you want to see<select name="view"><b></b>:<%

Connection con;
PreparedStatement ps;
ResultSet rs;
con=DBConnection.createConnection();
ps=con.prepareStatement("select tno from TICKETS1_671389");
rs=ps.executeQuery();
while(rs.next())
{
	%>	
<option><%= rs.getString("tno")%>

<%} %>

</option>


</select>
<input type="submit" value="Submit"/><br/>
<input type="reset" value="Reset"/><br/>
<input type="hidden" value="view" name="hidden"/>
</form>
</option>
</body>
</html>