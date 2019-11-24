<%@ page import="entities.Channel,java.util.List" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Infinity DTH</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
<table>

	<%-- Displaying Channels --%>
	<%
	    List<Channel> myChannels = (List<Channel>)request.getAttribute("channel");
		for(Channel channel: myChannels){
	%>
  <tr>
    
    <td>
     Channel Name: <span><%= channel.getChannelName() %></span>
     <br><br>
     Channel Band: <span><%= channel.getChannelBand() %></span>
     <br><br>
      Video Frequency: <span><%= channel.getVideoFrequency() %></span>
     <br><br>
     Audio Frequency: <span><%= channel.getAudioFrequency() %></span>
     <br><br>
     Channel Charge Type: <span><%= channel.getChannelChargeType() %></span>
     <br><br>
     Channel Transmission type: <span><%= channel.getChannelTransmissionType() %></span>
     <br><br>
     Channel Charges: <span><%= channel.getChannelCharge() %></span>
     <br><br>
     Channel Status: <span><%= channel.getChannelEnableOrDisable() %></span>
     <br><br>
    </td>
    
  </tr>
  <tr>
     <td>&nbsp;</td>
  </tr>
  <%
		}  
  %>
</table>
</body>
</html>