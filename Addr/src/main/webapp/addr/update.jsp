<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function editChk(a) {


		if (a.name.value == "") {
			alert('이름을 작성하세요');
			a.name.focus();
			return false;
		}
		if (a.tel.value == "") {
			alert('전화번호를 작성하세요');
			a.tel.focus();
			return false;
		} else if (isNaN(a.tel.value)) {
			alert('전화번호는 숫자만 입력가능합니다');
			a.tel.focus();
			return false;

		} 

		if (a.address.value == "") {
			alert('주소를 작성하세요');
			a.address.focus();
			return false;
		}
		if (a.postal.value == "") {
			alert('우편번호를 작성하세요');
			a.postal.focus();
			return false;
		} else if (isNaN(a.postal.value)) {
			alert('우편번호는 숫자만 입력');
			a.postal.focus();
			return false;
		} else if (a.postal.value.length == 5) {
			alert('우편 번호는 5자 입니다');
			a.postal.focus();
			return false;
		}
		a.submit();
	}
</script>
</head>
<body>
	<%
	Member m = (Member) request.getAttribute("m");
	%>

	<form action="<%=request.getContextPath()%>/control?type=edit" method="post">

		<table border="1">
			<tr>
				<th>번호</th>
				<td><input type="text" name="num" value="<%=m.getNum()%>" readonly></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" value="<%=m.getName()%>"></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="tel" name="tel" value="<%=m.getTel()%>"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" name="address" value="<%=m.getAddress()%>"></td>

			</tr>
			<tr>
				<th>우편번호</th>
				<td><input type="text" name="postal" value="<%=m.getPostal()%>"></td>
			</tr>

		</table>

		<input type="button" value="변경 하기" onclick="editChk(this.form)">
	</form>
</body>
</html>