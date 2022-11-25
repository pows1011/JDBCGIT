<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String id = (String) session.getAttribute("id");
	%>
	<h3>게시판 글 생성</h3>
<form action="<%=request.getContextPath() %>/BoardController?type=write" method="post">


		<table border="1">
			<tr>
				<td>패스워드</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer" value="<%=id%>" readonly></td>
			</tr>
			<tr>
				<td>글 내용</td>
				<td><textarea rows="20" cols="40" name="content"></textarea></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="가입"> <input
						type="reset" value="취소"></td>
			</tr>
		</table>

	</form>

</body>
</html>