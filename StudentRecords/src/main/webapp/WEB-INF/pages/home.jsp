<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Management Screen</title>
</head>
<body>
    <div align="center">
        <h1>Student List</h1>
        <h3>
            <a href="newStudent">New Student</a>
        </h3>
        <table border="1">
 
            <th>Name</th>
            <th>Address</th>
            <th>Action</th>
 
            <c:forEach var="student" items="${students}">
                <tr>
 
                    <td>${student.name}</td>
                    <td>${student.address}</td>
                    <td><a href="editStudent?id=${student.id}">Edit</a>
                             <a
                        href="deleteStudent?id=${student.id}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>