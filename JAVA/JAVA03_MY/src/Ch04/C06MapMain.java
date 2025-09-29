package Ch04;

import java.util.HashMap;
import java.util.Map;

public class C06MapMain {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap();
		
		// 추가 - key(중복X- 유일한값만 지정(set형태로 지정)), value
		map.put("aaa", 1111); 
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("ddd", 4444); 	// older가 삭제
		map.put("ddd", 5555);	// newer 가 적용
		
		// 확인 - map.keySet() 모든 키를 set의 형태로 가져온 다음에 
		for(String key : map.keySet()) { // : map에서 모든 키를 가져오겠다
			System.out.println("KEY : " + key + " VALUE : " + map.get(key));
		}
		
		// 삭제
		map.remove("aaa");
		
		// 확인
		System.out.println("SIZE : " + map.size()); 
		System.out.println("단건 : " + map.get("bbb")); 
	}

}
