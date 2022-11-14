<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
		function addChk(a){
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
 	<form action="<%=request.getContextPath() %>/control?type=insert" method="post"> 
 		<input type="text" name="author" placeholder="작가"> <br>
 		<input type="text" name="title" placeholder="제목"> <br>
 		<input type="text" name="publisher" placeholder="출판사"><br> 
 		<textarea rows="15" cols="25" name="content" placeholder="설명문"></textarea><br>
 		
 		<input type="button" onclick="addChk(this.form)" value="책 등록하기">
 	</form>

</body>
</html>