<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Infinity DTH</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<section class="container">
	<form action="MyServlet" method="get">
	<div class="Center">
	<table class="del">
		<tr>
			<td>Enter the STB Type You Want to Delete: </td>
			<td><input type="text" name="Type"></td>
		</tr>
	</table>
	</div>
	<input type="hidden" name="option" value="settopbox">
	<input type="hidden" name="crud" value="delete">
	<input type="submit" value="Submit" >
	</form>
</section>
</body>
</html>