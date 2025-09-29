<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	/* 문자셋 설정 먼저 넣어줘야 깨지지 X */
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
%>

<jsp:useBean id="dto" class="Ch02.TestDto" scope="request" />
<jsp:setProperty name="dto" property="stringtoDate" param="date" />

<jsp:setProperty name="dto" property="*" /> 
<!--파라미터형이 모두 String이어야 함 (ex. int age) 
 	-> 데이터를 적절하게 형변환(String으로 들어와도 중간에 int형으로 변환 시켜줌) 단 날짜는 바꿔주지 X

-->

<%
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
	TestDto : <%=dto %><br/>

</body>
</html>