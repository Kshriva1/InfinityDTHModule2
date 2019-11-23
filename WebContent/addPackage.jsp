<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Package </title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
	<form action="MyServlet" method="get">
	<table>
	<tr>
		<td>Enter Package Id :</td>
		<td><input type="text" name="packageId"></td>
	</tr>
	<tr>
		<td>Enter Package Name : </td>
		<td><input type="text" name="packageName" >  <br>
	</tr>
	<tr>
		<td>Select Package Category</td>
		<td><select name="packageCategory">
		<option value="Kids">
		<option value="Regional">
		<option value="Informative">
		<option value="Music">
		<option value="Movies">
		</select></td>
	</tr>
	<tr>
		<td>Select Package Charge Type : </td>
		<td><input type="radio" name="packageChargeType" >Paid by default<br>
		<input type="radio" name="packageChargeType" >FTA </td>
	</tr>
	<tr>
		<td>Select Package Transmission Type : </td>
		<td><input type="radio" name="packageTransmissionType" >HD <br>
		<input type ="radio" name = "packageTransmissionType" >Standard </td>
	</tr>

	<tr>
		<td>Enter the cost of package : </td>
		<td>$<input type="text" name="packagePrice"></td>
	</tr>
	
	<tr>
		<td>Package Available from date : </td>
		<td><input type="date" name="packageFromDate" ><br>
		
	</tr>
	<tr>
		<td>Package Available to date  : </td>
		<td><input type="date" name="packageToDate"></td>
	</tr>
	<tr>
		<td>Added by default  : </td>
		<td><input type="checkbox" name="packageByDefault">Yes<br>
		<input type ="checkbox" name= "packageByDefault">No</td>
	</tr>
	
	</table>
	<input type="hidden" name="option" value="package">
	<input type="hidden" name="crud" value="addPackage">
	<input type="submit" value="Submit">
	</form>
</body>
</html>