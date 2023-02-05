<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
	<h1>Send details of Fav Person</h1>
	<form action="favourite" method="post">
		<pre>
First Name<input type="text" name="first" />+
Last Name<input type="text" name="last" />
Gender Male<input type="radio" name="gender" value="male"/>
	Female<input type="radio" name="gender" value="female"/>
	Others<input type="radio" name="gender" value="others"/>
Reason<textarea rows="5" cols="10" name="reason"></textarea>
Address<textarea rows="5" cols="10" name="address"></textarea>
<input type="submit" value="Send" />
</pre>
	</form>
</body>
</html>

