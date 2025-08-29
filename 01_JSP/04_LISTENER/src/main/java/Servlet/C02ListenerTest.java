package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 이 경로에 요청이 들어왔을 때(프로젝트 실행시 app/add로 직접 입장)
@WebServlet(urlPatterns = {"/app/add","/app/replace","/app/remove"})
public class C02ListenerTest extends HttpServlet{
	
	// 다른 위치에 주석 걸어도 내용 변경되면 destory 움직임
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("[SERVLET] C02ListenerTest service");
		String uri = req.getRequestURI();
		if(uri.contains("/app/add")) { 
			req.getServletContext().setAttribute("CTX_KEY", "CTX_VALUE");
			
		}else if(uri.contains("/app/replace")) {
			req.getServletContext().setAttribute("CTX_KEY", "CTX_VALUE_2");
		}else {
			req.getServletContext().removeAttribute("CTX_KEY");
		}
	}
	

	
}
