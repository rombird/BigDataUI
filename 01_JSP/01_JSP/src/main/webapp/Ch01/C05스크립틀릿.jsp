<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.*" %>
<%
	System.out.println("몇 단? >>> ");
	Scanner sc = new Scanner(System.in);
	int dan = sc.nextInt();
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		단수 입력받아 해당 구구단을 찍어보세요 Table로 만드세요 - 스크립틀릿
	-->
	<table>
		<summary><%=dan %>단</summary>
		<tbody>
			<%
			for(int i=1;i<10;i++){
			%>
			<tr>
				<td><%=dan %></td>
				<td>X</td>
				<td><%=i %></td>
				<td>=</td>
				<td><%=dan*i %></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>


</body>
</html>