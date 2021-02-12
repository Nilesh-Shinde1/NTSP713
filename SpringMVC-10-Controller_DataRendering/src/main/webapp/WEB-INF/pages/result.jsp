<%@ page language="java" import="java.util.*" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
List : ${fruitsList}	<br>
Set : ${booksSet}	<br>
Map : ${glossaryMap}	<br>
Array : <c:forEach var="color" items="${colorsArray}">
			${color}
		</c:forEach> <br>
Employee : ${emp}
</body>
</html>