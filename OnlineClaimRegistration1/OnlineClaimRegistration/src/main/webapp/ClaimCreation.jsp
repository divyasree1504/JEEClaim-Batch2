<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ClaimCreation" method="post">
		Claim Reason:<textarea id="claimreason" name="claimreason" rows="1" cols="10" required></textarea><br>
		Accident Location:<textarea id="accidentlocation" name="accidentlocation" rows="1" cols="10"></textarea><br>
		Accident City:<textarea id="accidentcity" name="accidentcity" rows="1" cols="10"></textarea><br>
		Accident State:<textarea id="accidentstate" name="accidentstate" rows="1" cols="10"></textarea><br>
		Accident Zip:<textarea id="accidentzip" name="accidentzip" rows="1" cols="10"></textarea><br>
		Claim Type:<select name="claimtype" id="claimtype">
		<option value="select">select</option>
			<option value="businessauto">businessauto</option>
			<option value="restaurant">restaurant</option> 
			<option value="apartment">apartment</option> 
			<option value="generalmerchant">generalmerchant</option> 
		</select><br>
		<input type="submit" name="submit">
		</form>
</body>
</html>