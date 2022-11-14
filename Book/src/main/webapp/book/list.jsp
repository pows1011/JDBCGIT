<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList" import="model.BookVo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		<%ArrayList<BookVo> list=(ArrayList<BookVo>)request.getAttribute("list"); %>
<table border="1">
	<tr>
		<th>번호</th>
		<th>글쓴이</th>
		<th>제목</th>
		<th>출판사</th>
		<th>설명</th>
	</tr>
	<%
		for(int i=0;i<list.size();i++){
	%>
	
	<tr>
		<td><%=list.get(i).getNum() %></td>
		<td><%=list.get(i).getAuthor()%></td>
		<td><%=list.get(i).getTitle()%></td>
		<td><%=list.get(i).getPublisher()%></td>
		<td><%=list.get(i).getContent()%></td>		
	</tr>
	
	<%
		}
	%>
</table>

</body>
</html>




