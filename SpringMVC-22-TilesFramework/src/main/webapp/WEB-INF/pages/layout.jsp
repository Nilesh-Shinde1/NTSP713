<%@ page language="java" isELIgnored="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><tiles:insertAttribute name="title" ignore="true"/></title>
<style type="text/css">
	#header{
		height: 20%
	}
	#body{
		height: 70%
	}
	#footer{
		height: 10%
	}
	table{
		height: 100% ;
		width: 100%
	}
</style>
</head>
<body>
	
	<table border="1">
		<tr id="header">
			<td colspan="2"><tiles:insertAttribute name="header"/></td>
		</tr>
		<tr id="body">
			<td width="30%"><tiles:insertAttribute name="menu"/></td>
			<td width="70%"><tiles:insertAttribute name="body"/></td>
		</tr>
		<tr id="footer">
			<td colspan="2"><tiles:insertAttribute name="footer"/></td>
		</tr>
	</table>
</body>
</html>