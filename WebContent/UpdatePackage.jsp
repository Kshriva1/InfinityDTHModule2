<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Package</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<section class="container text-center">
	<p>Please enter following details to update the data:</p>
	<form action="MyServlet" method="get">
		<table>
			<tr>
				<td>Enter Package Name to Update: </td>
				<td><input type="text" name="packageSearchField"></td>
			</tr>
			<tr>
				<td>Enter New Package Name : </td>
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
	<input type="hidden" name="crud" value="updatePackage">
	<input type="submit" value="Submit">
	</form>
	</section> 
</body>
</html>
