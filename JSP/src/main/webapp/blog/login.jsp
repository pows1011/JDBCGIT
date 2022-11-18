<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/blog/css/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/blog/css/login.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/blog/css/footer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/blog/css/reset2.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/blog/css/reset.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap"
	rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="container">

		<c:import url="header.jsp"></c:import>

		<main id="loginmain_con">
			<div class="login_boxcon">

				<div class="login_img">
					
				</div>
				<div class="login_text">
					<h3>Login</h3>
					<form action="${pageContext.request.contextPath}/MemberCon?type=login" method="post" class="login_form">
						<input type="text" name="id" placeholder="ID">
						<input type="password" name="password" placeholder="PassWord">
						<button type="submit">로그인</button>
						<button type="button" onclick="location.href='${pageContext.request.contextPath}/blog/memberadd.jsp'">회원 가입</button>
					</form>

				</div>
			</div>
		</main>




		<c:import url="footer.jsp"></c:import>

	</div>
</body>
</html>