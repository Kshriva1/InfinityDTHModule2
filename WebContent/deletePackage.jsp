<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Package</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>

<body>
	<h2>***Deleting a package also deletes the respective channels in the package***</h2>
	<p>Please enter following details to delete the data:</p>
	<form action="MyServlet" method="get">
		<table>
			<tr>
				<td>Enter the package name to delete : </td>
				<td><input type="text" name="deleteValue"></td>
			</tr>
			
		</table>
		<input type="hidden" name="option" value="package">
		<input type="hidden" name="crud" value="deletePackage">
		<input type="submit" value="Submit">
	</form>
</body>
</html>