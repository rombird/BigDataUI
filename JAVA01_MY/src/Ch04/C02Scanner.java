package Ch04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : " + num1);
		
		System.out.print("실수 입력 : ");
		double num2 = sc.nextDouble();
		System.out.println("입력된 실수 값 : " + num2);
		
		System.out.print("문자열 입력 : ");
		sc.nextLine();
		String str1 = sc.nextLine(); // 문자열 입력받기 기능함수, 띄어쓰기는 포함
//		String str1 = sc.next(); // 문자열 입력받기 기능함수, 띄어쓰기는 포함하지 X -> 문자열 입력시 띄어쓰기를 하면 띄어쓰기 전가지만 인식
		System.out.println("입력된 문자열 : " + str1);
		// nextLine()을 쓸꺼면 하나만 쓰고 섞어서 사용시에는 sc.nextLine(); 한번 더 넣어서 쓰기(엔터키를 잡아냄) 초기화하는 작업이라고 생각
		// -> 엔터키도 값이라고 생각하고 받아온다. 
		sc.close();
		
	}

}
