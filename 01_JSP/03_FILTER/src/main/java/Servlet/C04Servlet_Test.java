package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/join.do")
public class C04Servlet_Test extends HttpServlet{
	// doGet, doPost () 메소드 체크
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 페이지 전송 -> forward
		System.out.println("GET /join.do");
		req.getRequestDispatcher("/WEB-INF/join.jsp").forward(req, resp); // 프로젝트 실행시 join.do -> join.jsp로 페이지 이동
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 회원가입 처리
		System.out.println("POST /join.do");
		// 01 파라미터
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		// 02 유효성체크
		if(!isValid(username, password, req)) {
			// ! -> 유효하지 않으면 -> 로그인페이지로 이동함과 동시에 message 전달
			req.getRequestDispatcher("/WEB-INF/join.jsp").forward(req, resp);
			return;
		}
		
		// 03 서비스처리(회원가입처리)
		try {
			// 연결
			DbUtils.conn(); 
			// insert
			int result = DbUtils.insertUser(username, password); // 정수값을 반환 -> 정수값을 통해 값이 잘 들어갔는지 확인
			if(result<=0) {
				// 회원가입에 문제가 있다면 
				req.getRequestDispatcher("/WEB-INF/join.jsp").forward(req, resp);
				return;
			}
			// 자원 제거
			DbUtils.disConn();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		
		// 04 뷰로 이동(뷰로 데이터 전송)
		HttpSession session = req.getSession(); // session이 유지되는 동안(30분)
		session.setAttribute("message", "회원가입 성공!");
		resp.sendRedirect(req.getContextPath() + "/login.do"); // req.getContextPath() : request 내장객체에서 경로 꺼내기, 로그인 페이지로 이동
		
		
	}
	public boolean isValid(String username, String password, HttpServletRequest req) {
		
		boolean flag=true;
		if(username.isEmpty()) {
			req.setAttribute("username_msg", "유저명을 입력하세요");
			flag=false; // 하나라도 문제 생기면 잡아주기
		}
		if(password.isEmpty()) {
			req.setAttribute("password_msg", "패스워드를 입력하세요");
			flag=false;
		}
		return flag; 
	}
	
}
