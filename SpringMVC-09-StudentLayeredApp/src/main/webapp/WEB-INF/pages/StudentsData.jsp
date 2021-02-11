<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
	import="java.util.ArrayList, org.rose.dto.ResultDTO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data</title>

	<style> 
        table { 
            border-collapse: collapse; 
            width: 100%; 
        } 
          
        th, td { 
            text-align: left; 
            padding: 8px; 
        } 
          
        tr:nth-child(even) { 
            background-color: Lightgreen; 
        } 
    </style>
</head>
<body>
	<h1>Students Info</h1>
	<%-- 	<h1>${studentsInfo.get(30).getSname()}</h1> --%>
	<table>
		<thead  bgcolor="#FFA500">
			<tr>
				<th>Index No.</th>
				<th>Student Name</th>
				<th>Percentage</th>
				<th>Total</th>
				<th>Result</th>
			<tr>		
		</thead>
		<c:forEach var="i" begin="0" end="${studentsInfo.size()-1}">
			<tr>
				<td>${i}</td>
				<td><c:out value="${studentsInfo.get(i).getSname()}" /></td>
				<td><c:out value="${studentsInfo.get(i).getPercentage()}" /></td>
				<td><c:out value="${studentsInfo.get(i).getTotal()}" /></td>
				<td><c:out value="${studentsInfo.get(i).getResult()}" /></td>
			</tr>
		</c:forEach>
	
			</table>
</body>
</html>