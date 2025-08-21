<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--
	SCRIPTLET : JSP에서 Servlet 파일로 변환될 때 Servlet내의 Service함수 안에서 처리되는 로직
	Service 함수내에서 동작하기 때문에 변수를 선언하는 경우에는 지역변수가 되고, 반복문/분기문 처리가 가능하다
	하지만 함수를 벗어나면 지역변수는 소멸되기때문에 요청(ex. 새로고침)되면 상태값은(지역변수값) 초기화된다 
-->

<!-- <% %> : 여기에 있는 문장 먼저  -->
<%
	String str1 = "HELLO1";
	String str2 = "HELLO2";
	String str3 = str1 + str2;
	int a=0;
	/* for(int i=0;i<10;i++){
		a++;
		System.out.println("i : " + i);
	} */
	a++; /* 계속 지역변수가 생성되었다가 소멸됨을 반복해서 새로고침해도 a증가 X */
%>

str1 : <%=str1 %><br>
str2 : <%=str2 %><br>
str3 : <%=str3 %><br>
a	 : <%=a %><br>

</body>
</html>