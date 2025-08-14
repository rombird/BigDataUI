package Ch01;

import java.util.Scanner;

class C06Simple {
	// 속성
	
	// 기능
	public int sum(int n1, int n2) { 
		System.out.println("sum1(int n1, int n2)");
		return n1 + n2; 
	}
	public int sum(int n1, int n2, int n3) { 
		System.out.println("sum2(int n1, int n2, int n3) ");
		return n1 + n2 + n3; 
	}
	public int sum(int n1, int n2, int n3, int n4) { 
		System.out.println("sum3(int n1, int n2, int n3, int n4)");
		return n1 + n2 + n3 + n4; 
	}

}

// 중요한 개념, 실제 많이 사용됨 
// 같은 이름의 메서드를 매개변수의 개수 또는 타입만 다르게 하여 여러개 정의하는 것 - 함수 헤더만 조정해서 바꾸는 것, 함수파라미터 다양(자료형도 다양하게 가능?), 반환자료형 고정!!!!!!
// 함수 이름은 동일(sum으로 동일하게 바꿈), 파라미터 수에 따라 같은 이름이지만 다른 함수 적용
public class C06MethodOverloadingMain {

	public static void main(String[] args) {
		C06Simple obj = new C06Simple();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
		obj.sum(10, 20, 30, 40);

	}

}
