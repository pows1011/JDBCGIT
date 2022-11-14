<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.BookVo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
		function editChk(a){
			if(a.author.value==""){
				alert('작가명을 쓰세요');
				a.author.focus();
				return false;
			}
			if(a.title.value==""){
				alert('제목을 쓰세요');
				a.title.focus();
				return false;
			}
			if(a.publisher.value==""){
				alert('출판사를 쓰세요');
				a.publisher.focus();
				return false;
			}
			if(a.content.value==""){
				alert('설명을 쓰세요');
				a.content.focus();
				return false;
			}
			a.submit();
		}
</script>

</head>
<body>
	<%
	BookVo vo = (BookVo) request.getAttribute("vo");
	%>
	<form action="<%=request.getContextPath()%>/control?type=edit" method="post">

		<table border="1">

			<tr>
				<th>번호</th>
				<td><input type="text" name="num" value="<%=vo.getNum()%>" readonly></td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td><input type="text" name="author" value="<%=vo.getAuthor()%>"></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" value="<%=vo.getTitle()%>"></td>
			</tr>
			<tr>
				<th>출판사</th>
				<td><input type="text" name="publisher" value="<%=vo.getPublisher()%>"></td>
			</tr>
			<tr>
				<th>상세설명</th>
				<td><textarea cols="15" rows="20" name="content"><%=vo.getContent()%></textarea></td>
			</tr>

		</table>
		<input type="button" onclick="editChk(this.form)" value="수정하기">
	</form>

</body>
</html>

