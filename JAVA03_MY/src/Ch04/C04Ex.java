package Ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class C04Ex {

	public static void main(String[] args) {
		// 1) 1 ~ 45까지 숫자를 6개를 랜덤으로 받아(Random클래스를 이용) set에 저장/출력
		
//		Set<Integer> set = new HashSet();
//		
//		// set저장 -> 6개 랜덤 지정 어떻게 하지??? -> set.size() 
//		while(set.size()<6) {
//			Random rd = new Random();
//			int rdint = rd.nextInt(46);
//			set.add(rdint);
//		}
//		
//		for(Integer el : set) {
//			System.out.println(el);
//		}
		
		// 선생님
		Set<Integer> set = new HashSet();
		Random rnd = new Random();
		while(set.size()<6) {
			set.add(rnd.nextInt(45)+1);
		}
		for(Integer el : set)
			System.out.print(el + " ");
		System.out.println();
		
		// 2) [추가]저장된 set의 오름차순정렬을 해보세요(검색을 통해서 해결해봅니다 - 스트림함수 사용)
		// sorted()는 중간 연산자로 스트림 파이프라인을 구성하여 다른 중간연산자들과 함께 사용
//		List<Integer> sortedSet = set.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedSet);
		
		// 2-1) 선생님
//		List<Integer> list = set.stream().sorted().collect(Collectors.toList()); // collect(Collectors.toList()) : 내가 원하는 형태로 반환받을 수 있음
//		list.stream().forEach(System.out::println);
		
		// 2-2) 선생님
		List<Integer> list = new ArrayList(set);
		Collections.sort(list); // 기본 오름차순 정렬
		list.stream().forEach(System.out::println);
	}

}
