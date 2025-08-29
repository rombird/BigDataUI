package Listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

// 속석값이 추가, 삭제, 수정 될때 작동
// C02ListenerTest에서 추가, 삭제, 수정되면 이 파일에있는 각각의 함수에 따라 콘솔창에 표시
@WebListener
public class C02ServletContextAttributeListener implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("[LISTENER] C02ServletContextAttributeListener add()..");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("[LISTENER] C02ServletContextAttributeListener remove()..");
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("[LISTENER] C02ServletContextAttributeListener replace()..");
	}
		

}