<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Channel</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
	<form action="MyServlet" method="get">
	<table>
	<tr>
		<td>Enter Channel Id :</td>
		<td><input type="text" name="channelId"></td>
	</tr>
	<tr>
		<td>Enter Channel Name : </td>
		<td><input type="text" name="channelName" >  <br>
		
	</tr>
	<tr>
		<td>Channel Band : </td>
		<td><input type="text" name="channelBand" > <br>
		
	</tr> 
	<tr>
		<td>Video Carrier Frequency : </td>
		<td><input type="range" name="videoFrequency" min ="40" max="225"><br>
		
	</tr>
	<tr>
		<td>Audio Carrier Frequency: </td>
		<td><input type="range" name="audioFrequency" min ="45" max="230" ><br>
		
	</tr>

	<tr>
		<td>Channel Charge Type : </td>
		<td><input type="radio" name="channelChargeType">Free to Air (FTA) <br>
		<input type="radio" name= "channelChargeType"> Paid </td>
	</tr>
	
	<tr>
		<td>Channel Transmission Type : </td>
		<td><input type="radio" name="channelTransmissionType" > Standard <br>
		<input type="radio" name= "channelChargeType"> HD </td>
		
	</tr>
	<tr>
		<td>Channel Charge : </td>
		<td>$<input type="text" name="channelCharge"></td>
	</tr>
	
	<tr>
		<td>Package Type : </td>
		<td>$<input type="text" name="packageName"></td>
	</tr>
	
	</table>
	<input type="hidden" name="option" value="channel">
	<input type="hidden" name="crud" value="add">
	<input type="submit" value="Submit">
	</form>
</body>
</html>
