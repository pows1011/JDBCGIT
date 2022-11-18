<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/blog/css/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/blog/css/memberadd.css">
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

		<main id="addmain_con">
			<div class="addbox_con">
				<div class="addbox_tag">
					<h3>회원 가입</h3>
				</div>
				<div class="box_addform">
					<form class="mem_form" action="${pageContext.request.contextPath}/MemberCon?type=insert" method="post">
						<input type="text" name="id" placeholder="ID">
						<input type="password" name="password" placeholder="Password">
						<input type="text" name="name" placeholder="Name">
						<input type="tel" name="tel" placeholder="Tel">
						<input type="text" name="address" placeholder="Address">
						<input type="email" name="email" placeholder="Email">
						<div class="form_btn">
							<button type="submit">가입완료</button>
							<button type="reset">다시작성</button>
							<button type="button" onclick="${pageContext.request.contextPath}/blog/login.jsp">로그인으로</button>
						</div>
					</form>
				</div>
			</div>

		</main>




		<c:import url="footer.jsp"></c:import>

	</div>

</body>
</html>