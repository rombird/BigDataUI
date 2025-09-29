<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@page import="java.io.*,java.util.zip.*" %>
<%

	//Dir경로 생성
	String dirPath = pageContext.getServletContext().getRealPath("/")+"Ch07\\files\\"; // files 안에 있는 모든 파일
	System.out.println("dirPath : " + dirPath);
	
	File dir = new File(dirPath);
	File fileList[] = dir.listFiles(); // files 안에 있는 모든 파일을 가져오기 위해 
	
	for(File f : fileList)
		System.out.println(f); // files 안에 어떤 file이있는지 확인

	try{
		
		FileInputStream in = null;
		ZipEntry zipEntry = null;

		//내장객체(Out)정리
		out.clear();					//response outStream을 닫고 버퍼를 비움
		out = pageContext.pushBody(); 	//현재페이지에 Body 연결
		
		//OutStream 가져오기
		ServletOutputStream bout = response.getOutputStream();
		
		//추가 - 보조outstream
		ZipOutputStream zout = new ZipOutputStream(bout);
		
		//response의 Header변경(중요!)
		response.setHeader("Content-Type","application/octet-stream;charset-utf-8");
		response.setHeader("Content-Disposition","attachment; filename=ALLFILES.zip"); // 파일명 정의
		
		for(File file : fileList){
			
			in = new FileInputStream(file);	// 기본 InputStream 연결
			zipEntry = new ZipEntry(file.getName().toString());// ZipEntry객체 생성
			
			zout.putNextEntry(zipEntry);
			
			while(true){
				int data = in.read();
				if(data==-1)
					break;
				zout.write((byte)data);
			}
			zout.closeEntry();
			in.close();
		}
		zout.flush();
		zout.close();
		bout.close();

		
	}catch(Exception e){
		e.printStackTrace();
	} 
%>