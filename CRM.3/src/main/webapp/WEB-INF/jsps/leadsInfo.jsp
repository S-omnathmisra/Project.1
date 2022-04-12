<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leads Info</title>
</head>
<body>
	<h2>leads</h2>
	Id : ${leads.id}<br>
	First Name: ${leads.firstName}<br>
	Last Name: ${leads.lastName}<br>
	email: ${leads.email}<br>
	mobile: ${leads.mobile}<br>
</body>
</html>