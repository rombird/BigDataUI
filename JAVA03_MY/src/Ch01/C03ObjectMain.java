package Ch01;

import java.util.Objects;

class C03Simple{
	int n;
	C03Simple(int n){
		this.n=n;
	}
	
	// equals를 재정의하는 경우 hashcode도 같이 재정의해줘야함!
	@Override
	public boolean equals(Object obj) { // obj로 어떤 대상을 받는다 == 모든 객체를 다 받아낼수있는 형태로 업캐스팅하겠다
		
		if (obj instanceof C02Simple) {
			C03Simple down = (C03Simple)obj; // 다운캐스팅 시도
			return this.n == down.n; // 일치하면 실행됨
		}
		return false;
	}
	
	// source -> Override/Implement Methods... -> hashcode 쳌
	// hash 처리 한다는 것은 보안 위험상 외부적으로 노출되지 않도록 재정의한다는 것
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return Objects.hash(this.n); // 저장된 값은 10인데 알 수 없는 다른값으로 교체해서 전달됨 
//	}
	
}
public class C03ObjectMain {

	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple(10);
		System.out.println(ob1.toString()); // Ch01.C03Simple@5305068a <- obj에서 정의한 걸 사용 (재정의하기 전) //Ch01.C03Simple@29 
		System.out.printf("%x \n", ob1.hashCode()); // 5305068a // 29
	}

}
