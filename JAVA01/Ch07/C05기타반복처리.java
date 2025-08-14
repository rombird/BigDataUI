package Ch07;

import java.util.ArrayList;
import java.util.List;

public class C05기타반복처리 {

	public static void main(String[] args) {
		// Collection(자료구조 - list, Map) 객체를 이용 - 저장
		
		// 문자열을 담을 list를 만듦 
		List<String> lists = new ArrayList();
		lists.add("JAVA");		//0 - 인덱스
		lists.add("JSP");		//1
		lists.add("SERVLET");	//2
		lists.add("SPRINGBOOT");
		lists.add("NODEJS");
		lists.add("REACT");
		lists.add("DOCKER_COMPOSE");
		
		// list를 읽는 반복처리 
		// 반복 : 기본 for
//		for(int i=0;i<lists.size();i++) {
//			System.out.println(lists.get(i));
//		}
		
		// 반복 : 개량 for(요소변수:컬렉션)
//		for(String subjects : lists) {
//			System.out.println(subjects);
//		}
		
		// 반복 : 스트림 함수 forEach (스트림을 쓸 쑤 있는 전제조건 - 컬렉션이여야함)
		
		// ()=>{} : 자바스크립트, ()->{} : 자바
		lists.stream().forEach((item)->{System.out.println(item);});
		
		
		
	}

}
