<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddPackage </title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
	<form action="MyServlet" method="get">
	<div class ="title">
<center><h1>Infinity DTH</h1></center></div><br><br>
	<table class="info">
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Package Id :</td>
		<td><input type="text" name="packageId"></td>
	</tr>
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Package Name : </td>
		<td><input type="text" name="packageName" >  <br>
	</tr>
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Select Package Category</td>
		<td><select name="packageCategory"> Package Category
		<option value="Kids"> Kids
		<option value="Regional"> Regional
		<option value="Informative"> Informative
		<option value="Music"> Music
		<option value="Movies"> Movies
		</select></td>
	</tr>
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Select Package Charge Type : </td>
		<td><input type="radio" name="packageChargeType" >Paid by default<br>
		<input type="radio" name="packageChargeType" >FTA </td>
	</tr>
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Select Package Transmission Type : </td>
		<td><input type="radio" name="packageTransmissionType" >HD <br>
		<input type ="radio" name = "packageTransmissionType" >Standard </td>
	</tr>

	<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter the cost of package : </td>
		<td>$<input type="text" name="packagePrice"></td>
	</tr>
	
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Package Available from date : </td>
		<td><input type="date" name="packageFromDate" ><br>
		
	</tr>
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Package Available to date  : </td>
		<td><input type="date" name="packageToDate"></td>
	</tr>
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Added by default  : </td>
		<td><input type="radio" name="packageByDefault">Yes<br>
		<input type ="radio" name= "packageByDefault">No</td>
	</tr>
	
	</table>
	<br>
	<br>
	<center><input class="btn" type="submit" value="Submit"></center>
	</form>
</body>
</html>