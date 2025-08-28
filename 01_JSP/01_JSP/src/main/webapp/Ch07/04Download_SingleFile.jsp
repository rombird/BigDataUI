<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.io.*" %>

<% 
	// http://192.168.5.50:8090/JSP/Ch07/04Download_SingleFile.jsp -> 다른컴퓨터 웹에 접속해 파일 받아짐
	// servlet의 실제 경로 : JSP 까지  +"Ch07\\files\\" 추가
	String dirPath = pageContext.getServletContext().getRealPath("/") + "Ch07\\files\\";  
	System.out.println("dirPath : " + dirPath);

	try{
		//INPUT STREAM
		InputStream fin = new FileInputStream(dirPath + "test1.pdf");
		
		//OUTPUT STREAM
		// 내장객체를 초기화하기 위해 기본작업
		out.clear(); 					// response outStream을 닫고 버퍼 초기화
		out = pageContext.pushBody(); 	// 현재 페이지의 Body에 out 연결
		ServletOutputStream bout = response.getOutputStream();
		
		// ! Response Header Setting - 중요
		// 응답할 때 브라우저에게 어떤식으로 해라라는것을 지시
		response.setHeader("Content-Type", "application/octet-stream;charset-utf-8"); // 해당 jsp 파일을 다운로드 처리
		response.setHeader("Content-Disposition","attachment; filename=test1.pdf");
		byte [] buff = new byte[4096];
		while(true){
			int data = fin.read(buff); 
			if(data==-1)
				break;
			bout.write(buff,0,data);
			bout.flush();
		}
		bout.close();
		fin.close();
		
	}catch(Exception e){
		
	}

%>