<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%--     <%

if (session.getAttribute("mySession") != null) {

	
	RequestDispatcher rd = request.getRequestDispatcher("ServletController");
	rd.forward(request, response);
}
%> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>

<h1>Welcome to the login page!</h1>

<form action="<%=request.getContextPath()%>/ServletControllerOld" method="post">



<label for="username">Enter your username: </label>
<input type="text" name="username">


<label for="password">Enter your password: </label>
<input type="password" name="password">

<input type="submit" value="Submit">

</form>
<br><br><br><br><br>

<form action="Register.jsp">

<label for="registerRedirect">Not yet registered? <br> Press the button to become a member: </label>
<input type="submit" value="Register" name="registerRedirect">

</form>






</body>
</html>