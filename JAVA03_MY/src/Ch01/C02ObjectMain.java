package Ch01;

class C02Simple{
	int n;
	C02Simple(int n){
		this.n=n;
	}
	
	@Override
	public boolean equals(Object obj) { // obj로 어떤 대상을 받는다 == 모든 객체를 다 받아낼수있는 형태로 업캐스팅하겠다
		// C02Simple의 필드에 대한 접근이 불가능
		// obj.n = 100;
		
		// C02Simple인지 판단해서 맞다면 -> 다운캐스팅을 한다.
		if (obj instanceof C02Simple) {
			C02Simple down = (C02Simple)obj; // 다운캐스팅 시도
			return this.n == down.n; // 일치하면 실행됨
		}
		return false; // C02Simple이 아니라면 false
	}
	
}
public class C02ObjectMain {

	public static void main(String[] args) {
		C02Simple ob1 = new C02Simple(10);
		C02Simple ob2 = new C02Simple(10);
		C02Simple ob3 = new C02Simple(20);
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		System.out.println("---");
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
	}

}
