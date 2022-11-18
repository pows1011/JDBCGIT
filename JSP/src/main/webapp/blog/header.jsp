<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<header id="hed_con">
		<div class="hed_tag">
			<c:if test="${empty sessionScope.id}">
				<a href="${pageContext.request.contextPath}/blog/login.jsp">LOGIN</a>				
				<a href="${pageContext.request.contextPath}/blog/Index.jsp">HOME</a>
			</c:if>
			
			<c:if test="${not empty sessionScope.id}">
				<a href="${pageContext.request.contextPath}/MemberCon?type=logout">LOGOUT</a>
				<a href="#">${sessionScope.id}님 마이페이지</a>
				<a href="${pageContext.request.contextPath}/blog/Index.jsp">HOME</a>
			</c:if>
		</div>

		<div class="hed_content_box">
			<div class="hed_content hed_content1">
				<a href="${pageContext.request.contextPath}/BoardCon?type=list">게시판</a>
			</div>
			<div class="hed_content hed_content2">
				<a href="#">HTML/CSS/JS</a>
			</div>
			<div class="hed_content hed_content3">
				<a href="#">자바</a>
			</div>
			<div class="hed_content hed_content4">
				<a href="#">JSP/서블릿</a>
			</div>
			<div class="hed_content hed_content5">
				<a href="#">스프링</a>
			</div>
		</div>
	</header>
</body>
</html>