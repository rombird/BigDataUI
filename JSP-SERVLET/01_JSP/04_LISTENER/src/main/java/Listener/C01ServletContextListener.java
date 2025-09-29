package Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//시작되거나 종료될 때 부여하는 초기값들을 지정할 때 사용
@WebListener
public class C01ServletContextListener implements ServletContextListener{
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// 해당 프로젝트가 실행됐을 때 초기값을 넣어야된다면
		System.out.println("[LISTENER] C01ServletContextListener..start...");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// 해당 프로젝트가 종료됐을 때 초기값을 넣어야된다면
		// servlet 모든 파일에서 주석을 달거나 하면 destroyed 작동
		System.out.println("[LISTENER] C01ServletContextListener..end...");
	}

	
	
	
	



	
	
}
