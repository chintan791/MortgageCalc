<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mortgage Calculator</title>
</head>
<body>
<form action="MainServlet" method="post">
            Principal:
			<input type="text" name="principal"> <br>
			Rate:
			<input type="text" name="rate"> <br>
			Term:
			<input type="text" name="term"> <br>
			<input type="submit"><br>
			
	</form>
</body>
</html>