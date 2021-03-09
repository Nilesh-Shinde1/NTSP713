<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="user">
		<table>
			<tr>
				<td>Username : </td>
				<td><form:input path="username"/></td>
			</tr>			
			<tr>
				<td>Password : </td>
				<td><form:input path="password"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"/></td>
			</tr>
		</table>
	</form:form>
	
	${result}
</body>
</html>