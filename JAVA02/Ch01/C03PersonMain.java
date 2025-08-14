package Ch01;

class C03Person {
	// 속성 					
	public String name; 
	public int age; 
	public float height; 
	public double weight; 
	
	// 기능
	// void - return은 되나 return값이 없음(반환값이 없음)
	// this - 생성된 객체
	void talk() {System.out.printf("%s님이 말합니다.\n",  this.name);}
	void walk() {System.out.printf("%s님이 걷습니다.\n", this.name);}
	void showInfo() {
		System.out.printf("%s %d %f %f\n", this.name, this.age, this.height, this.weight);
	}
	//toString() 
	// C03Person 클래스 안에서 마우스우클릭 -> 'source' -> 'generate toString'
	@Override
	public String toString() {
		return "C03Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
}


// Main과 또다른 class를 둘 수 있음
public class C03PersonMain {

	public static void main(String[] args) {
		C03Person hong = new C03Person();
		// 속성 저장
		hong.name="홍길동";
		hong.age=15;
		hong.height=177.5f;
		hong.weight=70.5;
		
		// 기능
		hong.talk();
		hong.walk();
		hong.showInfo();
		
		//toString을 사용하기 위해
//		System.out.println(hong.toString());
		System.out.println(hong); // 상속파트에서 다시봄 -> toString을 재정의하는 순간 상속되기때문에 이름으로 접근 가능
		
//		System.out.printf("%s %d %f %f\n", hong.name, hong.age, hong.height, hong.weight);
		
		
	}

}
