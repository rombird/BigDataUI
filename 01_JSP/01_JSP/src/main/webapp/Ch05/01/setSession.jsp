<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// Request 객체- 요청하는 동안 1번만 유지
	request.setAttribute("test1", "test1_value");
	
	// Session 객체 - 지정된 시간까지 유지, 기본 1800초(30분) <- tomcat이 활성화되어있는 경우에
	session.setAttribute("test2", "test2_value");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="./getSession.jsp"> 속성확인 페이지로 이동 </a>
</body>
</html>