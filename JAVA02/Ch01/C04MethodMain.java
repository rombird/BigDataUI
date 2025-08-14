package Ch01;

import java.util.Scanner;

class MethodTest {
	// 속성
	Scanner sc = new Scanner(System.in);
	// 기능
	public int sum1(int n1, int n2) { // -> 함수헤더
		return n1 + n2; // 반환값
	}
	public int sum2() {
		return sc.nextInt() + sc.nextInt();
	}
	public void sum3(int n1, int n2) {
		System.out.println(n1 + n2);
//		return; // return은 넣어줘도 O but return의 값을 명시하면 X
	}
	public void sum4() {
		System.out.println(sc.nextInt() + sc.nextInt());
	}
}
public class C04MethodMain {

	public static void main(String[] args) {
		MethodTest sumCalc = new MethodTest();
		System.out.println(sumCalc.sum1(10, 20));
		System.out.println(sumCalc.sum2());
		sumCalc.sum3(10,20);
		sumCalc.sum4();
	}

}

