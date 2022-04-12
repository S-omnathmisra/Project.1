<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="menu.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>leads result</title>
</head>
<body>
	
	<p><a href="leads">New Lead</a></p>
	<h2>All Contact Detail</h2>
	
	<table border='1'>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Lead Source</th>
			<th>Billing</th>
		</tr>
		
		<c:forEach items="${contacts}" var="contacts">
		<tr>
			<td>${contacts.id}</td>
			<td><a href="pickcontact?id=${contacts.id}">${contacts.firstName}</a></td>
			<td>${contacts.lastName}</td>
			<td>${contacts.email}</td>
			<td>${contacts.mobile}</td>
			<td>${contacts.leadSource}</td>
			<td><a href="Bill"></a>
		</tr>
		
		
		</c:forEach>

	</table>

</body>
</html>