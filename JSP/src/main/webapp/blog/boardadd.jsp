<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/blog/css/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/blog/css/boardadd.css">
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

		<main id="boardadd_maincon">
			<div class="boardadd_box">
				<div class="boardadd_tag">
					<h3>게시판 글생성</h3>
				</div>
				<div class="board_addform">
				
					<form class="board_form"
						action="${pageContext.request.contextPath}/BoardCon?type=boardAdd"
						method="post" enctype="multipart/form-data">
						<input type="text" name="board_text" placeholder="제목" class="bdtx">
						<input type="text" name="board_name" placeholder="작성자" value="${sessionScope.id}" class="bdtx" readonly>
						
						<input type="file" name="board_img" value="이미지 등록" style="display: none"
							id="input-file">
						<textarea placeholder="글 내용" name="board_content"></textarea>
						<label for="input-file">
							<div class="filediv">파일 업로드</div>
						</label>
						<div class="boardform_btn">
							<button type="submit">작성완료</button>
							<button type="reset">다시작성</button>
							<button type="button"
								onclick="${pageContext.request.contextPath}/blog/board.jsp">게시판
								목록</button>
						</div>
					</form>
				</div>
			</div>

		</main>
		<c:import url="footer.jsp"></c:import>

	</div>

</body>
</html>