<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Add the product</h2>
	<form action= "addproductServlet" method="post">
	ProductID: <input type="text" name="productID"><br>
	ProductName: <input type="text" name="productName"><br/>
	ProductPrice: <input type="text" name="productPrice"><br/>
	<input type="submit" value="submit">
	</form>
</body>
</html>