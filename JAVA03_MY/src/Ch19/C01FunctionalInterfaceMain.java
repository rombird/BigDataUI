package Ch19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 함수형 인터페이스 사용 애노테이션
@FunctionalInterface
interface Func1{
	void say(String message);
}

@FunctionalInterface
interface Func2{
	int sum(Integer ...args); // 가변인자로 내용들 받아오도록
}

@FunctionalInterface
interface Func3{
	List<Integer> sum(Object ...args); // 아무거나 다 받을 수 있도록 가변인자 사용, object 사용 -> list로 반환처리
}

public class C01FunctionalInterfaceMain {
	
	public static void main(String[] args) {
		// 01
		Func1 func1 = (message)->{System.out.println(message+"_!");};
		func1.say("HELLO WORLD"); // HELLO WORLD_!
		
		Func1 func1_2 = System.out::println;
		func1_2.say("HELLO WORLD"); // HELLO WORLD
		
		// 02
		Func2 func2 = (arr)->{
			int sum=0;
			for(Integer n: arr)
				sum+=n;
			return sum;
		};
		System.out.println(func2.sum(10,20,30,40,50,60)); // 210
		
		// 03
		Func3 func3 = (arr)->{
			return Arrays.stream(arr)
//						.filter((obj)->{return obj instanceof Integer;}) // 선별하는 작업 먼저 -> 요소 하나씩 꺼내와서 조건식 활용(들어온 obj가 어떤 형인지) 
						.filter(obj->obj instanceof Integer) // 
//						.map((obj)->{return (Integer)obj;}) // integer 가 맞다면 obj를 integer로 다운캐스팅 
						.map(obj -> (Integer)obj)
 						.collect(Collectors.toList());
		};
		System.out.println(func3.sum(10, 20, 30.5, "홍길동", true)); // [10, 20]
	}
}
