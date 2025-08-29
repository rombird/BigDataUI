package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/main.do")
public class C03Servlet_Test extends HttpServlet{
	// source -> override -> doget() 메소드 체크
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET / main.do... ");
		
		HttpSession session = req.getSession();
		if(session.getAttribute("message")!=null) {
			// session에서 message의 내용이 있는지 확인해서 내용이 있다면
			String message = (String)session.getAttribute("message");
			session.removeAttribute("message");
			
			req.setAttribute("message", message);
		}
		
		// 외부에서 요청이 들어오면 main.jsp와 연결
		req.getRequestDispatcher("/WEB-INF/main.jsp").forward(req, resp);
	}
	
}
