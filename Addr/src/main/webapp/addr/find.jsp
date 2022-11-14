<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	function findChk(a){
		
		if(a.num.value==""){
			alert('값을 입력하세요');
			return false;
		}
		a.submit();
	}
</script>

</head>
<body>

	<form action="<%=request.getContextPath()%>/control?type=update" method="post">
		조회/수정하실 번호검색:
		<input type="text" name="num">
		<input type="button" value="검색하기" onclick="findChk(this.form)">
		<br>
	</form>

	<form action="<%=request.getContextPath()%>/control?type=delete" method="post">

		삭제하실 번호 검색:<input type="text" name="num">
		<input type="button" value="삭제하기" onclick="findChk(this.form)">

	</form>
</body>
</html>