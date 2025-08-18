package Ch04;

class C02Simple{
	static int n1;
	int n2;
	void func1() {
		n1 = 100;
		n2 = 200;
	}
	static void func2() {
		n1 = 300;
//		n2 = 400; // static 주의 : 순서상 static은 애초에 만들어짐
		// func2 객체 생성하지 않더라도 먼저 만들어짐, n2는 객체를 생성했을 때 나오는 개별 공간 
		// -> n2는 아직 만들어지지 않은 곳에 값을 넣겠다고 했기 때문에 문제 발생
		// static 함수에서 사용되는 변수는 static 변수 or 지역변수만 가능(일반멤버변수 사용 X)
	}
}

public class C02StaticMain {

	public static void main(String[] args) {
		

	}

}
