<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<%=request.getContextPath()%>/addr/insert.jsp">등록하기</a>
	<a href="<%=request.getContextPath()%>/control?type=list">모든 정보 조회</a>
	<a href="<%=request.getContextPath()%>/addr/find.jsp">회원 정보 조회 / 수정</a>
	
</body>
</html>