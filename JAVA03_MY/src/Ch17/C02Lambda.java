package Ch17;

import java.util.Scanner;

interface Printer{
	// 01
	// void print(String name); // 추상메서드(완성되어있지 X) -> 상속관계를 만들어서 하위클래스 작업해야함
	// 02
	// String print(String message); // 반환자료형
	// 03
	String print(); // 반환자료형 O

}

public class C02Lambda {

	public static void main(String[] args) {
		// 01 void -> return 없이도 가능
//		Printer printer = (message)->{System.out.println("01."+message);};
//		printer.print("안녕!");
		
		// 02 반환자료형이 있는 선언문
		// Printer printer2 = (message)->{return "02."+message;};
//		Printer printer2 = message-> "02."+message;
//		String str = printer2.print("HELLO WORLD");
//		System.out.println(str);
		
		// 03
		Printer printer3 = ()->{
			// Scanner 생성
			Scanner sc = new Scanner(System.in);
			// 키보드로 문자열 받기
			String message = sc.nextLine();
			// sc.close(); // 한번쓰고 말거면 닫아주기
			// 입력된값 리턴
			return "03."+message;
		};
		System.out.println(printer3.print());
		
		
		
	}

}
