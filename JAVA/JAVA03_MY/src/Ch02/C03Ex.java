package Ch02;

import java.util.Scanner;

public class C03Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.print("나눗셈을 위한 두값을 입력하세요 : ");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println("나눗셈 결과 : " + n1/n2); // N/0시 예외발생
		}catch(ArithmeticException e) {
			System.out.println("예외발생");
		}

		System.out.println("실행되어야할 코드1");
		System.out.println("실행되어야할 코드2");
		System.out.println("프로그램 종료");
	}

}
