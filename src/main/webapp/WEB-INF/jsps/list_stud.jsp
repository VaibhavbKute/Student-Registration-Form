<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>All Student List</title>
	<style>
		body {
			margin: 0;
			padding: 0;
			font-family: Arial, sans-serif;
			background-color: #f5f5f5;
		}
		h1 {
			color: #008080;
			margin-top: 20px;
			margin-bottom: 20px;
			text-align: center;
		}
		table {
			margin: 0 auto;
			border-collapse: collapse;
			background-color: #fff;
			box-shadow: 0 0 10px rgba(25, 0, 0,0.5);
		}
		th, td {
			padding: 10px;
			text-align: center;
			border: 1px solid #ddd;
		}
		th {
			background-color: rgba(99, 183, 255, 0.4);
			font-weight: normal;
		}
		td a {
			display: block;
			text-decoration: none;
			color: #333;
			font-size: 14px;
			padding: 6px 10px;
			background-color: #f2f2f2;
			border-radius: 3px;
			transition: all 0.3s ease;
		}
		td a:hover {
			background-color: #ddd;
		}
	</style>
</head>
<body>
	<h1>All Students List</h1>
	<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Stream</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="stud" items="${stud}">
				<tr>
					<td>${stud.firstName}</td>
					<td>${stud.lastName}</td>
					<td>${stud.stream}</td>
					<td>${stud.email}</td>
					<td>${stud.mobile}</td>
					<td>
						<a href="delete?id=${stud.id}">Delete</a> 
					</td>
					<td>
						<a href="update?id=${stud.id}">Update</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>