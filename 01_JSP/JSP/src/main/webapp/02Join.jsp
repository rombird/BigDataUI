<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 문제 : 선언문(적절한 클래스 import 하기) -->
<%@ page import="Dtos.*,Utils.*" %>

<%!
	/* 문제 : 유효성 검증함수 만들기 */
	public boolean isValid(MemberDto dto){
		// 1) 각 항목 not null (message : '-' 를 입력하세요 - System.out 으로 출력후 false)
		if(dto.getUserid().isEmpty()){
			System.out.println("Userid를 입력하세요.");
			return false;
		}
		if(dto.getPassword().isEmpty()){
			System.out.println("Password를 입력하세요.");
			return false;
		}
		if(dto.getRePassword().isEmpty()){
			System.out.println("RePassword를 입력하세요.");
			return false;
		}
		if(dto.getUsername().isEmpty()){
			System.out.println("Username을 입력하세요.");
			return false;
		}
		if(dto.getZipcode().isEmpty()){
			System.out.println("Zipcode를 입력하세요.");
			return false;
		}
		if(dto.getAddr1().isEmpty()){
			System.out.println("Addr1을 입력하세요.");
			return false;
		}
		if(dto.getAddr2().isEmpty()){
			System.out.println("Addr2를 입력하세요.");
			return false;
		}
		if(dto.getPhone1().isEmpty()){
			System.out.println("Phone1을 입력하세요.");
			return false;
		}
		if(dto.getPhone2().isEmpty()){
			System.out.println("Phone2를 입력하세요.");
			return false;
		}
		if(dto.getPhone3().isEmpty()){
			System.out.println("Phone3를 입력하세요.");
			return false;
		}
		if(dto.getTel1().isEmpty()){
			System.out.println("Tel1을 입력하세요.");
			return false;
		}
		if(dto.getTel2().isEmpty()){
			System.out.println("Tel2를 입력하세요.");
			return false;
		}
		if(dto.getTel3().isEmpty()){
			System.out.println("Tel3을 입력하세요.");
			return false;
		}
		if(dto.getEmail().isEmpty()){
			System.out.println("Email을 입력하세요.");
			return false;
		}
		if(dto.getYear().isEmpty()){
			System.out.println("Year를 입력하세요.");
			return false;
		}
		if(dto.getMonth().isEmpty()){
			System.out.println("Month를 입력하세요.");
			return false;
		}
		if(dto.getDay().isEmpty()){
			System.out.println("Day를 입력하세요.");
			return false;
		}
		
		// 2) userid 길이 5자 이하(message : Userid는 5자 이상 입력하셔야 합니다.- System.out 으로 출력후 false)
		if(dto.getUserid().length()<=5){
			System.out.println("Userid는 5자 이상 입력하세요.");
			return false;
		}
		
		// 3) 패스워드 유효성 검증(regex : ^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[\W_]).{8,20}$ )
		//- System.out 으로 출력후 false
		/*i f(dto.getPassword().contains(s)){
			System.out.println("Password는 8자 이상 20자 이하이며 소문자, 대문자, 숫자, 특수기호 하나 이상은 포함해야합니다.");
			return false;
		}*/
		
		return true; // 유효하다면 true 값 반환
	}	
%>    

<%
	/* 문제 : 문자셋 설정 */
	request.setCharacterEncoding("UTF-8"); // 요청할 때 문자셋 설정
	response.setContentType("test/html; charset=UTF-8"); // 응답할 때 문자셋 설정
%>


<!--  
01 문제 : 파라미터 받기 (액션태그 jsp:useBean , jsp:setProperty 로 MemberDto 단위로 받기
-->

<jsp:useBean id="dto" class="Dtos.MemberDto" scope="request"/>
<jsp:setProperty name="dto" property="*" />



<%
	
	try{
		//-----------------------------
		//02 유효성 검증	
		//-----------------------------
		if(!isValid(dto)){
			//유효하지 않는경우에 -> 01Join.html 로 Forwarding
			// response.sendRedirect("./01Join.html");
			request.getRequestDispatcher("./01Join.html").forward(request, response);
			return;
		}
		//-----------------------------
		//03 서비스 처리(회원가입->DB 저장)
		//-----------------------------
		//03-01 db연결
		DbUtils.conn();
		
		//03-02 Tx 시작
		DbUtils.TxStart();
		
		//03-03 동일 계정유무확인
		if(DbUtils.selectMember(dto.getUserid())!=null){ // DB에 저장된 userid가 null이 아니라면 = 이미 존재한다면
			System.out.println("기존 계정이 존재합니다");
			request.getRequestDispatcher("./01Join.html").forward(request, response);
			return;
		}
		
		//03-04 계정정보 저장			
		int result = DbUtils.insertMember(dto); // insertUser에 저장된 값을 result에 저장
		if(result<=0){
			System.out.println("회원가입에 실패했습니다.");
			request.getRequestDispatcher("./01Join.html").forward(request, response);
			return;
		}
		
		//03-05 Tx 종료
		DbUtils.TxEnd();
		
		//03-06 연결해제
		// DbUtils.disConn();
		
		//-----------------------------
		//04 로그인 페이지로 이동
		//-----------------------------
		//04-01 "회원가입을 완료했습니다" 를 system.out 으로 출력
		System.out.println("회원가입을 완료했습니다.");
		//04-02 Login.jsp 로 리다이렉트
		response.sendRedirect("./03Login.jsp"); // 회원가입 완료되면 login 페이지 띄우기
		
	}
	catch(Exception e){
		// "문제 발생 ROLLBACK" system.out 출력
		System.out.println("문제 발생 ROLLBACK");
		// TX ROLLBACK 처리
		DbUtils.RollBack();
	}
		
%>