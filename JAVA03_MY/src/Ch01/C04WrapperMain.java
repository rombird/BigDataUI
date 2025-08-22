package Ch01;

public class C04WrapperMain {

	public static void main(String[] args) {
		// Wrapper Class
		// 객체지향에서 원시타입의 자료형이 잘 안될 수 있기 때문에 
		
		//Boxing(기본자료형 -> Wrapper Class)
		Integer ob1 = new Integer(100); // 박싱(래퍼클래스로 만듦)
		Integer ob2 = new Integer("100");
		Integer ob3 = Integer.valueOf("300");
		System.out.println(ob1 + ob2 + ob3); // 500
		
		//UnBoxing
		int n1 = ob1.intValue();
		int n2 = ob2.intValue();
		int n3 = ob3.intValue();
		System.out.println(n1 + n2 + n3); // 500
		
		//Auto Boxing
		Integer ob4 = 100; // 왼쪽과 오른쪽의 자료형이 다르다 integer = int -> 자동형변환됨
		int n4 = ob1 + ob2 + ob3 + ob4;
		System.out.println(n4); //600
		
	}

}
