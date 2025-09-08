package Ch17;

// 덧셈, 뺄셈, 곱셈, 나눗셈을 수행하는 함수형 인터페이스를 정의
interface Calculator{
	int calculator(int num1, int num2);
	// int calculator(int ...args);
}

public class C03Lambda {

	public static void main(String[] args) {
		
		// 덧셈 calculator add 만들기
		Calculator add = (a,b)->{return a+b;};
		// 뺄셈 calculator sub 만들기
		Calculator sub = (a,b)->{return a>b?a-b:b-a;};
		// 곱셈 calculator mul 만들기
		Calculator mul = (a,b)->{return a*b;};
		// 나눗셈 calculator div 만들기
		Calculator div = (a,b)->{return a>b?a/b:b/a;};
		
		// Calculator add = (args*)->{return "";};
		
		System.out.println(add.calculator(10, 20));
		System.out.println(sub.calculator(10, 20));
		System.out.println(mul.calculator(10, 20));
		System.out.println(div.calculator(10, 20));
		
		// 가변인자 사용
		// System.out.println(add.calculator(10, 20, 10, 50, 60, 70, 80, 90, 100));
		
	}

}
