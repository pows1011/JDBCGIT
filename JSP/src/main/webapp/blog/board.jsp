<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/blog/css/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/blog/css/board.css">
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
		<c:if test="${not empty requestScope.list}">
			<main id="boardmain_con">
				<div class="board_box">
					<div class="board_head">

						<ul>
							<li class="board_num">번호</li>
							<li class="board_text">제목</lic>
							<li class="board_name">작성자</li>
							<li class="board_date">날짜</li>
							<li class="board_count">조회수</li>
						</ul>
					</div>



					<div class="board_body">
						<c:forEach var="blist" items="${list}">
							<ul>
								<li class="board_num">${blist.board_num}</li>
								<li class="board_text"><a href="${pageContext.request.contextPath}/BoardCon?type=detail&board_num=${blist.board_num}">${blist.board_text}</a></li>
								<li class="board_name">${blist.board_name }</li>
								<li class="board_date">${blist.board_date}</li>
								<li class="board_count">${blist.board_count}</li>
							</ul>
						</c:forEach>

					</div>

				</div>


				<div class="board_tag">
					<a href="#">< </a>
					<a href="#">1</a>
					<a href="#">2</a>
					<a href="#">3</a>
					<a href="#">4</a>
					<a href="#">5</a>
					<a href="#">></a>
				</div>

				<div class="board_btn">
					<button type="button"
						onclick="location.href='${pageContext.request.contextPath}/blog/boardadd.jsp'">게시글
						생성</button>

				</div>

			</main>
		</c:if>

		<c:if test="${empty requestScope.list }">
			<main id="boardmain_con">
				<div class="board_box">
					<div class="board_head">
						<ul>
							<li class="board_num">번호</li>
							<li class="board_text">제목</lic>
							<li class="board_name">작성자</li>
							<li class="board_date">날짜</li>
							<li class="board_count">조회수</li>
						</ul>
					</div>
					<div class="board_body"></div>
				</div>
				<div class="board_tag">
					<a href="#">< </a>
					<a href="#">1</a>
					<a href="#">2</a>
					<a href="#">3</a>
					<a href="#">4</a>
					<a href="#">5</a>
					<a href="#">></a>
				</div>

				<div class="board_btn">
					<button type="button"
						onclick="location.href='${pageContext.request.contextPath}/blog/boardadd.jsp'">게시글
						생성</button>

				</div>

			</main>
		</c:if>
		<c:import url="footer.jsp"></c:import>
	</div>



</body>
</html>