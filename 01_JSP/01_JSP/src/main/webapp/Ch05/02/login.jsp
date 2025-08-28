<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 01 파라미터 확인
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	// 02 유효성 검사
	if(username.isEmpty()){
		// username을 입력을 하지 않았다면 메시지와 함께 폼으로 다시 전달
		request.setAttribute("username_msg", "username을 입력하세요");
		request.getRequestDispatcher("./login_form.jsp").forward(request, response);
		return; // 여러번 하는 경우 반드시 forward를 하고 return 처리를 해줘야함
	}
	if(password.isEmpty()){
		// username을 입력을 하지 않았다면 메시지와 함께 폼으로 다시 전달
		request.setAttribute("password_msg", "password을 입력하세요");
		request.getRequestDispatcher("./login_form.jsp").forward(request, response);
		return; // 여러번 하는 경우 반드시 forward를 하고 return 처리를 해줘야함
	}
	// 03 관련 서비스 실행
	// 03-01) username과 동일한 계정이 있는지 확인 -> 가져옴
	if(!username.equals("admin")){
		request.setAttribute("username_msg", "해당 계정은 존재하지 않습니다.");
		request.getRequestDispatcher("./login_form.jsp").forward(request, response);
		return;
	}
	// 03-02) password의 값이 입력한 값이라 동일한지 확인
 	if(!password.equals("1234")){
 		request.setAttribute("password_msg", "패스워드가 일치하지 않습니다.");
		request.getRequestDispatcher("./login_form.jsp").forward(request, response);
		return;
 	}
	// 03-03) session에 해당 계정에 작업이 핗요한 속성 저장
	session.setAttribute("isAuth", true);
	session.setAttribute("role", "ROLE_ADMIN");
	session.setMaxInactiveInterval(30); 	// 30초만 세션 유지 
	// 04 뷰로 이동
	response.sendRedirect("./main.jsp");

%>