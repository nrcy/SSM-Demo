<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*,top.nrcynet.dao.bean.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>demo</title>
</head>
<body>
	<h1>这是由UrlController转发实现的jsp页面</h1>
	<table align="center">
	<thead>
		<tr>
			<th>id</th>
			<th>姓名</th>
			<th>籍贯</th>
		</tr>
	</thead>
	<tbody>
	<%
	List<Employee> employees = (List<Employee>)request.getAttribute("employees"); 
	for(Employee employee : employees){
		%>
		<tr>
			<td>
				<%=employee.getId() %>
			</td>
			<td>
				<%=employee.getName() %>
			</td>
			<td>
				<%=employee.getAddress() %>
			</td>
		<tr>
		<%
	}
	%>
	</tbody>
	</table>
</body>
</html>