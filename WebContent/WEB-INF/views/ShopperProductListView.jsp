<!-- Done by: Nathan Trowers -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="scale=1.0, width=device-width">
		<meta name="author" content="Nathan Trowers">
		<meta name="description" content="This page displays products to a potential customer.">
		<title>Our Products | House of Sound</title>
	</head>
	
	<body>
	<!-- Reference Header and Logged-in Menu views  -->
		<jsp:include page="_header.jsp"></jsp:include>
		<jsp:include page="CustomerMenu.jsp"></jsp:include>
		
		<h3>Our Sounds</h3>
		
		<p style="color: red;">${errorString}</p>
		
		<table border="1" cellpadding="5" cellspacing="1">
	<!-- Headings -->	
			<tr>
				<th>Code</th>
				<th>Name</th>
				<th>Price</th>
				<th>Buy</th>
				<th>Return</th>
			</tr>
	<!-- Code Generated List of Instruments -->			
			<c:forEach items="${productList}" var="product">
				<tr>
					<td>${product.code}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td> 
					<% switch(id) /* *********************************************************************WORKING HERE: Check to see why the 'print' error exists.  Create code for 'logout' in 'CustomerMenu.jsp' */
					{
						case "Return":
							out.print("<input id='Buy' type='button' name='Buy'>");
							break;
						case "Buy":
							out.print("<input id='Return' type='button' name='Return'>");
							break;
						default:
							out.print("<input id='Buy' type='button' name='Buy'>");
							break;
					}%>
					</td>					
				</tr>
			</c:forEach>
		</table>
		
	<!-- Reference the footer view -->
		<jsp:include pade="_footer.jsp"></jsp:include>
		
	</body>
</html>