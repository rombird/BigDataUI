package Ch03;

public class C07TypeChange_String {

	public static void main(String[] args) {
		
		// 문자열 + 문자열
//		System.out.println("문자열1" + "문자열2"); 		// 문자열1문자열2 : 문자열 + 문자열
//		System.out.println("문자열1" + ',' +"문자열2"); // 문자열1,문자열2 : 문자열 + 문자 + 문자열
//		System.out.println("문자열1" + 2);			// 문자열12 : 문자열 + 숫자 -> 숫자를 문자열로 해석! 단순연결
//		System.out.println("문자열"+','+'!');			// 문자열,!
//		System.out.println(','+'!'+"문자열");			// 77문자열 : 단일문자 숫자로 생각 
//		System.out.println("" + ','+'!'+"문자열");	// ,!문자열
//		System.out.println("문자열1"+"문자열2");		// 문자열1문자열2
	
		
		// 문자열 -> 숫자형 변환(정수)
		// int n1="10";
		
		System.out.println("10"+"20");  	// 1020 : 문자열 연결
		
		// Interger.parseInt() -> 문자열에 갇혀져 있는 정수를 int형으로 바꿔줌
		int n1 = Integer.parseInt("10");	// 웹개발코드시 폼으로부터 전달받은 값은 다 문자열임
		int n2 = Integer.parseInt("20"); 
		System.out.println(n1 + n2);		// 30
		
		// 문자열 -> 숫자형으로 변환(실수)
		double n3 = Double.parseDouble("10.5");
		double n4 = Double.parseDouble("20.4");
		System.out.println(n3+n4);					// 30.9
		
		short n5 = Short.parseShort("5");	
		short n6 = Short.parseShort("6");	
		System.out.println(n5+n6); 			// 11
	}

}
