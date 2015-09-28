<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<%-- <form:form action="/KclinkLogin/login.html" commandName="user" method="post">
<tr>
<td>username:</td>
<td><form:input path="user_name"/></td><br>
</tr>
<tr>
<td>password:</td>
<td><form:password path="user_password"/><br>
</tr>
<input type="submit" value="submit"/>
</form:form> --%>

<form action="/KclinkLogin2/login.html" method="post">

Username *:<input type="text" name="username" /> </br> </br>
		Password:<input type="password" name="password"/> </br></br>
		 <input type="submit"value="submit" /> 

</form>

</body>
</html>