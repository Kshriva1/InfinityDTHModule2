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
				<td style="color:rgba(255,0,0,0.8)">Enter Old Channel name: </td>
				<td><input type="text" name="oldName"></td>
			</tr>
			<tr>
				<td style="color:rgba(255,0,0,0.8)">Enter New Channel Name: </td>
				<td><input type="text" name="newName"></td>
			</tr>
			<tr>
				<td style="color:rgba(255,0,0,0.8)">Enter Channel Band : </td>
				<td><input type="radio" name="channelBand" value="I">I<br/>
				<input type="radio" name="channelBand" value="II">II<br/>
				<input type="radio" name="channelBand" value="III">III</td>
			</tr>
			<tr>
				<td style="color:rgba(255,0,0,0.8)">Enter Video Frequency (Mhz) : </td>
				<td><input type="text" name="videoFrequency"></td>
			</tr>
				<tr>
				<td style="color:rgba(255,0,0,0.8)">Enter Audio Frequency (Mhz) : </td>
				<td><input type="text" name="audioFrequency"></td>
			</tr>
			<tr>
				<td style="color:rgba(255,0,0,0.8)">Enter Channel Charge Type : </td>
				<td><input type="radio" name="channelChargeType" value="FTA">FTA (Free to Air)<br>
				<input type="radio" name="channelChargeType" value="Paid">Paid</td>
			</tr>
			</tr>
			</tr>
				<tr>
				<td style="color:rgba(255,0,0,0.8)">Enter Transmission Type : </td>
				<td><input type="radio" name="channelTransmissionType" value="Standard">Standard<br>
				<input type="radio" name="channelTransmissionType" value="HD">HD</td>
			</tr>
				<tr>
				<td style="color:rgba(255,0,0,0.8)">Enter Channel Charge: </td>
				<td><input type="text" name="channelCharge"></td>
			</tr>
			<tr>
				<td style="color:rgba(255,0,0,0.8)">Channel Support : </td>
				<td><input type="radio" name="support" value="enable">Enable<br>
				<input type="radio" name="support" value="disable">Disable</td>
			</tr>
			<tr>
				<td style="color:rgba(255,0,0,0.8)">Channel Category : </td>
				<td><input type="radio" name="category" value="1">Sport<br>
				<input type="radio" name="category" value="2">News</td>
			</tr>
			
			</table>
			<br>
			<br>
		
		<input type="hidden" name="option" value="channel">
		<input type="hidden" name="crud" value="update">
 		<center><input class="btn" type="submit" value="Update"></center>
	</form>
</body>
</html>