<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
	<form action="MyServlet" method="get">
	<table>
	
	<tr>
		<td>Enter the STB Type You Want to Change : </td>
		<td><input type="text" name="oldType"></td>
	</tr>
	<tr>
		<td>Select New STB Type : </td>
		<td><input type="radio" name="newType" value="Standard STB">Standard STB<br>
		<input type="radio" name="newType" value="High Definition STB">High Definition STB<br>
		<input type="radio" name="newType" value="High Definition Recorder STB">High Definition Recorder STB<br>
		<input type="radio" name="newType" value="IPTV">IPTV</td>
	</tr>
	<tr>
		<td>Enter STB Length : </td>
		<td><input type="text" name="stbLength"></td>
	</tr>
	<tr>
		<td>Enter STB Breadth : </td>
		<td><input type="text" name="stbBreadth"></td>
	</tr>
	<tr>
		<td>Enter STB Width : </td>
		<td><input type="text" name="stbWidth"></td>
	</tr>
	<tr>
		<td>Select features of this STB : </td>
		<td><input type="checkbox" name="feature" value="multiLingual">Multi-lingual<br>
		<input type="checkbox" name="feature" value="genreWiseChannelGuide">Genre Wise Channel Guide<br>
		<input type="checkbox" name="feature" value="liveRecording">Live Recording<br>
		<input type="checkbox" name="feature" value="sceduledRecording">Scheduled Recording<br>
		<input type="checkbox" name="feature" value="pausePlay">Pause/Play<br>
		<input type="checkbox" name="feature" value="rewindForward">Rewind/Forward<br>
		<input type="checkbox" name="feature" value="slowMotion">Slow Motion<br>
		<input type="checkbox" name="feature" value="childLock">Child Lock<br>
		<input type="checkbox" name="feature" value="previewScreen">Preview Screen<br>
		<input type="checkbox" name="feature" value="programReminder">Program Reminder</td>
	</tr>
	<tr>
		<td>Enter the cost of selected STB Type : </td>
		<td>$<input type="text" name="stbPrice"></td>
	</tr>
	<tr>
		<td>Enter Installation Charges : </td>
		<td>$<input type="text" name="installCharges"></td>
	</tr>
	<tr>
		<td>Enter Updation Charges : </td>
		<td>$<input type="text" name="updateCharges"></td>
	</tr>
	<tr>
		<td>Enter Percentage Discount : </td>
		<td><input type="text" name="percentageDicount">%</td>
	</tr>
	<tr>
		<td>Select Billing Type Availability : </td>
		<td><input type="checkbox" name="billingType" value="prePaid">Pre-Paid<br>
		<input type="checkbox" name="billingType" value="postPaid">Post-paid</td>
	</tr>
	<tr>
		<td>Enter Refundable Deposit Amount (if post-paid) : </td>
		<td>$<input type="text" name="refundAmount"></td>
	</tr>
	</table>
	<input type="hidden" name="option" value="settopbox">
	<input type="hidden" name="crud" value="update">
	<input type="submit" value="Submit" >
	</form>
</body>
</html>