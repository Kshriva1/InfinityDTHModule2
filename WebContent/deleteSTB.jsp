<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="MyServlet" method="get">
	<table>
		<tr>
			<td>Enter the STB Type You Want to Delete: </td>
			<td><input type="text" name="Type"></td>
		</tr>
	</table>
	<input type="hidden" name="option" value="settopbox">
	<input type="hidden" name="crud" value="delete">
	<input type="submit" value="Submit" >
	</form>

</body>
</html>