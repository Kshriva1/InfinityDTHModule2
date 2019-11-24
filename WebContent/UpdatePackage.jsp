<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Package</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
	<form action="MyServlet" method="get">
	<div class ="title">
<center><h1>Infinity DTH</h1></center></div><br><br>
		<table class="info">
			<tr>
				<td style="color:rgba(255,0,0,0.8)">Enter Package name to update: </td>
				<td><input type="text" name="packageSearchField"></td>
			</tr>

			<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Package Category Name : </td>
		<td><input type="text" name="pkgCategoryName"></td>
	</tr>
				<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Package Charge Type : </td>
		<td><input type="text" name="pkgChargeType"></td>
	</tr>
				<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Package Transmission Type : </td>
		<td><input type="text" name="pkgTransmissionType"></td>
	</tr>
				<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Package Cost : </td>
		<td><input type="text" name="pkgCost"></td>
	</tr>
				<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Package From Date : </td>
		<td><input type="text" name="pkgFromDate"></td>
	</tr>
				<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Package To Date: </td>
		<td><input type="text" name="pkgToDate"></td>
	</tr>
			
		</table>
		<br>
		<br>
			
		<center><input class="btn" type="submit" value="Update"></center>
		<input type ="hidden" name ="updatePackage" value ="UpdatePackage">
	</form>
</body>
</html>