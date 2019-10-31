<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
</head>
<body>
	<div align="center">
    <h1>User List</h1>
    <a href="/new">Create New User</a>
    <br/><br/>
    <table border="1" cellpadding="10">
        <thead>
            <tr>
                <th>User ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Gender</th>
                <th>Birth Date</th>
                <th>Email Id</th>
                <th>Mobile No</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="user : ${listUsers}">
                <td th:text="${user.user_id}">Product ID</td>
                <td th:text="${user.first_name}">Name</td>
                <td th:text="${user.last _name}">Brand</td>
                <td th:text="${user.gender}">Made in</td>
                <td th:text="${user.dob}">Price</td>
                <td th:text="${user.email_id}">Price</td>
                <td th:text="${user.name}">Price</td>
                <td>
                    <a th:href="/@{'/edit/' + ${user.user_id}}">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a th:href="/@{'/delete/' + ${user.user_id}}">Delete</a>
                </td>
            </tr>
        </tbody>
    </table>
</div>   
</body>
</html>