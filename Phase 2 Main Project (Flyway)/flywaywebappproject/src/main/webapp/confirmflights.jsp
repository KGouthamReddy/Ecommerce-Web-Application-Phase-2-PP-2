<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking info</title>
</head>
<body>

<h1>Provide Booking Details</h1>
<form action="updatebooking" method="post">
		<table>
			
			<tr>
				<td>Enter the flight number:</td>
				<td><input name="cfno" type="text"  /></td>
			</tr>			
			<tr>
				<td>Enter your Name:</td>
				<td><input name="username" type="text" /></td>
			</tr>
			<tr>
				<td>Enter your Aadhar number:</td>
				<td><input name="userid" type="text" /></td>
			</tr>
			<tr>
				<td>Number of passengers:</td>
				<td><input name="npeople" type="text" /></td>
			</tr>
			<tr>
				<td>Date of travel:</td>
				<td><input name="tdate" type="text" />
				</td>
				<td>(yyyy-mm-dd)</p></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit"/></td>
			</tr>
		</table>
		
		<p><a href="homepage.html">Home</a></p>
	</form>



</body>
</html>