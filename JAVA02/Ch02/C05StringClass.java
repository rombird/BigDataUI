package Ch02;

public class C05StringClass {

	public static void main(String[] args) {
//		String str1 = "Java Powerful";
//		String str2 = new String("java Programming");
//		String str3 = str1 + str2;
//		String str4 = str1.concat(str2);
		
		// 문자열의 위치값을 확인하기 위한 코드
//		System.out.printf("%x\n",System.identityHashCode(str1));
//		System.out.printf("%x\n",System.identityHashCode(str2));
//		System.out.printf("%x\n",System.identityHashCode(str3));
//		System.out.printf("%x\n",System.identityHashCode(str4));
		
		// str+더해지면 메모리 계속 발생
//		int i=0;
//		String str  = "";
//		while(i<10) {
//			str +=i;
//			System.out.print("str : " + str + " ");
//			System.out.printf("위치 : %x\n",System.identityHashCode(str));
//			i++;
//		}
		
		//문자열 덧붙이기(메모리 누수 방지 클래스 : StringBuffer , StringBuilder)
		// 메모리 같은 공간에 저장(문자열을 덧붙여서 사용해야하는 경우라면 메모리 누수 방지 클래스 사용하기)
//		int i=0;
////		String str  = "";
//		StringBuilder str = new StringBuilder("");
//		while(i<10) {
////			str +=i;
//			str.append(i);
//			System.out.print("str : " + str + " ");
//			System.out.printf("위치 : %x\n",System.identityHashCode(str));
//			i++;
//		}
		
//		System.out.println("문자열 길이 : " + str1.length());
//		System.out.println("한문자 찾기 : " + str1.charAt(2));
//		
//		System.out.println("인덱스 찾기 : " + str1.indexOf('a')); // a를 가지고 있는 인덱스 번호 : 3
//		System.out.println("인덱스 찾기 : " + str1.lastIndexOf('a')); 
//		
//		System.out.println("문자열포함 여부 : " + str1.contains("va"));
//		System.out.println("문자열포함 여부 : " + str1.contains("abs"));
//		
//		System.out.println("문자열 자르기 : " + (str1.substring(2,6))); // 6번 전까지 짤라냄
		
		
		String str6 = "등산,탁구,축구,골프,독서,영화감상";
		String [] result = str6.split(","); // 배열형 참조변수 String이라는 요소요소를 가지는 배열을 가지고 있는 result, 배열은 객체로 인식
		
		for(String hobby : result)
			System.out.println(hobby);
		
	}

}
