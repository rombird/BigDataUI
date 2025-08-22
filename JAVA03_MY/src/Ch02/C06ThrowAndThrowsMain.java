package Ch02;

import java.awt.AWTException;

class A{
	public void Ex1() throws NullPointerException{
		System.out.println("A's Ex1 Func call!");
		// 일부러 예외발생하도록
		String a = null;
//		a.toString();
		System.out.println("Ex1에서 실행되어야할 코드");
;	}
}

class B{
	public void Ex2() throws AWTException{
		System.out.println("B's Ex2 Func call!");
		throw new AWTException("AWT 예외발생"); // 예외발생
	}
}

public class C06ThrowAndThrowsMain {

	public static void main(String[] args) {
		// 예외를 한쪽으로 몰아주는 예약어 Throws
		A ob1 = new A();
		B ob2 = new B();
		
		// 예외 자체를 처리하는 경우 (만약 class 안에서 반드시 실행해야하는 코드가있다면 class 안에서 예외처리작업)
		// class A에서 예외처리를 할 수도 있지만 class B에서도 같은 예외가 발생할 경우? 
		// 두번 예외처리를 해야하는 건 비효율적(나눠서 처리하는게 X 메인으로 몰아서 처리)
		// throws NullPointerException 던져주기
		// 
		
		try {
			ob1.Ex1();
			ob2.Ex2();
		}catch(NullPointerException e1) {
			System.out.println("NULL 예외처리!");
		}catch(AWTException e2) {
			System.out.println("AWT 예외처리!");
		}
	}

}
