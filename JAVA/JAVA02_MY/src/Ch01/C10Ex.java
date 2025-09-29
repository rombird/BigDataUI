package Ch01;


class Person{
	private String name;
	private int age;
	
	// 모든인자 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// toString
	@Override
	public String toString() {
		return "Peron [name=" + name + ", age=" + age + "]";
	}
	
}


public class C10Ex {
	
	// 객체 생성없이 바로 사용하기 위해 public static으로 만듦
	public static void func1(int num) { // 파라미터 : primitive원시값이기때문에 (데이터값 저장)
		System.out.println(num);
	}
	public static void func2(Object obj) { // 파라미터 : Reference(주소값 저장) 참조, 데이터는 다른데 있고 그 위치값이 저장
		System.out.println(obj);
	}
	
	public static Object func3(String name, int age) {
		return new Person(name, age); // 만들어진 건 하위객체 던진건 상위클래스로 던지고 있음 -> 업캐스팅
	}
	
	public static void main(String[] args) {
		func1(10);
		func2(new Person("홍길동", 10));
//		Person a = new Person("",10));
		Object ob = func3("티모", 100); // 주소를 전달 
	}

}


// Stack					                 Heap									Class==Method==공유메모리
// C10Ex Main Stack 														C10Ex func1(int num)
// func1(10) 전달 (잠깐 상수풀에 있다감) ---------------------------------> 		10이라는 인자를 전달하면 해당함수를 처리하는 과정에서 보관(콘솔창에 내용 출력 - System.out.println(num) 
// func1(10)				<---------------------------------------		더이상 할 게 없으면 호출했던 위치로 돌아감 (반환)
// func2(new Person("홍길동", 10))											C10Ex func2(Object obj) : *(참조변수 표현)- 위치값을 받는 용도
// 100번지에 들어감						Person객체(저장위치 100번지라 치면) 			100번지 들어감
//									name : 홍길동
// 									age : 10
// 									toString 재정의 -> 재정의된 toString을 사용하게됨
//									toString 재정의 X -> 위치값 반환

// 	Object ob = func3("티모", 100);											C10Ex Object Func3(String name, int age) 
//																			return new Person(name, age)
//									name : 티모								200번지로 반환 / 실제 객체는 Person이지만 Object형
//									age : 10
//									200번지라고 치면	




