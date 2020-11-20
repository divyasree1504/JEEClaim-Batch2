<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UserLogin" method="post">
		Enter LoginID <input type="text" name="username" placeholder="Enter loginID" required><br>
		Enter Password <input type="password" name="password" placeholder="Enter password" required><br>
		Enter Role Code <select name="rolecode" id="rolecode">
			<option value="select">select</option>
			<option value="insured">insured</option>
			<option value="handler">handler</option>
			<option value="adjuster">adjuster</option>
			</select>
		<input type="submit">
	</form>
</body>
</html>