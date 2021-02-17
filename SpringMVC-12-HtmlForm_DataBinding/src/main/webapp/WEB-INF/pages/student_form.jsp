<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 	<form action="student" method="POST"> -->
	<!-- <form method="POST">
		<pre>
			Student Number : <input type="text" name="sno">
			Student Name : <input type="text" name="sname">
			Student Age : <input type="text" name="age">
			<input type="submit" value="Send" />
		</pre>
	</form> -->
	
	<form:form action="student" method="POST" modelAttribute="student" align="center">
		Student Num : <form:input path="sno"/>	<br>
		Student Name: <form:input path="sname"/><br>
		Student Addr: <form:input path="add"/><br>
		Student Avg : <form:input path="avg"/><br>
		<input type="submit" value="Register"/>
	</form:form>
</body>
</html>