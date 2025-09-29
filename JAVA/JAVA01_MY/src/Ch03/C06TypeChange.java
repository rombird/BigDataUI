package Ch03;

public class C06TypeChange {

	public static void main(String[] args) {
		char n1 = 60000; // 양수만 0 ~ 65535까지 
		short n2 = (short)n1; // 리터럴(직접 상수를 대입)을 하면 괜찮음 
		System.out.println(n2); 
		
		int n3 = n2;
		System.out.println(n3);
		
		
		// primitive : c언어에서 물려받은 자료형
		
	}

}
