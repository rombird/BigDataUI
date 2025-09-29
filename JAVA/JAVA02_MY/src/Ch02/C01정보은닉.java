package Ch02;

// 접근 한정자
// 멤버 클래스의 접근범위를 제한을 위한 예약어
// public 		: 모든 클래스에서 접근 가능
// private 		: 해당 클래스에서만 접근가능
// protected 	: 상속 관계를 가지는 경우에 접근 가능
// default(기본) 	: 동일 패키지에 속한 클래스에서 접근가능

class C01Person{
	
	// 속성
	String name;
	private int age;
	private String addr;
	
	
	// 기능
	
	// setter 함수(기존데이터 수정) -private로 잠겨있는 변수 관련 --> 함수명 생성 set생성한변수명(생성한 변수와 자료형 일치시킴)
	public void setAge(int age) {
		this.age = age;
	}
	// getter 함수(데이터를 외부로 반환) - return을 해줘야 하는 함수
	public int getAge() {
		return this.age;
	}
	
	// addr private 걸어놓고 
	// source -> Generate Getter and Setter -> addr 체크 
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	// 디폴트 생성자
	public C01Person() {}
	// 모든 인자 생성자
	public C01Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	// toString 재정의
	@Override
	public String toString() {
		return "C01Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}


	
}

public class C01정보은닉 {

	public static void main(String[] args) {
		C01Person person1 = new C01Person("홍길동",55,"대구"); // C01Person 클래스에서 생성한 것을 C01정보은닉 클래스에서 호출
		// person1.하면 C01Person에서 생성한 필드를 확인할 수 있는데 private를 걸어두면 정보가 숨겨짐
		// private한 필드에 대해 
		person1.setAge(33); // setter함수를 사용해서 private한 필드에 대해 값 변경 가능
		System.out.println(person1.getAge()); // 33
	}

}
