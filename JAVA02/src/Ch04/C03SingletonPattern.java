package Ch04;

// 

class Company{
	int n1;
	int n2;
	//싱글톤 패턴코드
	private static Company instance;
	private Company() {}; // 외부에서 객체 생성 불가능, 클래스 내부에서만 객체 생성 가능(바깥에서 생성 못하게)
	public static Company getInstance() { 
		// 외부에서 getInstance 라는 함수를 사용하게 되면 클래스 내부적으로 company접근 객체의 위치값을 리턴
		if(instance == null)
			instance = new Company();
		return instance;
		// null이라면 객체를 하나 만들어주는 함수
	}
	
	//toString 재정의
	@Override
	public String toString() {
		return "Company [n1=" + n1 + ", n2=" + n2 + "]";
	}
}


public class C03SingletonPattern {

	public static void main(String[] args) {
		// getInstance 만 접근가능
		// n1, n2에만 접근 가능
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		com1.n1 = 100;
		com2.n2 = 200;
		System.out.println("com1 : "+ com1);
		System.out.println("com2 : "+ com2);
	}

}
