package Ch03;

class C04Person{
	String name;
	int age;
	// 디폴트 생성자
	C04Person(){}
	
	// 모든인자 생성자(source -> )
	public C04Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	// toString 재정의(source -> )
	@Override
	public String toString() {
		return "C04Person [name=" + name + ", age=" + age + "]";
	}
	
	
}


public class C04ClassArrayMain {

	public static void main(String[] args) {
		C04Person list[] = new C04Person[3];
		// 각 객체를 연결해줄 수 있는 참조변수형 배열이다.
		list[0] = new C04Person(); // 객체 연결을 먼저 해줘야 연결이 됨
		list[0].name = "홍길동";
		list[0].age = 55;
		System.out.println(list[0]);
		// 30번째 입력 안하고 name, age 값을 넣었을 때 오류 발생 
		// -> 객체 연결이 안되어있는 상태에서 값을 바로 입력했기 때문
		
		list[1] = new C04Person();
		list[1].name="김영희";
		list[1].age=35;
		
		list[2] = new C04Person();
		list[2].name="김범수";
		list[2].age=40;
		
		for(C04Person person : list)
			System.out.println(person);
	}

}
