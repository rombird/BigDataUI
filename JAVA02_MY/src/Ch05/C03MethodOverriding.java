package Ch05;


// 함수재정의(Method Overriding)
// 상속관계를 전제로 상위클래스의 메서드를 하위클래스가 재정의(고쳐사용)하는 것을 허용한 문법
// 메서드의 헤더부분은 동일하고 두고 본체({})의 로직을 수정하게끔 허용함으로 다양한 형태의 객체가
// 형성될 수 있도록 유도(다형성)
// 상위클래스로부터 동일한 메서드를 물려받더라도 각 하위클래스마다 다른 기능구현의 결과물을 만들어낼 수 있다.

// 오버로딩 VS 오버라이딩
// 오버로딩 : 상속전제X, 함수헤더변경(함수이름중복허용, 파라미터는 다양하게 허용)
// -> 개발자의 편의성에 중점(함수이름 단일화)

// 오버라이딩 : 상속전제O, 함수본문변경(함수헤더고정), 다형성을 목적으로한 문법요소

class Animal{
	void Sound() {System.out.println("소리낸다...");}
	
}
class Dog extends Animal{
	void Sound() {System.out.println("멍멍!");} // 함수의 헤더는 건들지 않고 재정의
}

class Cat extends Animal{
	// source -> Override/Implement Methods...
	@Override
	void Sound() {
		System.out.println("야옹!");
	}
	
}

public class C03MethodOverriding {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.Sound();
		
		Dog dog = new Dog();
		dog.Sound();
		
		Cat cat = new Cat();
		cat.Sound();     
		
		System.out.println("-------------------");
		animal = dog; // 상위클래스형 참조변수 = 하위객체 -> upcasting(자동형변환- 왼쪽의 자료형으로)
		animal.Sound(); // 멍멍! - 상위클래스에 sound 메서드가 선언이되어야 사용가능
		animal = cat;
		animal.Sound(); // 야옹!
	}

}
