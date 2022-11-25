<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList" import="model.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%


		ArrayList<MemberVO> list = (ArrayList<MemberVO>) request.getAttribute("list");
	%>

	<table>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>우편번호</th>
		</tr>

		<%
		for (int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td><%=list.get(i).getNum() %></td>
			<td><%=list.get(i).getName() %></td>
			<td><%=list.get(i).getTel()%></td>
			<td><%=list.get(i).getAddress()%></td>
			<td><%=list.get(i).getPostal()%></td>
		</tr>

		<%
		}
		%>
	</table>

</body>
</html>