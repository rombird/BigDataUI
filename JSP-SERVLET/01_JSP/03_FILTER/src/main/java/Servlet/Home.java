package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = {"/index.do"})
public class Home extends HttpServlet{
	
	// 외부에서 index.do를 연결하면 index.jsp로 이동
	// source -> override.. -> doGet() 체크
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET /index.do...");
		req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp); // 실제 경로 설정
		
		
	}
	
	
	
}
