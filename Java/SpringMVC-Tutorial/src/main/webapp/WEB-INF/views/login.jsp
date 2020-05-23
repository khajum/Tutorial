<html>
<head>
<title>JSP and Servlet Tutorial</title>
</head>
<body>
	<div>
		<p>
			<font color="red">${errorMessage} </font>
		</p>
		<form action="./login" method="POST">
			User Name : <input name="name" type="text" /> Password :  <input
				name="password" type="password" /> <input type="submit" />

		</form>
	</div>
</body>
</html>
