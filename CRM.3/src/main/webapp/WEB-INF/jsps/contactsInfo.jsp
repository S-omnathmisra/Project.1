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
	<h2>Contacts Details</h2>
	Id : ${contacts.id}<br>
	First Name: ${contacts.firstName}<br>
	Last Name: ${contacts.lastName}<br>
	email: ${contacts.email}<br>
	mobile: ${contacts.mobile}<br>
	lead Source: ${contacts.leadSource}<br>

	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="${contacts.email}"/>
		<input type="submit" value="sent email"/>
	</form>
	
</body>
</html>