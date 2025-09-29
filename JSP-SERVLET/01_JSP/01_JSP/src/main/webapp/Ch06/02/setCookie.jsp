<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Cookie cookie1 = new Cookie("c1", "v1");
	cookie1.setMaxAge(60*10); // 10분
	cookie1.setPath("/"); // 도메인 내에 모든 URI 접근 가능하도록 쿠키 활성화(http://localhost:8090 - 최상위경로)
	// 쿠키의 유지기간(-1 : 기본값(파일생성X, 브라우저가 종료될때까지 쿠키 유지))
	
	Cookie cookie2 = new Cookie("c2", "v2");
	cookie2.setMaxAge(60*10); 
	cookie2.setPath("./"); // 현재위치 쿠키 활성화 - http://localhost:8090/JSP/Ch06/02/*
	
	Cookie cookie3 = new Cookie("c3", "v3");
	cookie3.setMaxAge(60*10);
	cookie3.setPath("/JSP/Ch01"); // 특정 URL경로를 기준으로 쿠키 활성화
	
	response.addCookie(cookie1); 
	response.addCookie(cookie2);
	response.addCookie(cookie3);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>