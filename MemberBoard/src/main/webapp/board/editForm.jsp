<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="board.Article"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
Article a = (Article) request.getAttribute("a");
%>
</head>
<body>

	<h3>게시판 글 생성</h3>
	<form action="<%=request.getContextPath()%>/BoardController?type=edit"
		method="post">


		<table border="1">
			<tr>
				<td>글번호</td>
				<td><input type="text" name="num" readonly value="<%=a.getNum()%>"></td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td><input type="password" name="pwd" value="<%=a.getPwd()%>"></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer" readonly
						value="<%=a.getWriter()%>"></td>
			</tr>
			<tr>
				<td>작성일</td>
				<td><input type="text" name="w_date" readonly
						value="<%=a.getW_date()%>"></td>
			</tr>
			<tr>
				<td>글 내용</td>
				<td><textarea rows="20" cols="40" name="content"><%=a.getContent()%></textarea></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="수정하기"> <input
						type="reset" value="취소"></td>
			</tr>
		</table>

	</form>
</body>
</html>