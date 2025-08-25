<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	/* 문자셋 설정 먼저 넣어줘야 깨지지 X */
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
%>

<jsp:useBean id="dto" class="Ch02.UserDto" scope="request" />
<jsp:setProperty name="dto" property="*" /> <!-- setProperty name = useBean id -->
<%
	// 1 C05Form.html에서 전달되는 각 파라미터들을 저장할 단위(dto)를 만드세요
	// (UserDto)
	// 2 액션태그를 이용해서 모든 파라미터를 UserDto 단위로 저장합니다
	// 3 화면에 UserDto에 저장된 내용을 출력해서 보여줍니다(UserDto 내에 toString재정의)
	System.out.println("dto : " + dto);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Dto : <%=dto %><br/>
</body>
</html>