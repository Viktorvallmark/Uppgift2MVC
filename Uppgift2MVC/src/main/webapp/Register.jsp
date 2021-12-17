<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/ServletController" method="post">

<label for="userRegister">Enter your username: </label>
<input type="text" name="userRegister">
<br><br>

<label for="passRegister">Enter your password: </label>
<input type="password" name="passRegister">
<br><br>

<label for="cityRegister">Enter the city you reside in: </label>
<input type="text" name="cityRegister">
<br><br>

<label for="ageRegister">Enter your age: </label>
<input type="number" name="ageRegister">
<br><br>


<input type="submit" value="Submit">



</form>
<br><br><br>
<form action="indexMVC.jsp">

<label for="redirectLogin">Back to login page:</label>
<br>
<input type="submit" value="Submit" name="redirectLogin">

</form>


</body>
</html>