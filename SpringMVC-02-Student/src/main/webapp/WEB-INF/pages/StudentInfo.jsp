<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" import="java.util.List, org.rose.dto2.StudentDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info</title>
</head>
<body>
	<%-- Result :: ${result} --%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<table border="1" width="100%">
		<thead>
			<tr>
				<td>SNO</td>
				<td>SNAME</td>
				<td>TOTAL</td>
				<td>AVG</td>
				<td>RESULT</td>
			<tr>
		</thead>
		<c:forEach items="${result}" var="item">
			<tr>
				<td><c:out value="${item.getSno()}" /></td>
				<td><c:out value="${item.getSname()}" /></td>
				<td><c:out value="${item.getTotal()}" /></td>
				<td><c:out value="${item.getAvg()}" /></td>
				<td><c:out value="${item.getResult()}" /></td> 
			</tr>
		</c:forEach>
	</table>
</body>
</html>