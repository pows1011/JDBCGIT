<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>회원 가입</h3><br>
	<form action="/ch7/JoinController" method="post">
		<input type="text" name="id" placeholder="아이디"><br/>
		<input type="password" name="password" placeholder="패스워드"><br/>
		<input type="text" name="name" placeholder="이름"><br/>
		<input type="email" name="email" placeholder="이메일"><br/>
		
		<input type="reset" value="재작성">
		<input type="submit" value="가입">
		 
	</form>
	

</body>
</html>