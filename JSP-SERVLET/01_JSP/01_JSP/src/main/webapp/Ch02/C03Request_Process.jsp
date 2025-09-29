<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- page 설정해주면 java파일에서 만든 클래스 ProfileDto 사용가능  -->
<%@ page import="Ch02.ProfileDto" %>
<%
	/* 
		request 내장객체 : 요청정보값(Http Request Protocol의 구조형태)
	*/
	
	/* 문자셋 설정 */
	request.setCharacterEncoding("UTF-8"); /* 한글 인식 */
	response.setContentType("text/html; charset=UTF-8"); /* 타입을 잘 지정해야지 문서로 해석되거나 아니거나 */
	
	/* 수동으로 만들고 있는데 대신 필드를 Dto로 묶어주기 작업을 사용하면 편리 */
	String username = request.getParameter("username");
	String age = request.getParameter("age");
	String addr = request.getParameter("addr");
	ProfileDto dto = new ProfileDto(username, age, addr);
	System.out.println("dto : " + dto);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>내 컴퓨터 Process File</h1>
	ProfileDto : <%=dto %><br/>

</body>
</html>