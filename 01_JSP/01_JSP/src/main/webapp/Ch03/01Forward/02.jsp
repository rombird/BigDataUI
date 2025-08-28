<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 01에서 전송버튼 누르면 입력한 값들을 username, password는 파라미터 명으로 해당위치로 이동 
	02는 요청되는 값을 받아서 백엔드에서 보관했다가 응답할 때 body 부분에서 응답 
-->
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	request.setAttribute("C02", "C02_value"); // key, value를 넣어서 이동하면 새로운 요청이 일어난게 아니라 내용을 그대로 간직하면서 3jsp로 이동하고 
	
	// forwarding - 02.jsp 파일에서 03.jsp 파일로 이동
	// 원래라면 요청하면 기본흐름대로 가는데 forward를 하면 내가 원하는 위치로 감
	// 02번 페이지라고 뜨지 않고 03 페이지의 body내용으로 뜸 단 링크는 02
	request.getRequestDispatcher("./03.jsp").forward(request,response);
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