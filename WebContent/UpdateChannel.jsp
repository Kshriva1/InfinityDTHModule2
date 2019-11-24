<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Channel</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>

<body>
	<form action="MyServlet" method="get">
	<div class ="title">
<center><h1>Infinity DTH</h1></center></div><br><br>
		<table class="info">
			<tr>
				<td style="color:rgba(255,0,0,0.8)">Enter Channel name to update: </td>
				<td><input type="text" name="channelSearchField"></td>
			</tr>
			<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Channel Band : </td>
		<td><input type="text" name="channelBand"></td>
	</tr>
				<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Video Frequency : </td>
		<td><input type="text" name="videoFrequency"></td>
	</tr>
				<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Audio Frequency : </td>
		<td><input type="text" name="audioFrequency"></td>
	</tr>
				<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Channel Charge Type : </td>
		<td><input type="text" name="channelChargeType"></td>
	</tr>
				<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Transmission Type : </td>
		<td><input type="text" name="channelTransmissionType"></td>
	</tr>
				<tr>
		<td style="color:rgba(255,0,0,0.8)">Enter Channel Charge: </td>
		<td><input type="text" name="channelCharge"></td>
	</tr>
			
		</table>
		<br>
		<br>
		
		<center><input class="btn" type="submit" value="Update"></center>
		<input type ="hidden" name ="updatechannel" value ="UpdateChannel">
	</form>
</body>
</html>