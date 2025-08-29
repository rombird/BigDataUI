package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// DB에 회원가입된 정보 저장시 한글도 인식될 수 있도록
public class UTF8_EncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		req.setCharacterEncoding("UTF-8"); // 요청
		System.out.println("[FILTER] UTF8 ENCONDING FILTER START ...");
		
		chain.doFilter(req, resp);
		
		resp.setContentType("text/html; charset=UTF-8"); // 응답
		System.out.println("[FILTER] UTF8 ENCONDING FILTER END ...");
	}

	
	
}
