package Ch19;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//제공되는 함수형 인터페이스들
//Function<T, R>:
//apply 메서드를 가지고 있어서 하나의 인자(T)를 받아서 결과(R)를 반환하는 함수형 인터페이스 입니다.

//Supplier<T>:
//get 메서드를 가지고 있어서 어떠한 인자도 받지 않고 결과만을 제공하는 함수형 인터페이스 입니다.
//
//Consumer<T>:
//accept 메서드를 가지고 있어서 어떠한 인자를 받아서 결과를 반환하지 않는 함수형 인터페이스 입니다.
//
//Predicate<T>:
//test 메서드를 가지고 있어서 어떠한 인자를 받아서 불리언 결과를 반환하는 함수형 인터페이스 입니다.
//
//UnaryOperator<T>:
//apply 메서드를 가지고 있어서 하나의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.
//
//BinaryOperator<T>:
//apply 메서드를 가지고 있어서 두 개의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.

public class C03FunctionalInterfaceMain {
	// 01
	public static Function<Integer, Integer> func1 = x->x*x; // Integer를 받아서 Integer로 반환, (x)->{return x*x;}; 
	
	// 02
	public static Function<Integer, Integer> func2 = x->x+x;
	
	// 03 // x.stream().reduce(누적변수 초기값, (누적변수, 요소변수)->{return 누적연산;}) // (x)->{return x.stream().reduce(0, (sum, el)->{return sum+el;});};
	public static Function<List<Integer>, Integer> func3 = x->x.stream().reduce(0, (sum, el)->{return sum+el;}); // 한줄로 끝나면 축약 가능 
	
	// 04
	public static Function<List<Object>, Integer> func4 = (li)->{
		// 1 List의 각 요소 중 Integer만 filter
		// 2 필터링된 Integer의 재구성(map)
		// 3 누적합(reduce)
		
		return li.stream()
			.filter((el)->{return el instanceof Integer;}) // 정수형만 다음으로 넘어오게 됨
			.map((el)->{return (Integer)el;})
			.reduce(0, (sum, el)->{return sum+el;});
		};
		
	// 05 들어오는 여러 데이터 형태들 중에 문자열만 추출해서 작업
	public static Function<List<Object>, List<String>> func5 = (li)->{
		return li.stream()
			.filter((el)->{return el instanceof String;}) // String만 선별
			.map((el)->{return "- " + (String)el + " -";})
			.collect(Collectors.toList()); // 리스트형으로 반환 
	};
			
	// 06 func1의 반환값이 func2로 전달 (func1과 func2 연결)
	public static Function<Integer, Integer> func6 = func1.andThen(func2);
	
	// 07 // func3의 인자는 List<Integer>이기 때문에 인자 동일하게 맞춰줌
	public static Function<List<Integer>, Integer> func7 = func3.andThen(func2).andThen(func1);
	
	// 08 반환자료형을 함수형 인터페이스로 구성
	public static Function<Integer, Function<Integer, Integer>> func8 = (x)->{
		// 전달받은 x
		System.out.println("func8 x : " + x); 
		return (n)->{
			// 
			System.out.println("func8 n : " + n);
			return n+x;
		};
	};
	
	// 09 8번에서 실행 구조를 확인했으니 축약해서 사용
	public static Function<Integer, Function<Integer, Integer>> func9 = x->y->x+y; // 첫번째 apply를 쓰면 x값이 받을 테고 두번 째 apply를 쓰면 y값이 받고(이 때 x는 받은 값유지)
	
	public static void main(String[] args) {
		
		System.out.println(func1.apply(10)); // 100
		 
		System.out.println(func2.apply(10)); // 20
		
		System.out.println(func3.apply(Arrays.asList(10, 20, 30, 40))); // 100 - 리스트로 자료를 받기로 했기 때문에 Arrays.aslist로
		
		System.out.println(func4.apply(Arrays.asList(11, 10.5, "Test", true, new StringBuffer(), 20, 40))); // 71
		
		System.out.println(func5.apply(Arrays.asList("10", 55,70, "HELLO", false, "world"))); // [- 10 -, - HELLO -, - world -]
		
		System.out.println(func6.apply(10)); // 200
		
		// - 누적합이 곱셈처리 후 또 더해짐
		System.out.println(func7.apply(Arrays.asList(10, 20, 30, 40))); // 40000
		
		System.out.println(func8.apply(10).apply(20)); // apply(10)만 했을 때 함수의 위치정보 리턴, apply(20)과 같이 하면 20이 n에 전달되어서 확인 가능
		// func8 x : 10
		// func8 n : 20
		// 30 (return n+x)
		
		System.out.println(func9.apply(10).apply(20)); // 30
	}

}
