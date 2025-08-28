package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

// Request 요청 - 서블릿 파일 매핑 - 요청처리 - 결과 반환(웹페이지)
// request 요청이 왔을 때 현재 servlet 파일에서 매핑을 적절하게 처리하고 그 결과를 반환(웹페이지로)

// URI 처리 - http://localhost:8090/02_SERVLET_INIT/TEST_01
// webservlet 명이 같으면 오류 @WebServlet("/TEST_02")


public class C02Servlet_Test extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		// 서블릿 최초 실행함수
		System.out.println("C02Servlet_Test's INIT() invoke... ");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// 요청시마다 동작하는 함수
		System.out.println("C02Servlet_Test's SERVICE() invoke... ");
	}

	@Override
	public void destroy() {
		// 내용 변경시 동작하는 함수
		System.out.println("C02Servlet_Test's DESTROY() invoke... ");
	}

}
