<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit page</title>
</head>
<body>
<hr>
<form action="updateEmployee" method="post">
<label>Employee id:</label>
<input type="number" value="${employee.employeeId}" name="empId" readonly/>
<br>
<label>Employee Name:</label>
<input type="text" name="empName" value="${employee.employeeName}" required/>
<br>
<label>Employee salary:</label>
<input type="number" name="empSalary" value="${employee.employeeSalary}" required />
<br>
<label>Employee Department:</label>
	<select name="empDept"  required >
		<option value="${employee.employeeDepartment}">${employee.employeeDepartment}</option>
		<option value="IT">IT</option>
		<option value="ADMIN">ADMIN</option>
		<option value="ACCOUNTS">ACCOUNTS</option>
		<option value="HR">HR</option>
	</select>
<br>
<input type="submit" value="edit"/>
</form>
</body>
</html>