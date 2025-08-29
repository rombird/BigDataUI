package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login.do")
public class C05Servlet_Test extends HttpServlet {
	// doGet, doPost () 메소드 체크

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 페이지 전송 -> forward
		System.out.println("GET /login.do");
		// session 종료하기 위한 작업
		HttpSession session = req.getSession();
		if(session.getAttribute("message")!=null) {
			// session에서 message의 내용이 있는지 확인해서 내용이 있다면
			String message = (String)session.getAttribute("message");
			session.removeAttribute("message");
			
			req.setAttribute("message", message);
		}
		// 프로젝트 실행시 join.do -> join.jsp로 페이지 이동
		req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp); 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 회원가입 처리
		System.out.println("POST /login.do..");
		// 01 파라미터
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		// 02 유효성체크
		if(!isValid(username, password, req)) {
			req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
			return;
		}
		
		// 03 서비스처리(로그인처리)
		
		try {
			// 연결
			DbUtils.conn(); 
			// 사용자 ID 확인
			UserDto dto = DbUtils.selectUser(username); // username과 동일한 dto가 있는지 확인하기 위해
			if(dto==null) { // dto에 username이 없다면
				req.setAttribute("message", "동일한 계정이 존재하지 않습니다");
				req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
				return;
			}
			// 입력한 PW 대조
			if(!password.equals(dto.getPassword())) {
				// 일치하지 않는다면 로그인 페이지로 이동시켜서 
				req.setAttribute("message", "패스워드가 일치하지 않습니다");
				req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
				return;
			}
			// 자원 제거
			DbUtils.disConn();
			
			// 인증완료 정보 + ROLE 저장 - SESSION기반
			HttpSession session = req.getSession();
			session.setAttribute("username", username); // password는 노출되면 X 
			session.setAttribute("isAuth", true);
			session.setAttribute("role", "ROLE_USER");
			
			// 뷰로 이동
			session.setAttribute("message", "로그인 성공!"); 
			resp.sendRedirect(req.getContextPath() + "/main.do"); // 프로젝트명 + main.do로 이동
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		
		// 04 뷰로 이동(뷰로 데이터 전송)
		
		
	}

	public boolean isValid(String username, String password, HttpServletRequest req) {

		boolean flag = true;
		if (username.isEmpty()) {
			req.setAttribute("username_msg", "유저명을 입력하세요");
			flag = false; // 하나라도 문제 생기면 잡아주기
		}
		if (password.isEmpty()) {
			req.setAttribute("password_msg", "패스워드를 입력하세요");
			flag = false;
		}
		return flag;
	}

}
