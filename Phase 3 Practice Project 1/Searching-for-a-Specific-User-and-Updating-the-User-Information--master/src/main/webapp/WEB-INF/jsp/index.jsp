<html>
<body>
<h1><center>Spring Application</center></h1>

<h2 class="hello-title"><center>Welcome ${name}!</center></h2>
<center>
<a href="users">Click to view List of Users</a><br/><br/><br/><br/>
<form action="search/{id}" method="post">
Enter User ID: <input name="id" type="text" id="id" required/>
<input name="Submit" type="submit"/>
</form>

</center>

</body>
</html>
