<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<body>
	<form:form action="student" method="POST" modelAttribute="stud">
		Student Num : <form:input path="sno"/>
		Student Name: <form:input path="sname"/>
		Student Addr: <form:input path="add"/>
		Student Avg : <form:input path="avg"/>
		<input type="submit" value="Register"/>
	</form:form>
</body>