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
	<h2>All Leads Detail</h2>
	
	<table border='1'>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Lead Source</th>
		</tr>
		
		<c:forEach items="${leads}" var="leads">
		<tr>
			<td>${leads.id}</td>
			<td><a href="getLead?id=${leads.id}">${leads.firstName}</a></td>
			<td>${leads.lastName}</td>
			<td>${leads.email}</td>
			<td>${leads.mobile}</td>
			<td>${leads.leadSource}</td>
		</tr>
		
		
		</c:forEach>

	</table>

</body>
</html>