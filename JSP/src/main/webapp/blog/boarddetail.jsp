<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>

<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/blog/css/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/blog/css/boarddetail.css">
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
	<c:if test="${not empty vo}">
		<main id="detailmain_con">
			<div class="detail_box">
				<div class="detail_tag">
					<h3>글 상세보기</h3>
				</div>
				<div class="de detail_num">
					<p class="p1">번호</p>
					<p class="p2">${vo.board_num}</p>
				</div>
				<div class="de detail_text">
					<p class="p1">제목</p>
					<p class="p2">${vo.board_text}</p>
				</div>

				<div class="de detail_name">
					<p class="p1">작성자</p>
					<p class="p2">${vo.board_name}</p>

				</div>
				<div class="de detail_date">
					<p class="p1">작성일</p>
					<p class="p2">${vo.board_date}</p>

				</div>
				<div class="de detail_count">
					<p class="p1">조회수</p>
					<p class="p2">${vo.board_count}</p>

				</div>
				<div class="de detail_con">
					<p class="p1">내용</p>
					<p class="p2">${vo.board_content}</p>

				</div>
				<div class="detail_btn">
					<button type="button" onclick="location.href='${pageContext.request.contextPath}/BoardCon?type=edit'">수정하기</button>
					<button type="button" onclick="location.href='${pageContext.request.contextPath}/BoardCon?type=list'">돌아가기</button>


				</div>


			</div>


		</main>

	</c:if>
	<c:if test="${empty vo }">
		<main id="detailmain_con">
			<div class="detail_box">
				<div class="detail_tag">
					<h3>글 상세보기</h3>
				</div>
				<div class="de detail_num">
					<p class="p1">번호</p>
					<p class="p2"></p>
				</div>
				<div class="de detail_text">
					<p class="p1">제목</p>
					<p class="p2"></p>
				</div>

				<div class="de detail_name">
					<p class="p1">작성자</p>
					<p class="p2"></p>

				</div>
				<div class="de detail_date">
					<p class="p1">작성일</p>
					<p class="p2"></p>

				</div>
				<div class="de detail_count">
					<p class="p1">조회수</p>
					<p class="p2"></p>

				</div>
				<div class="de detail_con">
					<p class="p1">내용</p>
					<p class="p2">존재하지 않는 글입니다.</p>

				</div>
				<div class="detail_btn">					
					<button type="button">돌아가기</button>


				</div>


			</div>


		</main>

	</c:if>

		<c:import url="footer.jsp"></c:import>

	</div>
</body>
</html>