<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>

<body>
	<h1>Create a new Quiz</h1>
	<form action="createQuiz" method="post">
		<table>
			<tr>
				<td>Enter the details</td>
				<td><input type="hidden" /></td>
			</tr>
			<tr>
				<td>Id</td>
				<td><input type="text" name="quesid" /></td>
			</tr>
			<tr>
				<td>Question</td>
				<td><input type="text" name="question" /></td>
			</tr>
			<tr>
				<td>Option1</td>
				<td><input type="text" name="optionA" /></td>
			</tr>
			<tr>
				<td>Option2</td>
				<td><input type="text" name="optionB" /></td>
			</tr>
			<tr>
				<td>Option3</td>
				<td><input type="text" name="optionC" /></td>
			</tr>
			<tr>
				<td>Answer</td>
				<td><input type="text" name="ans" /></td>
			</tr>
			<tr>
				<td>Choose</td>
				<td><input type="text" name="chose" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add" /></td>
			</tr>
		</table>


		<p>
			Click here to go to access page <a href="access">Control Access</a>
		</p>
	</form>
</body>

</html>