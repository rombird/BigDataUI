package Ch01;

// 변수종류

// 멤버변수 		: 클래스 내부 - 메서드 영역 외부 사이, 객체 개별데이터 저장용도
// 지역 변수		: 메서드 영역 내부에서 생성되는 변수
// 				(or 메서드 영역 내부에서 {}가 명시되어있을 때 해당 {}내에서 생성되는 변수도 포함)
//				ex. 파라미터 변수, 일반변수...
// Static 변수	: 동일 클래스로부터 생성된 여러 객체간 공유하는 멤버변수 -> 많이 사용됨 중요*******

class C05Simple{
	// 속성
	int num = 10; // 멤버변수 - 해당클래스내에서는 모든 함수에서 사용가능함
	
	// 기능 - 메서드
	void Func1() {
		System.out.println("num : " + num);
		int num=20; // Func1의 지역변수
		num++;
		this.num++; // 멤버변수에 접근하고 싶을 때는 this 넣어주기 
		System.out.println("num : " + num);
	}
	void Func2() {
		System.out.println("num : " + num);
		if(num>0) { // 멤버변수 num
			int num =100; // if문 내의 지역변수 num
			System.out.println("num : " + num); // if문 내의 num이 출력됨
		}
		System.out.println("num : " + num); // 중괄호를 벗어났을 때 자연스럽게 메모리 반환 다시 멤버변수 num이 출력됨
		
		while(num<15) {
			int num = 100; // 함수 안에서 사용하는 num 
			System.out.println("num : " + num); 
			num++;
		}
		
	}
	//
	void Func3(int num) {
		this.num = num; // 멤버변수에 num을 넣을때 꼭 this로 접근
		
	}
	
}

public class C05LocalVarMain {

	public static void main(String[] args) {
		// main 안에 있는 변수는 지역변수
		
		C05Simple obj = new C05Simple();
		obj.Func1(); 
		System.out.println("-----------");
		obj.Func2();
	}

}
