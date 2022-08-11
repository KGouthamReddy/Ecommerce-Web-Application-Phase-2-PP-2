<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="products" method="post">
		<table>
			<tr>
				<td>Product Name</td>
				<td><input name="name" /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input name="price" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form>
</body>
</html>