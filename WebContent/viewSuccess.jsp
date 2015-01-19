<%@ page import=" com.ilp.bean.*,
com.ilp.util.*,java.sql.*,java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view tickets</title>
</head>
<body>
<form name="" method="post" action="">
<%
ArrayList<bookBean> list= new ArrayList<bookBean>();
list=(ArrayList<bookBean> )(request.getAttribute("bean"));
%>
<table border=1>
<tr>
<th>VTYPE</th>
<th>FROM</th>
<th>TO</th>
<th>SEAT</th>
<th>TNO</th>
</tr>





<%Iterator<bookBean> it=list.iterator();
while(it.hasNext())
{
	bookBean temp=it.next();
	%>
	
	<tr>
<td><%=temp.getVtype() %></td>
<td><%=temp.getFrom() %></td>
<td><%=temp.getTo() %></td>
<td><%=temp.getSeat() %></td>
<td><%=temp.getTno() %></td>
</tr>
<%} %>

</table>
</form>
</body>
</html>