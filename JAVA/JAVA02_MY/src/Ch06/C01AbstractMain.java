package Ch06;



//일반 클래스 상속관계
class Parent{
	void func() {}
}
class Son extends Parent{	 
	void func() {System.out.println("Son's func() call!");}
}
// 추상 클래스 상속관계
// 사용이유 : 매서드 구현의 강제성 부여
// 상위 클래스에서 미완성된 함수를 하위클래스에서 정의
abstract class Parent2{
	abstract void func();	//추상메서드(미완성된 함수, {} 가 없는)
}
class Son2 extends Parent2{
	void func() {System.out.println("Son2's func() call!");} 
}

public class C01AbstractMain {

	public static void main(String[] args) {
		
		//일반 클래스 상속관계
		Parent ob1 = new Parent(); 	//상위클래스형으로 객체 생성 O
		Son ob2 = new Son();		//하위클래스형으로 객체 생성 O
		Parent ob3 = new Son();		//UPCASTING 연결 O
		ob3.func();					//재정의된 func() 접근 O
		
		System.out.println("-----");
		//추상 클래스 상속관계
//		Parent2 obj1 = new Parent2();//추상클래스로 객체 생성 X
		Son2 obj2 = new Son2();		 //하위클래스형으로 객체 생성 O
		Parent2 obj3 = new Son2();	 //UPCASTING 연결 O - 강제로 재정의한 func의 접근 가능
		obj3.func();                 // 상위 클래스형 참조변수로 재정의된 함수 접근 가능
	   	
	}

}





