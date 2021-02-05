<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" import="java.util.Locale"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Language Collection</title>
</head>
<body>
	<h1>Language List</h1>
	<a href="welcome.go">Home</a>
	<table>
		<c:forEach begin="0" end="${fn:length(langs) - 1}" var="index">
			<tr>
				<td><c:out value="${langs[index].getDisplayName()}" /></td>
				<td><c:out value="${langs[index].getDisplayCountry()}" /></td>
			</tr>
		</c:forEach>
	</table>
	<a href="welcome.go"></a>
</body>
</html>