<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function a(){
		var flag=confirm("삭제 하시겠습니까?",);
		if(flag){
			document.f.action="${pageContext.request.contextPath}/seller/Del?num=${p.num}";
			document.f.submit();
		}else{
			alert("삭제가 취소되었습니다.");
		}
	}
</script>
</head>
<body>

	<c:if test="${not empty p}">
		<form name="f" action="${pageContext.request.contextPath }/seller/Edit"
			method="post">
			<table border="1">
			<tr>
				<th>제품번호</th>
				<td><input type="text" name="num" value="${p.num}" readonly></td>
			</tr>
			<tr>
				<th>제품명</th>
				<td><input type="text" name="name" value="${p.name}"></td>
			</tr>
			<tr>
				<th>수량</th>
				<td><input type="text" name="quantity" value="${p.quantity}"></td>
			</tr>
			<tr>
				<th>가격</th>
				<td><input type="text" name="price" value="${p.price}"></td>
			</tr>
			<tr>
				<th>이미지파일</th>
				<td><img src="${p.img}" width="200" height="200"></td>
			</tr>
			<tr>
				<th>상세설명</th>
				<td><textarea cols="20" rows="10" name="content">${p.content}</textarea></td>
			</tr>
		</table>
				<input type="submit" value="수정">
				<input type="button" value="돌아가기" onclick="location.href='${pageContext.request.contextPath}/seller/List'">
				<input type="button" value="삭제하기" onclick="a()">
			</form>
	</c:if>
	
	<c:if test="${empty p}">
		<h3>존재하지 않는 글</h3>
	</c:if>
</body>
</html>