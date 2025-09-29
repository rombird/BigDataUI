package Ch04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class C03SetMain {

	public static void main(String[] args) {
		
		// SET : 중복 X
		// HashSet : 객체를 구분할 때 사용하는 hashcode 
		
		Set<String> set = new HashSet();
		
		// 추가
		set.add("HTML/CSS/JS");
		set.add("NODEJS");
		set.add("SCSS");
		set.add("REACT");
		set.add("JAVA");	// older
		set.add("JAVA");	// newer(적용 -> 새롭게 들어온걸로 저장됨)
		set.add("JSP/SERVLET");
		set.add("STS");
		set.add("SPRING BOOT");		// older
		set.add("SPRING BOOT");		// newser(적용)
		
		// 삭제
		set.remove("REACT"); 
		
		// 확인
		System.out.println("개수 확인 : " + set.size()); // 7(중복제외)
		
		// 탐색(고전 방법) - Iterator : 기준점을 하나 잡아주고 순서 정함
		Iterator<String> iter = set.iterator(); 
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// 탐색(최근 방법)
		for(String el : set) {
			System.out.println(el);
		}
		
		// 전체 삭제
		set.clear();
	}

}
