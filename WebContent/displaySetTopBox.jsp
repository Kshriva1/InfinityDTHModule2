<%@ page import="entities.SetTopBox,java.util.List" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Infinity DTH</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
<div class="Center">
<table>

	<%-- Displaying Books --%>
	<%
	    List<SetTopBox> mySetTopBoxs = (List<SetTopBox>)request.getAttribute("settopbox");
		for(SetTopBox setTopBox: mySetTopBoxs){
	%>
  <tr>
    
    <td>
     SetTopBox Type: <span><%= setTopBox.getSTBType() %></span>
     <br><br>
     Length: <span><%= setTopBox.getSTBlength() %></span>
     <br><br>
     Breadth: <span><%= setTopBox.getSTBbreadth() %></span>
     <br><br>
     Width: <span><%= setTopBox.getSTBwidth() %></span>
     <br><br>
     Price: <span><%= setTopBox.getPrice() %></span>
     <br><br>
     Installation Charges: <span><%= setTopBox.getInstallationCharges() %></span>
     <br><br>
     Updation Charges: <span><%= setTopBox.getUpdationCharges() %></span>
     <br><br>
     Percentage Discount: <span><%= setTopBox.getPercentageDiscount() %></span>
     <br><br>
     Billing Type: <span><%= setTopBox.getBillingType() %></span>
     <br><br>
     Refund Amount: <span><%= setTopBox.getRefundAmount() %></span>
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
</div>
</body>
</html>