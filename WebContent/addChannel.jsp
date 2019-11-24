<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddChannel</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
	<form action="MyServlet" method="get">
	<div class ="title">
<center><h1>Infinity DTH</h1></center></div><br><br>
	<table class="info">
	
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Channel Id :</td>
		<td><input type="text" name="channelId"></td>
	</tr>
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Channel Name : </td>
		<td><input type="text" name="channelName" >  <br>
	</tr>
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Channel Band : </td>
		<td><input type="text" name="channelBand" > <br>
	</tr> 
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Video Carrier Frequency : </td>
		<td><input type="range" name="videoFrequency" min ="40" max="225"><br>
	</tr>
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Audio Carrier Frequency: </td>
		<td><input type="range" name="audioFrequency" min ="45" max="230" ><br>
	</tr>

	<tr>
		<td style="color:rgba(255,0,0,0.8)">Channel Charge Type : </td>
		<td><input type="radio" name="channelChargeType">Free to Air (FTA) <br>
		<input type="radio" name= "channelChargeType"> Paid </td>
	</tr>
	
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Channel Transmission Type : </td>
		<td><input type="radio" name="channelTransmissionType" > Standard <br>
		<input type="radio" name= "channelChargeType"> HD </td>
	</tr>
	<tr>
		<td style="color:rgba(255,0,0,0.8)">Channel Charge : </td>
		<td>$<input type="text" name="channelCharge"></td>
	</tr>
	</table><br><br>
	<center><input class="btn" type="submit" value="Submit"></center>
	</form>
</body>
</html>