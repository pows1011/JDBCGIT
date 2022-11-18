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
	<h3>상품 등록</h3>
	<form action="${pageContext.request.contextPath }/seller/Add" method="post"
		enctype="multipart/form-data">
		<table>
			<tr>
				<th>제품명</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>수량</th>
				<td><input type="text" name="quantity"></td>
			</tr>
			<tr>
				<th>가격</th>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<th>이미지파일</th>
				<td><input type="file" name="img"></td>
			</tr>
			<tr>
				<th>상세설명</th>
				<td><textarea cols="30" rows="20" name="content"></textarea></td>
			</tr>
		</table>
		<input type="submit" value="등록">
		
	</form>
</body>
</html>