<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>LOGIN PAGE</h1>
	<!-- action="/join.do"로 하면 문제 생김 -> 실행해서 폼에 작성하고 버튼까지 누르면 오류(프로젝트경로가 사라짐) -->
	<form action="${pageContext.request.contextPath}/login.do" method="post">
		<input name="username" /><br/>
		<input type="password" name="password" /><br/>
		<button>로그인</button>
	</form>
	<div>
		${message}
	</div>
</body>
</html>