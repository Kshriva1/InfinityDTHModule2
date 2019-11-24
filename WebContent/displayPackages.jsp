<%@ page import="entities.ChannelPackage,java.util.List,java.sql.Date" language="java" contentType="text/html; charset=ISO-8859-1"
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

	<%-- Displaying Packages --%>
	<%
	    List<ChannelPackage> myPackages = (List<ChannelPackage>)request.getAttribute("package");
		for(ChannelPackage myPackage: myPackages){
	%>
  <tr>
    
    <td>
     Package name: <span><%= myPackage.getPkgName() %></span>
     <br><br>
     Package Charge Type: <span><%= myPackage.getPkgChargeType() %></span>
     <br><br>
     Package Category : <span><%= myPackage.getPkgCategory().toString().replace("[","").replace("]","") %></span>
     <br><br>
     Package Transmission Type: <span><%= myPackage.getPkgTransmissionType() %></span>
     <br><br>
     Package Cost: <span><%= myPackage.getPkgCost() %></span>
     <br><br>
     Package From Date: <span><%= myPackage.getPkgFromDate() %></span>
     <br><br>
     Package To Date: <span><%= myPackage.getPkgToDate() %></span>
     <br><br>
     Package Default Status: <span><%= myPackage.getPkgByDefault() %></span>
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