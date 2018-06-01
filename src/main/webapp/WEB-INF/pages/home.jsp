<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employees Management Screen</title>
</head>
<body>
    <div align="center">
        <h1>Employees List</h1>
        <h3>
            <a href="newEmp">New Employee</a>
        </h3>
        <table border="1">
 
            <th>Name</th>
            <th>Address</th>
            <th>Action</th>
 
            <c:forEach var="emp" items="${emps}">
                <tr>
 
                    <td>${emp.name}</td>
                    <td>${emp.empAddr}</td>
                    <td><a href="editStudent?id=${emp.empId}">Edit</a>
                             <a
                        href="deleteStudent?id=${emp.empId}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>