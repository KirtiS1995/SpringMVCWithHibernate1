<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1>Employee Registration</h1>

</head>

<body>


	<form action="saveEmployee" Method="post">

		<table>
			<tr>
				<td>EMPLOYEE NAME</td>
				<td><input type="text" name="empName"></td>
			</tr>

			<tr>
				<td>EMPLOYEE ADDR</td>
				<td><input type="text" name="empAddr"></td>
			</tr>

			<tr>
				<td>EMPLOYEE EMAIL</td>
				<td><input type="text" name="empEmail"></td>
			</tr>

			<tr>
				<td><input type="submit" value="REGISTER"></td>
			</tr>

		</table>

	</form>

</body>
</html>