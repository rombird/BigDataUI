package Ch01;


class C07Simple{
	
	// ... : 가변인자(여러 인자를 받음) -> 배열형태로 받음
	int sum(int ...arg) {
		System.out.println(arg);
//		System.out.println(arg[0]);
//		System.out.println(arg[1]);
//		System.out.println(arg[2]); // obj.sum(10,20)일때 나올 인덱스가 없으므로 오류 발생
//		System.out.println(arg[3]);
		int s=0;
		for(int item : arg) { // arg요소([] 배열형태로 저장된)를 item 에 넣음
			System.out.println(item);
			s+=item; // 지역변수 s에 item누적 
		}
		return s;
	}
}

public class C07가변인자 {

	public static void main(String[] args) {
		C07Simple obj = new C07Simple();
		obj.sum(10, 20); // class의 sum에 배열의 형태로 저장됨 -> 인덱스번호로 접근도 가능
		

	}

}
