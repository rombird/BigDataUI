<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- JSP를 JS에 연결 -->    
<%
	String msg1 = "HELLO WORLD1";
	String msg2 = "HELLO WORLD2";
	
	// pageContext, request, session, application
	// scope 특정한 상황동안에만 값을 유지하는 객체
	request.setAttribute("msg3", "HELLO WORLD3");
	request.setAttribute("msg4", "HELLO WORLD4");
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<script>
		const m1 = '<%=msg1 %>'		// 표현식
		const m2 = '<%=msg2 %>'		// 표현식 
		const m3 = '${msg3}'		// EL 표현식
		
		// JS의 보간법과 EL 표현식은 다름 -> 헷갈리지 X 
		const m4 = `${m1}`
		console.log(m1)
		console.log(m2)
		console.log(m3)
	</script>
	
</body>
</html>