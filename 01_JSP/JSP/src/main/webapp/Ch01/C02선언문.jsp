<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 선언문 -->
<%!
	int n=0;
	public int countUp(){
		n++;
		return n;
	}
%>

<!-- 표현식 : 새로고침할때 마다 서블릿에 있는 카운트함수가 동작하면서 서블릿안에있는 상태값을 증가, 서블릿파일이 동작하고있는 동안 상태값 유지(선언문으로 상태값을 만들고 있는 동안) -->
<!-- servers -> 우클릭 -> stop하면 초기화됨 -->
N : <%=countUp() %>

</body>
</html>