package Ch03;

// 1. 허용할 클래스의 상위 클래스 만듦
class 호빵재료{}

// 2. 허용할 클래스에 상속 지정
class 팥 extends 호빵재료{

	@Override
	public String toString() {
		return "단팥";
	}
	
}
class 슈크림 extends 호빵재료{

	@Override
	public String toString() {
		return "슈크림";
	}
	
}
class 야채 extends 호빵재료{

	@Override
	public String toString() {
		return "야채";
	}
	
}

class 민트초코{

	@Override
	public String toString() {
		return "민트초코";
	}
	
}

// 3. 'extends 호빵재료'로 제한 걸어주기 -> 호빵재료의 상속클래스만 허용
class 호빵<T extends 호빵재료>{
	private T 재료;
	
	public 호빵(T 재료) {
		this.재료 = 재료;
	}
	// toString 재정의

	@Override
	public String toString() {
		return "호빵 [재료=" + 재료 + "]";
	}
	
}
public class C01GenericMain {

	public static void main(String[] args) {
		호빵<팥> ob1 = new 호빵<팥>(new 팥()); // 팥으로 만든 호빵이기 때문에 'new 팥()' 객체 생성 -> T자리에 팥이 들어간다고 생각
		System.out.println(ob1); // 호빵 [재료=단팥]
		
		호빵<슈크림> ob2 = new 호빵<슈크림>(new 슈크림());
		System.out.println(ob2); // 호빵 [재료=슈크림]
		
		호빵<야채> ob3 = new 호빵<야채>(new 야채());
		System.out.println(ob3); // 호빵 [재료=야채]
		
		// 제너릭타입에 들어갈 것을 팥, 슈크림, 야채로 클래스 제한 -> 민트초코 막을 준비
		// 4. 제한을 걸어주면 민트초코 제한됨을 확인
//		호빵<민트초코> ob4 = new 호빵<민트초코>(new 민트초코());
//		System.out.println(ob4); 
		
	}

}
