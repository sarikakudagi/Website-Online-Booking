<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login page</title>
<script>

</script>
</head>
<body>
<form action="/ERecruitment/loginservlet" method="get">
<table>
<tr>
<td>Employee ID</td>
<td><input type="text" name="empid"></input></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="psswd"></input></td>
</tr>
</table>
<input type="submit" value="login" ></input>

<a href="forgot.jsp" >Forgot Password?</a>
</form>
</body>
</html>