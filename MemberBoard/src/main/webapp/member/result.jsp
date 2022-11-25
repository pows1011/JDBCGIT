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
String vo=(String)session.getAttribute("id"); 
if(vo!=null && !vo.equals("")){%>
<%=vo %>님 로그인 ok!





	<a href="<%=request.getContextPath() %>/Conroller?
type=logout">로그아웃</a>
	<br>
	<a href="<%=request.getContextPath() %>/Conroller?
type=out">탈퇴</a>
	<br>
	<a href="<%=request.getContextPath() %>/Conroller?
type=search">내정보수정</a>
	<br>

	<a href="<%=request.getContextPath() %>/BoardController?
type=boardlist">게시판</a>
	<br>
	<%}else { %>
	<h3>로그인 실패</h3>
	<a href="<%=request.getContextPath() %>/member/login.jsp">로그인 페이지로 가기</a>
	
	<%
	}
	%>
</body>
</html>