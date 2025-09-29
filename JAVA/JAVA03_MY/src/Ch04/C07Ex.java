package Ch04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C07Ex {
	
	// 속성
	// value -> Object(모든 클래스의 최상위클래스)로 지정 -> 어떠한 구조든 다 받아내겠다
	static Map<String, Object> map = new HashMap();
	
	// set
	static void setMap(Map<String, Object> param) {
		for(String key : param.keySet()) {
			Object value = param.get(key); 
			System.out.println("KEY : " + key + ", VALUE : " + value);
			map.put(key, value); // 데이터 넣는 작업
		}
	}
	
	// get - map의 자료형 그대로, return map
	static Map<String,Object> getMap(){
		return map;
	}
	
	public static void main(String[] args) {
		// 1 파라미터 생성
		Map<String,Object> params = new HashMap();
		// 2-1 파라미터에 데이터 저장
		String [] values = {"웹디자인기능사", "정보처리기사", "네트워크관리사", "SQLD"}; // 배열에 초기값 넣어놓기
		params.put("자격증", values); // Object이기 때문에 배열도 받아낼 수 있음
//		setMap(params);
		
		// 2-2 파라미터에 데이터 저장
		List<String> values2 = new ArrayList();
		values2.add("등산");
		values2.add("독서");
		values2.add("게임");
		params.put("취미", values2);
		setMap(params);
		
		// 3 저장데이터 확인 - getMap만들어 놓고 확인
		Map<String,Object> mapDatas = getMap();
		for(String key : mapDatas.keySet()) {
			Object value = mapDatas.get(key);
			
			// 2-1 배열인지 확인
			if(value instanceof String[]) {
				String [] arr = (String [])value;
				for(String el : arr) {
					System.out.println("배열 값 확인 : " + el);
				}
			}else if(value instanceof List) {
				System.out.println("K : " + key + " VAL : " + value);
			}
			
			// list
		}
	}

}
