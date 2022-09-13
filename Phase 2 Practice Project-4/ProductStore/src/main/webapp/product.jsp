<%@page import="java.util.ArrayList, java.util.List" %>
<%@page import="com.samples.domain.Product" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table>
		<tr>
			<th>ProductId</th>
			<th>ProductName</th>
			<th>ProductPrice</th>
		</tr>
		<%ArrayList<Product> std = 
            (ArrayList<Product>)request.getAttribute("data");
        for(Product s:std){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=s.getProductID()%></td>
                <td><%=s.getProductName()%></td>
                <td><%=s.getProductPrice()%></td>
            </tr>
            <%}%>
	</table>
	
	<br> <a href="productFields.jsp">Home</a>
        
	
</body>
</html>