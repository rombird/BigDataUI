package Ch02;

// this
// 클래스 내에서 사용되는 예약어
// 생성되는 객체의 위치정보(메모리주소 - 해시코드값)을 확인하는데 사용

// this : 멤버변수와 지역변수 구별에 사용
// this : 다른 생성자 호출 사용

class C03Simple{
	// 속성
	int x;
	int y;
	
	// 생성자
	C03Simple(){
		this(0,0); // C03Simple(int x, int y)를 불러서 다시 돌아와서 System.out.println 출력
		System.out.println("C03Simple() 호출");
	}
	C03Simple(int x){
//		this.x = x;
		this(x, 0); // 생성자를 몰아줄수있음
		System.out.println("C03Simple(int x) 호출");
	}
	C03Simple(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("C03Simple(int x, int y) 호출");
	}
	
	
	// 기능
	public C03Simple getThis() {
		return this;
	}
}

public class C03This {

	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple(100);
//		System.out.println(ob1); 			// Ch02.C03Simple@5305068a  <- 패키지명.클래스명@해시코드(위치값)
//		System.out.println(ob1.getThis());  // 생성된 객체의 위치정보
//		
//		C03Simple ob2 = new C03Simple();
//		System.out.println(ob2); 			// Ch02.C03Simple@1f32e575
//		System.out.println(ob2.getThis());  // Ch02.C03Simple@1f32e575
		
		
		// 생성자 만들고 난 후 작업
		
		
	}

}
