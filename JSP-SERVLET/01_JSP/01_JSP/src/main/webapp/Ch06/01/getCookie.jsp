<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- <%
	// 5분 지나면 쿠키 없어짐 -> setCookie.jsp 먼저 실행 후 getCookie.jsp 실행하면 console 창에 출력됨
	Cookie[] cookies = request.getCookies();
	if(cookies!=null){
		for(Cookie cookie : cookies){
			System.out.println(cookie.getName() + " : " + cookie.getValue());
		}
	}

%>   --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	if(cookies!=null){
		for(Cookie cookie : cookies){
			System.out.println(cookie.getName() + " : " + cookie.getValue());
			%>
			<a href="./deleteCookie.jsp?name=<%=cookie.getName()%>">쿠키삭제(<%=cookie.getName()%>)</a><br/>
			<%
		}
	}

%> 
</body>
</html>