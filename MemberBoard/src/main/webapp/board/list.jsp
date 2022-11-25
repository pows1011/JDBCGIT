<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList" import="board.Article"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function a(num,pwd,type){
		var a=parseInt(prompt("비밀번호를 입력","0"));		
		if(a!=pwd){
			alert('비밀번호가 틀림');
			return false;
		}
		
		location.href="<%=request.getContextPath()%>/BoardController?num="+num+"&type="+type;
		
		
	}
</script>
</head>
<body>
	<%
	ArrayList<Article> list = (ArrayList<Article>) request.getAttribute("list");
	String id = (String) session.getAttribute("id");
	%>


	<table border="1">
		<tr>
			<th>글번호</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>내용</th>
		</tr>

		<%
		for (int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td><%=list.get(i).getNum()%></td>
			<td><%=list.get(i).getWriter()%></td>
			<td><%=list.get(i).getW_date()%></td>
			<td><%=list.get(i).getContent()%></td>

			<td>
				<%
				if (id.equals(list.get(i).getWriter())) {
				%> <input type="button" value="edit"
					onclick="a(<%=list.get(i).getNum()%>,<%=list.get(i).getPwd()%>,'editForm')">
				<input type="button" value="del"
					onclick="a(<%=list.get(i).getNum()%>,<%=list.get(i).getPwd()%>,'del')">

				<%
				}
				%>
			</td>
		</tr>

		<%
		}
		%>
	</table>
	<button onclick="location.href='<%=request.getContextPath()%>/member/result.jsp'">메뉴로</button>
	<button onclick="location.href='<%=request.getContextPath()%>/board/form.jsp'">글 작성하기</button>


</body>
</html>