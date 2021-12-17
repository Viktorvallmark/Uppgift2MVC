<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="controller.*" %>
<%@page import="model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is tricky</title>
</head>
<body>





<%
RegisterBean rb = (RegisterBean)request.getAttribute("RegisterBean");
OldUserBean oldBean = (OldUserBean)request.getAttribute("oldBean");

if(String.valueOf(rb.getAge())==null && rb.getCity()==null){
	
out.println("<h1>Welcome back " + oldBean.getUsername());

} else {
	
	out.println("<h1>Welcome " + rb.getUsername());
}


if(session.getAttribute("mySession") == null){
	
	
	out.print("<h1>Error!</h1>");
} else {
	
	out.print(" to your membership page!</h1>");
	
	String contentSession = (String) session.getAttribute("mySession");
	out.print(contentSession);
}

out.print("<footer>Your home city is: " + rb.getCity() + " and your age is: " + rb.getAge() + "</footer>");


%>

<form action="<%=request.getContextPath()%>/SessionRemoveServlet" method="post">

	<input type="submit" value="Log out">
</form>
	
</body>
</html>