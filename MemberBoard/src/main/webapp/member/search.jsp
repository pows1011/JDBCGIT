<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="member.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Member m = (Member)request.getAttribute("m");
%>
	<h3>내정보수정</h3>
	<form name="f" action="<%=request.getContextPath() %>/Conroller?type=edit"
		method="post">
		<table border="1">
			<tr>
				<td>id</td>
				<td><input type="text" name="id" value="<%=m.getId() %>" readonly>
				</td>
			</tr>
			<tr>
				<td>pwd</td>
				<td><input type="password" name="pwd" value="<%=m.getPwd() %>"></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" value="<%=m.getName() %>" readonly></td>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="text" name="email" value="<%=m.getEmail() %>"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정"></td>
			</tr>
		</table>
	</form>



</body>
</html>