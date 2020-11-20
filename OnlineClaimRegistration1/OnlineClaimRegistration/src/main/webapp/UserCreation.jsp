<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UserCreation" method="post">
		Enter LoginID <input type="text" name="username" placeholder="Enter loginID" required><br>
		Enter Password <input type="password" name="password" placeholder="Enter password" pattern="[A-Za-z]{3}[0-9]{3}" required><br>
		Rolecode:
		<select name="rolecode" id="rolecode">
			<option value="select">select</option>
			<option value="insured">insured</option>
			<option value="claimhandler">claimhandler</option> 
		</select><br>
		<input type="submit">
	</form>
</body>
</html>