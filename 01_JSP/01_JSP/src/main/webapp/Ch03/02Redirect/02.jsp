<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	redirect 클라이언트에서 한번더 요청을 하도록 함
	즉, 브라우저입장에서는 한번 요청했는데 리다이렉트가 걸리면 한번 더 요청해야되는 것
	새롭게 요청하는거니까 처음 요청하는 건 초기화됨	
	ex. 회원가입후 메인페이지 이동 

-->

<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	request.setAttribute("C02", "C02_value"); 
	// redirect - 새롭게 요청하는 것 3번으로 요청했을 때 username, password요청이 어려움 -> null로 보여짐
	// 방법 1. 파라미터 전달방법 : queryString으로 전송
	response.sendRedirect("./03.jsp?username="+username+"&password="+password); 
	// 방법 2. 스코프를 이용(Session / Application)
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>02.jsp PAGE</h1>
	USERNAME : <%=username %><br/>
	PASSWORD : <%=password %><br/>
	
</body>
</html>