<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>JSP and Servlet Tutorial</title>
</head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<body>
	<div>
		<p>
			<font color="red">${errorMessage} </font>
		</p>
		<form:form action="./login" method="POST" commandName="login">
			<form:label path="name">Name</form:label>
			<form:input path="name" name="name" type="text" /> 
			<form:label path="password">Password</form:label>
			<form:password
				path="password" name="password" />
			<button type="submit" class="btn btn-sucess">Log In</button>

		</form:form>
	</div>

	<script src="webjars/jquery/3.1.0/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>