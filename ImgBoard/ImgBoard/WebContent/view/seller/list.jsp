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
	<h3>게시판</h3>
	<c:if test="${not empty list}">
		<table border="1">
			<tr>
				<th>번호</th>
				<th>제품명</th>
				<th>수량</th>
				<th>가격</th>
			</tr>
			<c:forEach var="blist" items="${list}">
			<tr>
				<td>${blist.num}</td>
				<td><a href="${pageContext.request.contextPath}/seller/detail?num=${blist.num}">${blist.name}</a></td>
				<td>${blist.quantity}</td>
				<td>${blist.price}</td>
			</tr>
			</c:forEach>
		</table>
		<button
			onclick="location.href='${pageContext.request.contextPath}/seller/AddForm'">게시글생성</button>
	</c:if>

	<c:if test="${empty list }">
		<h3>게시글이 존재하지 않습니다</h3>
		<button
			onclick="location.href='${pageContext.request.contextPath}/view/seller/addForm.jsp'">게시글생성</button>
	</c:if>

</body>
</html>