package Ch06;

import java.util.Scanner;

public class C02SWITCH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ranking = sc.nextInt();
		char medalColor;
		switch (ranking) {
		case 1: 
			medalColor = 'G';
			System.out.println("메달색상 : G");
			break;
		case 2:
			medalColor = 'S';
			System.out.println("메달색상 : S");
			break;
		case 3:
			medalColor = 'B';
			System.out.println("메달색상 : B");
			break;
		default:
			medalColor = 'C';
			System.out.println("메달색상 : C");
		}
		System.out.println(ranking + " 등 메달의 색은 " + medalColor + " 입니다.");
		// if 보다 조건문 제한적 case 에 값은 상수값만 가능
		// break를 주석처리하고 실행 -> 1 입력 -> 모든 case문의 print를 모두 실행 : break문을 적절하게 사용해줘야함
	}

}
