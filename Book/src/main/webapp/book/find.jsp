<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList" import="model.BookVo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/control?type=update" method="post">
		수정 및 조회하실 책의 번호:
		<input type="text" name="num">
		<input type="submit" value="검색하기">
	</form>

	<form action="<%=request.getContextPath()%>/control?type=delete" method="post">
		삭제하시려는 책의 번호:
		<input type="text" name="num">
		<input type="submit" value="삭제하기">
	</form>
</body>
</html>