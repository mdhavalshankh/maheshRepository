<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
	<div align="center">
		<h1>New/Edit Emp</h1>
		<form:form action="addEmp" method="post" modelAttribute="emp">
			<table>
				<form:hidden path="empId"/>
				<tr>
					<td>Name:</td>
					<td><form:input path="name" /></td>
				</tr>
				<form:hidden path="empAddr.addId"/>
				<tr>
					<td>Address:</td>
					<td><form:input path="empAddr.city" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>